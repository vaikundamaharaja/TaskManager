package taskmanager.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import taskmanager.app.entity.ParentTask;

public interface ParentTaskRepository extends JpaRepository<ParentTask, String> {

	public ParentTask findByParentID(String parentID);


}
