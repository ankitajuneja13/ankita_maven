/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.*;
public class Chocolate {
     String name ;
	  int price;
	  Chocolate()
	  {
		  //default
	  }
	  Chocolate(String name,int price)
	  {
		  this.name=name;
		  this.price=price;
	  }
	   int weight(Chocolate chocolates[])
	  {
		  int wt=0;
		  int n = chocolates.length;
		  for(int i=0;i<n;i++)
		  {
			  wt+=(chocolates[i].price);
		  }
		  return wt;
	  }
	
}
    

