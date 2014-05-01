package edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.entity.Client;
import edu.entity.Task;

@Repository
public class TaskDAO extends GenericDAO<Task> {

	public List<Task> getClientsTasks(Client client) {
		List<Task> tasks = em
				.createQuery(
						"select t from Task t, Project p where p.client.id = ?1 and t.project.id = p.id",
						Task.class).setParameter(1, client.getId()).getResultList();
		return tasks;
	}

}
