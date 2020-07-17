package com.example.spboot.Model;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

@Entity
public class Bike extends Passager {
@NotNull
	int hauteur;

public int getHauteur() {
	return hauteur;
}

public void setHauteur(int hauteur) {
	this.hauteur = hauteur;
}



}
