"use strict"

function TaskAtHandApp(){
	var version="v1.0";

	function setStatus(message){
	$("#app>footer").text(message);
	}

	this.start = function(){
		$("#new-task-name").keypress(function(e) {
			if (e.which == 13){
			addTask();
			return false;
			}
		}).focus();

		$("#app>header").append(version);
		setStatus("ready");

		function addTask()
		{
			var taskName = $("#new-task-name").val();
			if (taskName)
			{
				addTaskElement(taskName);
				// Reset the text field
				$("#new-task-name").val("").focus();
			}
		}

		function addTaskElement(taskName)
		{
			var $task = $("<li></li>");
			var $delete = $("<button class='delete'>X</button>");
			$task.append($delete).append("<span class='task-name'>" + taskName + "</span>");
			$delete.click(function(){ $task.remove();});
			$("#task-list").append($task);
		}
	}
}

$(function(){
window.app = new TaskAtHandApp();
window.app.start();
});