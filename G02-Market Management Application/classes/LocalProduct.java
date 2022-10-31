package classes;

import java.lang.*;

public class LocalProduct extends Product 
{
	private double discountRate;
	
	public LocalProduct()
	{
		System.out.println("E--Local Product");
		
	}
	public LocalProduct(String pid , String name ,  int availableQuantity , double price , double discountRate)
	{
		super(pid , name , availableQuantity , price );
		this.discountRate = discountRate;
		System.out.println("P--Local Product"); 
	}
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
    public double getDiscountRate( )
	{
		return discountRate;
	}
	
	public void showInfo()
	{
		System.out.println("Product ID: "+ pid);
		System.out.println("Product Name: "+ name);
		System.out.println("Available Quantity: "+ availableQuantity);
		System.out.println("Product Price: "+ price);
		System.out.println("Discount Rate: "+ discountRate);
	}
	
	
}