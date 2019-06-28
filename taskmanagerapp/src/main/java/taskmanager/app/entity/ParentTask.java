package taskmanager.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="parent_task")
public class ParentTask {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "parent_id")
	private String parentID; 
	@Column(name = "parent_task")
	private String parentTask;

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}
	
	

}
