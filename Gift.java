/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author HNC
 */
import java.util.*;
    
public class Gift extends Sweets{
	   Sweets sweets[];
	   Chocolate chocolates[];
	   int weight;
	   Scanner sc = new Scanner(System.in);
	   Gift()
	   {
		   //default
	   }
	   Gift(Sweets sweet[],Chocolate chocolates[])
	   {
		  sweets=sweet;
		  this.chocolates=chocolates;
		  weight=0;
	   }
	   void sortChocolates()
	   {	
		   //Bubble sorting
		   int n=sweets.length;
		   for(int i=0;i<n;i++)
		   {
			   for(int j=0;j<n-i; j++)
			   {
				   if(chocolates[j].price >chocolates[j+1].price)
				   {
					   Chocolate temp;
					   temp=chocolates[j];
					   chocolates[j]=chocolates[j+1];
					   chocolates[j+1]=temp;
				   }
			   }
		   }
	   }
	   void findCandies()
		{	
		 
		   int numcandies = sc.nextInt();
		  
			for(int i=0;i<chocolates.length;i++)
			{
				if(chocolates[i].price>=numcandies)
				{
					break;
				}
				System.out.println("Name:"+chocolates[i].name);
				System.out.println("Cost:"+chocolates[i].price);
			}
		}
	   void findWeight()
	   {
		    weight=weight(sweets)+weight(chocolates);
			System.out.println("Total weight of Gift is :"+weight);
	   }
	   
	}
