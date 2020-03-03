package com.thp.spring.simplecontext;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moussaillon")
public class Moussaillon {
//Les attributs & méthodes & constructeurs
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "config")
	private String config;
}