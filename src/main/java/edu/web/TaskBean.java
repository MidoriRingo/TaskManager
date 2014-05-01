package edu.web;

import java.sql.Date;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import tranport.TaskTemp;
import edu.entity.Task;
import edu.services.TaskService;

@Named
@Scope("session")
public class TaskBean {
	
	@Inject
	private TaskService taskService;
	
	private int id;
	private String name;
	private Date creationDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	private Date deadline;
	private boolean status;
	private int priority;
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public void createTask() {
		taskService.createTask(new TaskTemp());
	}
}
