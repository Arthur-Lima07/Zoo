package br.edu.animal;

public abstract class Animal {
	protected String picture;
	protected String location;
	protected String boundaries;
	protected String food;
	protected String raça;
	
	public void pegadas() {
		
	}
	public void comer() {
		
	}
	public void baianar() {
		
	}
	public abstract void rugido();
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBoundaries() {
		return boundaries;
	}
	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
		
}


