package taskmanager.app.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import taskmanager.app.entity.Task;

public interface TaskRepository extends JpaRepository<Task, String> ,JpaSpecificationExecutor<Task> {
	public Task findByTaskID(String taskID);
	@Query("SELECT em FROM Task em WHERE em.parentID = :parentID") 
	public List<Task> findTasksByParentID(String parentID);
	/*public List<Task> findTasksByPriority(int startRange, int endRange);
	public List<Task> findTasksByParentID(String parentID);
	public List<Task> findTasksByDate(Date startDate,Date endDate);
*/}
