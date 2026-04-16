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
public class Project {
	@Id
	private int pId;
	private String pName;
	@ManyToMany
	private List<Developer> developers;

}
