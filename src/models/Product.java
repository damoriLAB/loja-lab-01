package models;

import util.PriceUtil;

public class Product {
	private String ID;
	private String name;
	private ProductCategory category;
    private float price;	

	public Product (String ID, String name, ProductCategory categoryProduct, float price){
		this.ID = ID;
		this.name = name;
		this.category = categoryProduct;
		this.price = price;
	}
	public Product () {}

	public String getId(){
		return ID;
	}

	public String getName(){
		return name;
	}

	public ProductCategory getCategory(){
		return category;
	}

	public float getPrice(){
		return price;
	}

	@Override
	public String toString(){
		String stringPrice = Float.toString(price);
		stringPrice = PriceUtil.toString(price);

		return 
		"\nid: " + ID + "\n" + 
		"name: " + name + "\n" + 
		"category: "  + category.toString() + "\n" +
		"price: " + stringPrice + "\n";
	}



}
