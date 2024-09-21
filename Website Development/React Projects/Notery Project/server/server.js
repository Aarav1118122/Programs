// require all the dependencies
const express = require("express");
const app = express();
const cors = require("cors");
const bcrypt = require("bcrypt");
const expressSession = require("express-session");
const bodyParser = require("body-parser");
const cookieParser = require("cookie-parser");
const mongoose = require("mongoose");

mongoose.connect("mongodb://localhost/logindb", () => {
    console.log("database connected");
});
const usersLogin = require("./UsersLogin");

app.use(express.json());

app.use(
    cors({
        origin: "http://localhost:3000",
        methods: ["GET", "POST", "DELETE"],
        credentials: true,
    })
);

//used for cookies
app.use(cookieParser());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(
    expressSession({
        key: "loginCookie",
        secret: "temporarySecret", // this is a temporary secret and will be replaced later
        resave: false,
        saveUninitialized: false,
        cookie: {
            expires: 1000 * 60 * 60 * 48, // 2 days in milliseconds
        },
    })
);

app.get("/login", (req, res) => {
    if (req.session.user != null) {
        res.send({ loggedIn: true, username: req.session.user.username });
    } else {
        res.send({ loggedIn: false });
    }
});
app.post("/login", async (req, res) => {
    const email = req.body.email;
    const password = req.body.password;
    const dbEmail = await usersLogin.findOne({ email: email });
    if (dbEmail !== null) {
        const dbUser = await usersLogin.findOne({ email: email });
        const dbPassword = dbUser.password;
        if (await bcrypt.compare(password, dbPassword)) {
            req.session.user = dbUser;
            res.send({
                username: dbUser.username,
                message: "user logged in",
            });
        } else {
            res.send({ message: " Wrong password" });
        }
    } else {
        res.send({ message: "User does not exist" });
    }
});

app.post("/sign-up", async (req, res) => {
    const email = req.body.email;
    const username = req.body.username;
    const password = req.body.password;
    const hashedPassword = await bcrypt.hash(password, 10);
    if ((await usersLogin.find({ email: email })).length > 0) {
        res.send({ message: "user is already signed up" });
    } else {
        await usersLogin.create({
            email: email,
            username: username,
            password: hashedPassword,
        });
    }
});

app.get("/sign-up", async (req, res) => {
    res.send(await usersLogin.find());
});

app.delete("/app", (req, res) => {
    req.session.destroy();
    res.send();
});

// testdeletedb();

//this is a temporary function to clear the database
async function testdeletedb() {
    await usersLogin.deleteMany();
    console.log(await usersLogin.find());
}

app.listen(3001, () => {
    console.log("server connected");
});
