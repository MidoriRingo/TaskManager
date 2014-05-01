package edu.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import tranport.TaskTemp;
import edu.dao.TaskDAO;
import edu.entity.Client;
import edu.entity.Project;
import edu.entity.Task;

@Named
@Transactional
public class TaskService {
	@Inject
	private TaskDAO taskDAO;
	
	public void createTask(TaskTemp taskTemp) {
//		Project project = 
//		taskDAO.create(taskTemp);
	}
	
	public void removeTask(Task task) {
		taskDAO.delete(task.getId());
	}
	
	public void updateTask(Task task) {
		taskDAO.update(task);
	}
	
	public void changePriority(Task taskBase, Task taskCompare) {
		if (taskBase.getPriority() > taskCompare.getPriority()){
			taskBase.setPriority(taskBase.getPriority() - 1);
		}
		else {
			taskBase.setPriority(taskBase.getPriority() + 1);
		}
		taskDAO.update(taskBase);
	}
	
	public List<Task> name(Client client) {
		return taskDAO.getClientsTasks(client);
		
	}
}
