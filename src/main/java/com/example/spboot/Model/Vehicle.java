package com.example.spboot.Model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GeneratorType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")
@TableGenerator(name = "Vehicle_GEN",table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VALUE", allocationSize = 1)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String manifacturer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	

}
