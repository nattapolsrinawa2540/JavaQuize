package com.buzzfreeze.helloWorld;

public class MackProduct extends AbstractProductFrontPage  {
	final String quality = "super good";
	
	public static void main(String[] args) {
		MackProduct pro = new MackProduct();
		//pro.quality = "xxx";
	}
	
	public final String getX() {
		return "x";
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSoldText() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
