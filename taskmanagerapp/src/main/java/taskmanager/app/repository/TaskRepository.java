package taskmanager.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import taskmanager.app.entity.Task;

public interface TaskRepository extends JpaRepository<Task, String> {
	public Task findByTaskID(String taskID);
}
