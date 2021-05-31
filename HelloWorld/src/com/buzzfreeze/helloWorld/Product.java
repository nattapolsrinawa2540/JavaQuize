package com.buzzfreeze.helloWorld;

public class Product implements IProductFrontPage, ICategoryDisplay {
	public String price;
	public String title;
	public String urlImage;
	public String soldText;
	public ProductStatus.Status productStatus;
	public ProductStatus.PriceStats priceStatus;
	
	public Product(String price, String title, String urlImage, String soldText) {
		this.price = price;
		this.title = title;
		this.urlImage = urlImage;
		this.soldText = soldText;
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getUrlImage() {
		// TODO Auto-generated method stub
		return urlImage;
	}
	@Override
	public String getSoldText() {
		// TODO Auto-generated method stub
		return soldText;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
}
