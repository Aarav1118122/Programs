import React, { useState, useEffect } from "react";
import { Editor } from "@tinymce/tinymce-react";

export default function Notes() {
    const toolbarButtons =
        "save cancel | undo redo | formatselect | fontselect fontsizeselect | bold italic underline strikethrough | subscript superscript | forecolor backcolor | alignleft aligncenter alignright alignjustify | outdent indent | removeformat ";
    const saveDocument = () => {};
    const [value, setValue] = useState("");
    useEffect(() => {
        console.log(value);
    }, [value]);
    return (
        <div className="dashboard__editor">
            <Editor
                init={{
                    // inline: true,
                    height: "100%",
                    width: "100%",
                    menubar: true,
                    toolbar_mode: "wrap",
                    plugins: [
                        "advlist autolink lists link image charmap print preview anchor",
                        "searchreplace visualblocks code fullscreen",
                        "insertdatetime media table paste code help wordcount save",
                    ],
                    toolbar: toolbarButtons,
                    content_style:
                        "body { font-family:Helvetica,Arial,sans-serif; font-size:14px }",
                    save_onsavecallback: saveDocument,
                }}
                onEditorChange={(newValue, editor) => setValue(newValue)}
            />
        </div>
    );
}
