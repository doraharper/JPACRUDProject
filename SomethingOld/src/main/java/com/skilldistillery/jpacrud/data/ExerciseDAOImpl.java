package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Exercise;

@Transactional
@Component
public class ExerciseDAOImpl implements ExerciseDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Exercise> retrieveAll() {
		String query = "SELECT e FROM Exercise e";

		List<Exercise> film = em.createQuery(query, Exercise.class).getResultList();
		return film;
	}

	@Override
	public Exercise create(Exercise exercise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exercise update(int id, Exercise exercise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exercise retrieveById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
