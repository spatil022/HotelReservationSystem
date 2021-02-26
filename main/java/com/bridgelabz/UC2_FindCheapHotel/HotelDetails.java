package com.bridgelabz.UC2_FindCheapHotel;

public class HotelDetails {

	private String name;
	private int price;

	public HotelDetails(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString(){
		return "Hotel Name: "+name+" Price: "+price;
	}
}