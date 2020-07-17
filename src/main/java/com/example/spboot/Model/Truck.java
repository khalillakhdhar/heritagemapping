package com.example.spboot.Model;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

@Entity
public class Truck extends TransportationVehicle {
	
@NotNull
int nbcontainer;

public int getNbcontainer() {
	return nbcontainer;
}

public void setNbcontainer(int nbcontainer) {
	this.nbcontainer = nbcontainer;
}

}
