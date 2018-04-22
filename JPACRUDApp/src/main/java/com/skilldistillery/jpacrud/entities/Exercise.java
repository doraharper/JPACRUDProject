package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@Enumerated
	@Column(name = "skill_level")
	private SkillLevel skillLevel;

	@Enumerated
	private Category category;

	private String description;

	private String link;

	public Exercise() { }

	public Exercise(String name, SkillLevel skillLevel, Category category, String description, String link) {

		this.name = name;
		this.skillLevel = skillLevel;
		this.category = category;
		this.description = description;
		this.link = link;
	}

	@Override
	public String toString() {
		return "Exercise [id=" + id + ", name=" + name + ", skillLevel=" + skillLevel + ", category=" + category
				+ ", description=" + description + ", link=" + link + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillLevel getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(SkillLevel skillLevel) {
		this.skillLevel = skillLevel;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getId() {
		return id;
	}

}
