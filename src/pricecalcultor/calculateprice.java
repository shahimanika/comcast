package pricecalcultor;

import java.util.Scanner;

public class calculateprice {
	
/*Assumptions have been made for luxury and basic prices

Luxury Item price=4 USD 

Basic Item price=2 USD*/
	
 private static double itempricebasic= 2.0;
 
 private static double itempricelux= 4.0;
  
 private static final String luxury="lux";
  
 private static final String basic="basic";
 
 private static final String currency="cents";

	
 public static double calculate( int numberofitems,String itemtype)
  {
	  double price;
	  double finalprice;
	  
	  if (itemtype.equalsIgnoreCase(luxury))
	  {
		 price= numberofitems*itempricelux;
		 finalprice=price+(price*9/100);
	  }
	  else
	  {
		  price= numberofitems*itempricebasic;
		  finalprice=price+(price*1/100);
	  }
	  return finalprice;	 
		  
  }
 
 public static void main(String[] args) {
	 double priceUSD=0.0;
	 double priceincents;
     Scanner input = new Scanner(System.in);
     double sum = 0;
         System.out.println("Enter quantity of product");
         int q = input.nextInt();
         System.out.println("Enter type of product");
         String type = input.next();
         priceUSD=calculate(q,type);
         priceincents=priceUSD *100;
         System.out.println("Total cost "+String.valueOf(Math.round(priceincents))+" "+currency);
     }
       
 }
	

