package classes;

import java.lang.*;
import interfaces.*;

public class Shop implements ProductOperations
{
	private String sid;
    private String name;
    private Product products[ ];
	
	public Shop()
	{
		System.out.println("E--Shop");
		this.products = new Product[10];
	}
	public Shop(String sid , String name , int sizeOfArray )
	{
		this.sid = sid;
		this.name = name;
		this.products = new Product[sizeOfArray];
		System.out.println("P--Shop");
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
    public void setSid(String sid)
	{
		this.sid = sid;
	}
	
	
    public String getName( )
	{
		return name;
	}
    public String getSid( )
	{
		return sid;
	}
	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		
		for(int i=0 ; i<products.length ; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
    public boolean removeProduct(Product p)
    {
	boolean flag = false;
		
		for(int i=0 ; i<products.length ; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
    }
    
    public void showAllProducts( )
	{
		System.out.println("****************************");
		System.out.println("Shop Name: "+ name);
		System.out.println("Shop ID: "+ sid);
		
		
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				System.out.println("------------------------");
				products[i].showInfo();
				System.out.println();
			}
		}
		
	}
	
	
	public Product searchProduct(String pid)
	{
		
		Product p=null;
		
        for (int i = 0; i <products.length; i++) 
		{
            if(products[i] != null)
			{
			   if (products[i].getPid().equals(pid)) 
			    {
                   p = products[i];
				   break;
                }
			}
        }
        return p;
	}
	
	
	
	
	
	
}