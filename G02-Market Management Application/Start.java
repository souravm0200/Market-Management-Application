import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Market market = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		
		boolean repeat = true;
		
		System.out.println();
		System.out.println("************************");
		System.out.println("Welcome to JAIFS Super Market");
		System.out.println("************************");
		System.out.println();
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
			
					System.out.println("Your Choice is: Employee Management");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Salary:");
							double salary1 = sc.nextDouble();
							
							Employee e1  = new Employee();
							
							e1.setName(name1);
							e1.setEmpId(empId1);
							e1.setSalary(salary1);
							
							if(market.insertEmployee(e1))
							{
								System.out.println("Employee Inserted...."); 
								System.out.println("The Employee ID is: "+e1.getEmpId());
							}
							else
							{
								System.out.println(" Something Went Wrong.Please Try it again.");
							}
							
							System.out.println();
							
							
							break;
							
						case 2:
						
							System.out.println("Your Option is: Remove an Existing Employee");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = market.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(market.removeEmployee(e2))
								{
									System.out.println("Employee Removed........");  
									System.out.println("The Employee ID is: "+e2.getEmpId());
								}
								else
								{
									System.out.println("Something Went Wrong.Please Try It again.");
								}
							}
							else
							{
								System.out.println("No Such Employee Found to remove......");
							}
							
							System.out.println();
							break;
							
						case 3:
						   
							System.out.println("Your Option is: Show All Employees");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							market.showAllEmployees();
							System.out.println();
							break ;
							
						case 4:
						    
							System.out.println("Your Option is: Search an Employee");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = market.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found.");
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
								System.out.println();
							}
							else
							{
								System.out.println("No Such Employee Found.");
							}
							
							System.out.println();
							
							break;
							
						case 5:
						    
							System.out.println("Your Option is to Go Back.");
						    System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							break;
							
						default:
						   
							System.out.println("Your Choice is Invalid");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
				  
					System.out.println("Your Choice is: Shop Management");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show All Shops");
					System.out.println("4. Search a Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						    
							System.out.println("Your Option is: Insert New Shop");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String sid1 = sc.next();
							System.out.print("Enter Shop Name: ");
							String name1 = sc.next();
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							
							
							if(market.insertShop(s1))
							{
								System.out.println("Shop Inserted."); 
								System.out.println("The Shop ID is: "+ s1.getSid());
							}
							else
							{
								System.out.println(" Something Went Wrong.Please Try It again.");
							}
							
							System.out.println();
							break;
							
						case 2:
						  
							System.out.println("Your Option is: Remove an Existing Shop");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String shopSid2 = sc.next();
							
							Shop s2= market.searchShop(shopSid2);
							
							if(s2 != null)
							{
								if(market.removeShop(s2))
								{
									System.out.println("Shop Removed.");
									System.out.println("The Shop ID is: "+s2.getSid());
									
								}
								else
								{
									System.out.println(" Something Went wrong.Please It Again.");
								}
							}
							else 
							{
								System.out.println("No such Shop found to remove ...");
							}
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("Your Option is: Show All Shops");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							market.showAllShops();
							System.out.println();
							break;
							
						case 4:
						    
							System.out.println("Your Option is: Search a Shop");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop SID: ");
							String shopSid3 = sc.next();
							
							Shop s3 = market.searchShop(shopSid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found.");
								System.out.println("Shop SID: "+s3.getSid());
								System.out.println("Shop Name: "+s3.getName());
								System.out.println();
							}
							else
							{
								System.out.println("No Such Shop Found......");
							}
							
							System.out.println();
							
							
							
							break;
							
						case 5:
						   
							System.out.println("Your Option is to Go Back.");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("Your Choice is Invalid");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
					
				case 3:
                    
					System.out.println("Your Choice is: Shop Product Management");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					System.out.println();
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Product");
					System.out.println("2. Remove Existing Product");
					System.out.println("3. Show All Products");
					System.out.println("4. Search a Product");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("Your Option is: Insert New Product");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.println("There are two types of Products is available in the shop: ");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");
							System.out.println();
							
							System.out.print("Enter your Type: ");
							int type = sc.nextInt();
							
							Product p = null; 
							
							if(type == 1)
							{
								System.out.println("Your Type is: Local Product");
								
								System.out.println();
								System.out.print("Enter Product ID: ");
								String pid = sc.next();
								System.out.print("Enter Product Name: ");
								String pname = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter Product Discount Rate: ");
								double dr = sc.nextDouble();
								
								LocalProduct lp = new LocalProduct(pid, pname, aq, pr, dr);
								
								p = lp;
									
							}
							
							else if(type == 2)
							{
								
								System.out.println("Your Type is: Imported Product");
								System.out.println();
								System.out.print("Enter Product ID: ");
								String pid = sc.next();
								System.out.print("Enter Product Name: ");
								String pname = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq = sc.nextInt();
								System.out.print("Enter Product Price: ");
								double pr = sc.nextDouble();
								System.out.print("Enter Product Country Name: ");
								String cn = sc.next();
								
								ImportedProduct ip = new ImportedProduct(pid, pname, aq, pr, cn);
								
								p = ip;
							}
							
							else if(type == 3)
							{
								System.out.println("Going Back.");
							}
							else
							{
								System.out.println("Your Type Is Invalid.");
							}
							
							
							if(p != null)
							{
								System.out.print("Enter Shop SID: ");
								String sid = sc.next();
								
								Shop s4 = market.searchShop(sid);
								
								if(s4 != null)
								{
									if(s4.insertProduct(p))
									{
										
										System.out.println("Product Inserted Succesfully.");
										System.out.println("The Product ID: "+p.getPid());
									}
									else
									{
										System.out.println("Failed...Product Not inserted");
									}
										
								}
								else
								    {
									System.out.println(" Something Wrong .....Check it again...");
								    }
							}
							
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("Your Option is: Remove an Existing Product");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid2= sc.next();
								
							Shop s5 = market.searchShop(sid2);
							
							
							if(s5 != null)
							{
								System.out.print("Enter Product ID: ");
								String pid1= sc.next();
								Product p1 = s5.searchProduct(pid1);
								
								if(s5.removeProduct(p1))
								{
									
									System.out.println("Product Removed Succesfully.");
									System.out.println("The Product ID is: " +p1.getPid());
									
									
								}
								else
								{
									System.out.println("No such product found to remove...");
								}
								
							}
							else
							{
								System.out.println("Something wrong .. try it again..");
							}
							
							
							System.out.println();
							break;
							
						case 3:
						    
							System.out.println("Your Option is: Show All Products");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
								
							Shop s6 = market.searchShop(sid3);
							
							if(s6 != null)
							{
								s6.showAllProducts();
							}
							else
							{
								System.out.println("Something Went Wrong.Try It Again.");
							}
							
							System.out.println();
							
							break;
							
						case 4:
						
							System.out.println("Your Option is: Search Product: ");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid4= sc.next();
								
							Shop s7 = market.searchShop(sid4);
						
							if(s7 != null)
							{
								System.out.print("Enter Product ID: ");
								String pid2= sc.next();
								Product p2 = s7.searchProduct(pid2);
								
								if(p2 != null)
								{
									System.out.println(" ");
									System.out.println("Product Found.");
									p2.showInfo();
									System.out.println();
									
								}
								else
								{
									System.out.println("No such product found...");
								}
								
							}
							else
							{
								System.out.println("Something wrong .. try it again..");
							}
							
							System.out.println();
							
							break;
							
						case 5:
						
							System.out.println("Your Option is to Go Back...");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("Your Choice is Invalid");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							break;
							
							
					}
					
					System.out.println();
					break;
           		
				case 4:
				
					System.out.println("Your Choice is: Product Quantity Add-Sell");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					System.out.println();
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add Product");
					System.out.println("2. Sell Product");
					System.out.println("3. Show ADD SELL History");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("Your Option is: Add Product");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid5 = sc.next();
							
							Shop s8 = market.searchShop(sid5);
							
							if(s8 != null)
							{
								System.out.print("Enter Product ID: ");
								String pid3 = sc.next();
								
								Product p3 = s8.searchProduct(pid3);
								
								if(p3 != null)
								{
									System.out.println("Available Products: "+p3.getAvailableQuantity());
									System.out.print("Enter The number of product you want to Add: ");
									int ap = sc.nextInt();
									
									if(p3.addQuantity(ap))
									{
										System.out.println("Available Products After Add New Products: "+p3.getAvailableQuantity());
										frwd.writeInFile(ap + " Product Added in "+ p3.getPid());
									}
									else
									{
										System.out.println("Something Went Wrong.Try It Again.");
									}
								}
								else
								{
									System.out.println("Something Went Worng.Please Try It Again.");
								}
							}
							else
							{
								System.out.println("Something Went Wrong.Please Try It Again.");
							}
							
							System.out.println();
							break;
							
						case 2:
				
							System.out.println("Your Option is: Sell Product");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							System.out.print("Enter Shop ID: ");
							String sid6 = sc.next();
							
							Shop s9 = market.searchShop(sid6);
							
							if(s9 != null)
							{
								System.out.print("Enter Product ID: ");
								String pid4 = sc.next();
								
								Product p4 = s9.searchProduct(pid4);
								
								if(p4 != null)
								{
									System.out.println("Available Products: "+p4.getAvailableQuantity());
									System.out.print("Enter the number of products that you Sell: ");
									int  sp = sc.nextInt();
									
									if(p4.sellQuantity(sp))
									{
										System.out.println("Available Products After Sell: "+p4.getAvailableQuantity());
										frwd.writeInFile(sp + " Sell From Product "+ p4.getPid());
									}
									else
									{
										System.out.println("Something Went Wrong.Please Try It Again.");
									}
								}
								else
								{
									System.out.println("Something Went Wrong.Please Try It Again.");
								}
							}
							else
							{
								System.out.println("Something Went Wrong.Please Try IT Again.");
							}
							
							System.out.println();
							
							break;
							
						case 3:
						
							System.out.println("Your Option is: Show Add-Sell History");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("Your Option is to Go Back..............");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							
							break;
						
						default: 
							
							System.out.println("Your Choice is Invalid");
							System.out.println("**** **** **** **** **** **** **** **** ****");
							System.out.println();
							break;
					}
					
					
					System.out.println();
					break;    
					
				case 5:
				
					repeat = false;
					System.out.println("Thank you for using our system");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					
					System.out.println();
					break;
					
				default:
			
					System.out.println("Your Choice is Invalid");
					System.out.println("**** **** **** **** **** **** **** **** ****");
					System.out.println();
					break;				
				
			}			
		}		
	}
}