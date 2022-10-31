package classes;

import java.lang.*;

public class ImportedProduct extends Product 
{
	private String countryName;
	
	public ImportedProduct()
	{
		System.out.println("E--Imported Product");
	}
	public ImportedProduct(String pid , String name ,  int availableQuantity , double price , String countryName)
	{
		super(pid , name , availableQuantity , price);
		this.countryName = countryName;
	}
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	
	public void showInfo()
	{
		System.out.println("Product ID: "+ pid);
		System.out.println("Product Name: "+ name);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Product Price: "+ price);
		System.out.println("Country Name: "+ countryName);
	}
	
}