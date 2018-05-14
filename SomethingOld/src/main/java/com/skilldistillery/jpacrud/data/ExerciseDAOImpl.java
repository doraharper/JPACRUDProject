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
		List<Exercise> exercises = em.createQuery(query, Exercise.class).getResultList();
	
		return exercises;
	}

	@Override
	public Exercise create(Exercise exercise) {
		Exercise e = new Exercise();
		em.persist(e);
		em.flush();
		return e;
	}

	@Override
	public Exercise update(Exercise exercise) {
		Exercise e = em.find(Exercise.class, exercise.getId());
		e.setName(exercise.getName());
		e.setSkillLevel(exercise.getSkillLevel());
		e.setCategory(exercise.getCategory());
		e.setDescription(exercise.getDescription());
		e.setLink(exercise.getLink());
		em.persist(e);
		em.flush();
		return e;
	}

	@Override
	public Exercise retrieveById(int id) {
		Exercise e = em.find(Exercise.class, id);
		return e;
	}

	@Override
	public boolean delete(int id) {
		Exercise e = em.find(Exercise.class, id);
		if (e == null) {
			em.getTransaction().commit();
			return false;
		}

		em.remove(e);

		return true;
	}

//	@Override
//	public Exercise findByKeyword(String keyword) {	
//		String query = "SELECT e FROM Exercise e WHERE e.name = keyword ";
//		Exercise exercise = em.createQuery(query, Exercise.class)
//				.setParameter("name", );
//				.getResultList();
//	
//		return exercises;
//	}
}
