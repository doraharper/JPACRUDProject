package com.skilldistillery.jpacrud.entities;

public enum Category {

	BODYWEIGHT("Bodyweight"), WEIGHTS("Weights"), FUN("Fun"), YOGA("YO!ga");

	private String name;

	private Category(String name) {
	this.name=name;

}

@Override
public String toString() {
	return name;
}

	// ENUM('Bodyweight', 'weights', 'YO!ga', 'Fun')
}
