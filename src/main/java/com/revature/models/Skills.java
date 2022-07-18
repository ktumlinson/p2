package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="skills")
@Data @AllArgsConstructor @NoArgsConstructor
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String name;
	
	private String description;
	
	@Column(name="stat")
	private String statDependency;
	
	private int power;
	
	@ManyToMany
	@JoinTable(name="character_and_skill", joinColumns = @JoinColumn(name="skill_id"), 
								inverseJoinColumns = @JoinColumn(name = "character_id", referencedColumnName="id"))
	private Set<Character> charactersWithSkill;
}
