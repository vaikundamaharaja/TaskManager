package taskmanager.app.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import taskmanager.app.entity.ParentTask;
import taskmanager.app.repository.ParentTaskRepository;
@Service
public class ParentTaskServices {
	@Autowired
	private ParentTaskRepository parentTaskRepo;
	
	 public ParentTask parentTaskSave(ParentTask parentTask) {
	        return parentTaskRepo.save(parentTask);
	    }
	 
	 public List<ParentTask> getAllParentTasks() {
	        return parentTaskRepo.findAll();
	    }
	 
	 public ParentTask getParentTask(String parentID) {
	        return parentTaskRepo.findByParentID(parentID);
	    }
	 
	 public void deleteParentTask(String parentID) {
		 parentTaskRepo.deleteById(parentID);
	 }
	 
	 public ResponseEntity<Object> updateParentTask(ParentTask parentTask, String parentID) {		 
		 ParentTask parTask= parentTaskRepo.findByParentID(parentID);
		 if(parTask ==null) 
			 return ResponseEntity.notFound().build();
		 parTask.setParentID(parentTask.getParentID());
		 parTask.setParentTask(parentTask.getParentTask());
		 parentTaskRepo.save(parTask);
		 return ResponseEntity.noContent().build();
	 }
}
