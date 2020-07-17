package com.example.spboot.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class TransportationVehicle extends Vehicle {
	private int loadcapacity;

	public int getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(int loadcapacity) {
		this.loadcapacity = loadcapacity;
	}
	

}
