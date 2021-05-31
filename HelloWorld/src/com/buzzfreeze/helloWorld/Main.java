package com.buzzfreeze.helloWorld;

public class Main {
	public static void main(String[] args) {
		Product x = new Product("1000", "iPhone", "", "ขายไปแล้ว 10 เครื่อง");
		x.productStatus = ProductStatus.Status.DRAFT;
		x.priceStatus = ProductStatus.PriceStats.DEAL;
	}
}
