package taskmanager.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import taskmanager.app.entity.Task;
import taskmanager.app.repository.TaskRepository;

@Service
public class TaskServices {
	@Autowired
	private TaskRepository taskRepo;
	
	 public Task taskSave(Task Task) {
	        return taskRepo.save(Task);
	    }
	 
	 public List<Task> getAllTasks() {
	        return taskRepo.findAll();
	    }
	 
	 public Task getTask(String taskID) {
	        return taskRepo.findByTaskID(taskID);
	    }
	 
	 public void deleteTask(String taskID) {
		 taskRepo.deleteById(taskID);
	 }
	 
	 public ResponseEntity<Object> updateTask(Task task, String taskID) {		 
		 Task findTask= taskRepo.findByTaskID(taskID);
		 if(findTask ==null) 
			 return ResponseEntity.notFound().build();
		 //Have to work
		 findTask.setTaskID(task.getTaskID());
		 findTask.setParentID(task.getParentID());
		 findTask.setTask(task.getTask());
		 findTask.setEndDate(task.getEndDate());
		 findTask.setStartDate(task.getStartDate());
		 findTask.setPriority(task.getPriority());
		 taskRepo.save(findTask);
		 return ResponseEntity.noContent().build();
	 }
}
