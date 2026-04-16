package com.hibernateEmbedding;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Developer {
	@Id
	private int dId;
	private String dName;
	@ManyToMany
	private List<Project> projects;

}
