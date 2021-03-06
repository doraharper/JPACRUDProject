package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Exercise;

public interface ExerciseDAO {
	public List<Exercise> retrieveAll();
	public Exercise create(Exercise exercise);
	public Exercise update(Exercise exercise, int id);
	public Exercise retrieveById(int id);
	public boolean delete(int id);

}
