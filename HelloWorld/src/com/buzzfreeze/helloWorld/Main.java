package com.buzzfreeze.helloWorld;

public class Main {
	public static void main(String[] args) {
		Product x = new Product("1000", "iPhone", "", "�������� 10 ����ͧ");
		x.productStatus = ProductStatus.Status.DRAFT;
		x.priceStatus = ProductStatus.PriceStats.DEAL;
	}
}
