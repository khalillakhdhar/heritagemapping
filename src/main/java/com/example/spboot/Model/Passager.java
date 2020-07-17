package com.example.spboot.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Passager extends Vehicle  {
private int nbpassager;

public int getNbpassager() {
	return nbpassager;
}

public void setNbpassager(int nbpassager) {
	this.nbpassager = nbpassager;
}



}
