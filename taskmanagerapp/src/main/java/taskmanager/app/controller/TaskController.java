package taskmanager.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import taskmanager.app.entity.Task;
import taskmanager.app.services.TaskServices;

@RestController
@RequestMapping("/TaskManager")
public class TaskController {

	@Autowired
	private TaskServices taskServices;
	
	  @PostMapping( path="/addTask", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Task> addTask( @RequestBody Task task) {
	        return ResponseEntity.ok(taskServices.taskSave(task));
	    }
	  @GetMapping(path ="/getAllTasks", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Task> getAllTasks() {
		  return taskServices.getAllTasks();
	  }
	  @GetMapping(path ="/getTask/{taskID}", produces = MediaType.APPLICATION_JSON_VALUE)
	  public Task getTask(@PathVariable String taskID) {
		  return taskServices.getTask(taskID);
	  }
	  @DeleteMapping(path ="/deleteTask/{taskID}", produces = MediaType.APPLICATION_JSON_VALUE)
	  public void deleteTask(@PathVariable String taskID) {
		  taskServices.deleteTask(taskID);
	  }
	  @PutMapping(path ="/updateTask/{taskID}", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<Object> updateTask( @RequestBody Task task, @PathVariable String taskID) {
		  return taskServices.updateTask(task, taskID);
	  }
	  @GetMapping
	  public String getData() {
		  return "Welcome to Task manager";
	  }

}
