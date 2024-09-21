var addRowBtntop=400;
var IdNumber=0;
function toggle_sidebar_on() {
	document.getElementById('sidebar').style.left='0px';
	document.getElementById('menu-btn').style.left='-10000px';
	document.getElementById('main').style.left='20px';
}
function toggle_sidebar_off() {
	document.getElementById('sidebar').style.left='-150px';
	document.getElementById('menu-btn').style.left='20px';
	document.getElementById('main').style.left='-80px';	
}
function add_row() {
	var parentTable=event.target.parentElement.querySelector(".dashboard_table");
	document.getElementById(parentTable.id).insertRow(-1).innerHTML=`
		<td>
			<input type="Text" class="table-item todo">
		</td>
		<td>	
			<div id="due_date">
				<input type="Date" class="table-item due-date" id="due_date" oninput="	timeleft()">
			</div>
		</td>
		<td>	
			<input type="Date" class="table-item Entering-data">
		</td>
		<td>
			<input type="number" class="table-item time_left">
		</td>
		<td>
			<div class="priority">
				<div class="rate">
					<input type="radio" id="star5" name="rate"value="5">
					<label for="star5" title="text">&#9733;</label>
					<input type="radio" id="star4" name="rate" value="4"/>
					<label for="star4" title="text">&#9733;</label>
					<input type="radio" id="star3" name="rate" value="3"/>
					<label for="star3" title="text">&#9733;</label>
					<input type="radio" id="star2" name="rate" value="2"/>
					<label for="star2" title="text">&#9733;</label>
					<input type="radio" id="star1" name="rate" value="1"/>
					<label for="star1" title="text">&#9733;</label>
				</div>
			</div>
		</td>
		<td>
			<select class="table-status">
				<option id="done">
					Done
				</option>
				<option id="working">
					Working
				</option>
				<option id="stuck">
					Pending
				</option>
			</select>
		</td>
		<td>
			<input type="Text" class="table-item Comments">
		</td>
		<td>
			<button class="table-items delete_row" onclick="deleterow()">
				&#10006
			</button>
		</td>`
	addRowBtntop+=51;
	var addRowBtn=event.target;
	document.getElementById(addRowBtn.id).style.top=addRowBtntop+'px';
	var dashboard=addRowBtn.closest(".dashboard");
	var deleteRowBtn=dashboard.querySelector(".delete_table-btn");
	deleteRowBtn.style.top=addRowBtntop+'px';
	i++;
}
function deleterow() {
	parentRow=event.target.parentElement.parentElement;
	parentRow.remove();
	addRowBtntop-=51;
	var dashboard=event.parentRow.closest(".dashboard");
	var deleteRowBtn=dashboard.querySelector(".delete_table-btn");
	deleteRowBtn.style.top=addRowBtntop+'px';
}
function add_table() {
	IdNumber++;
	var tableContainer=document.createElement("li");
	tableContainer.className+="table_container";
	tableContainer.innerHTML=`
	<div class="dashboard">
		<input type="text" class="table-title" placeholder="Table Title" style="font-style:italic;">
		<table class="table dashboard_table" id="dashboard_table${IdNumber}">
			<tr>
				<th>
					Things To Do
				</th>
				<th>
					Due Date
				</th>
				<th>
					Entering Date
				</th>
				<th>
					Time Left
				</th>
				<th>
					Priority
				</th>
				<th>
					Status
				</th>
				<th>
					Comments
				</th>
			</tr>
			<tr class="table-input">
				<td>
					<input type="Text" class="table-item todo">
				</td>
				<td>	
					<div id="1">
						<input type="Date" class="table-item due-date" id="due_date" oninput="	timeleft()">
					</div>
				</td>
				<td>	
					<input type="Date" class="table-item Entering-data">
				</td>
				<td>
					<input type="number" class="table-item time_left">
				</td>
				<td>
					<div class="priority">
						<div class="rate">
							<input type="radio" id="star5" name="rate"value="5">
							<label for="star5" title="text">&#9733;</label>
							<input type="radio" id="star4" name="rate" value="4"/>
							<label for="star4" title="text">&#9733;</label>
							<input type="radio" id="star3" name="rate" value="3"/>
							<label for="star3" title="text">&#9733;</label>
							<input type="radio" id="star2" name="rate" value="2"/>
							<label for="star2" title="text">&#9733;</label>
							<input type="radio" id="star1" name="rate" value="1"/>
							<label for="star1" title="text">&#9733;</label>
						</div>
					</div>
				</td>
				<td>
					<select class="table-status">
						<option id="done">
							Done
						</option>
						<option id="working">
							Working
						</option>
						<option id="stuck">
							Pending
						</option>
					</select>
				</td>
				<td>
					<input type="Text" class="table-item Comments">
				</td>
				<td>
					<button class="table-items delete_row" onclick="deleterow()">
						&#10006
					</button>
				</td>
			</tr>
			<tr class="table-input">
				<td>
					<input type="Text" class="table-item todo">
				</td>
				<td>	
					<input type="Date" class="table-item due-data">
				</td>
				<td>	
					<input type="Date" class="table-item Entering-data">
				</td>
				<td>
					<input type="number" class="table-item days">
				</td>
				<td>
					<div class="priority">
						<div class="rate">
							<input type="radio" id="star5" name="rate" value="5"/>
							<label for="star5" title="text">&#9733;</label>
							<input type="radio" id="star4" name="rate" value="4"/>
							<label for="star4" title="text">&#9733;</label>
							<input type="radio" id="star3" name="rate" value="3"/>
							<label for="star3" title="text">&#9733;</label>
							<input type="radio" id="star2" name="rate" value="2"/>
							<label for="star2" title="text">&#9733;</label>
							<input type="radio" id="star1" name="rate" value="1"/>
							<label for="star1" title="text">&#9733;</label>
						</div>
					</div>
				</td>
				<td>
					<select class="table-status">
						<option id="done">
							Done
						</option>
						<option id="working">
							Working
						</option>
						<option id="stuck">
							Pending
						</option>
					</select>
				</td>
				<td>
					<input type="Text" class="table-item Comments">
				</td>
				<td>
					<button class="table-items delete_row" onclick="deleterow()">
						&#10006
					</button>
				</td>
			</tr>
			<button type="button" class="add_row-btn" title="Add Row" id="add_row-btn${IdNumber}" onclick="add_row()">
				+
			</button>
		</table>
		<button type="button" class="delete_table-btn" title="Delete Table" id="delete_table-btn${IdNumber}" onclick="delete_table()">
		&#10006
		</button>
	</div>
	`
	var tableList=document.getElementById("table_list");
	tableList.appendChild(tableContainer);
}
function delete_table() {
	IdNumber--;
	event.target.parentElement.parentElement.remove();
}

