package edu.services;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import edu.dao.ProjectDAO;
import edu.entity.Project;

@Named
@Transactional
public class ProjectService {
	@Inject
	private ProjectDAO projectDAO;
	
	public void createProject(Project project){
		projectDAO.create(project);
	}
	
	public Project readProject(Project project) {
		return projectDAO.readByID(project.getId());
	}
	
	public void updateProgect(Project project) {
		projectDAO.update(project);
	}
	
	public void deleteProject(Project project) {
		projectDAO.delete(project.getId());
	}
}
