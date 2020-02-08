package com.beginning.student.myproject;
import java.util.*;
public class Giftanalysis {

	public static void main(String args[])
	{
		int total_wt= 0,quantity=0,wt=0,totalgift_wt=0;
		 String s[]= {"Hersheys","Nestle","Jalebi","Mothichur"};
	        int a[]=new int[4];
        int choice;
        Boolean set=true;
         Scanner sc=new Scanner(System.in);
        sweet current ;
        System.out.println("Adding choclates and sweets to my giftbox!");
        while(set) {
       
        System.out.println("Available chocolates and sweets are");
        System.out.println("1.Hersheys chocolate!\n2.Nestle chocolate!\n3.Jalebi sweet!\n4.Mothichur sweet!\n");
        System.out.println("Select any options(1-4 ");
        
       
        
        choice=sc.nextInt();
        switch(choice)
        {
        case 1:System.out.println("Enter the quantity:");
                quantity=sc.nextInt();
                
                System.out.println("Enter the weight in gms");
                wt=sc.nextInt();
                
                current=new Hersheys();
                total_wt=current.calweight(quantity,wt);
                a[choice-1]+=total_wt;
                totalgift_wt+=total_wt;
                System.out.println("Total weight of Hersheys is:"+total_wt+"grams");
	        	System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
	               
	        	 System.out.println("Do you want any other item (y/n)");
	        	   choice=sc.next().charAt(0);
	        	      if(set)
	        	        { 
	        	    	
	        	          break;
	        	        }
	        	     else
	        		    {
	        	    	 set=false;
	                     System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
	                    
	                     break;
	                    }
                
        case 2:System.out.println("Enter the quantity:");
        quantity=sc.nextInt();
        
        System.out.println("Enter the weight in gms");
        wt=sc.nextInt();
        
        current=new nestle();
        total_wt=current.calweight(quantity,wt);
        
        a[choice-1]+=total_wt;
        totalgift_wt+=total_wt;
        System.out.println("Total weight of Nestle is:"+total_wt+"grams");
    	System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
           
    	 System.out.println("Do you want any other item (y/n)");
    	   choice=sc.next().charAt(0);
    	      if(set)
    	        { 
    	    	
    	          break;
    	        }
    	     else
    		    {
    	    	 set=false;
                 System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
                 break;
                }
            
        case 3:System.out.println("Enter the quantity:");
        quantity=sc.nextInt();
        
        System.out.println("Enter the weight in gms");
        wt=sc.nextInt();
        
        current=new jalebi();
        total_wt=current.calweight(quantity,wt);
        a[choice-1]+=total_wt;
        totalgift_wt+=total_wt;
        System.out.println("Total weight of jalebi is:"+total_wt+"grams");
    	System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
           
    	 System.out.println("do you want any other item (y/n)");
    	   choice=sc.next().charAt(0);
    	      if(set)
    	        { 
    	    	
    	          break;
    	        }
    	     else
    		    {
    	    	 set=false;
                 System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
                 break;
                }
        case 4:System.out.println("Enter the quantity:");
        quantity=sc.nextInt();
        
        System.out.println("Enter the weight in gms");
        wt=sc.nextInt();
        
        current=new mothichur();
        total_wt=current.calweight(quantity,wt);
        
        a[choice-1]+=total_wt;
        totalgift_wt+=total_wt;
        System.out.println("Total weight of Mothichur is:"+total_wt+"grams");
    	System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
           
    	 System.out.println("do you want any other item (y/n)");
    	   choice=sc.next().charAt(0);
    	      if(set)
    	        { 
    	    	
    	          break;
    	        }
    	     else
    		    {
    	    	 set=false;
                 System.out.println("Total weight of gift box is:"+totalgift_wt+"grams");
                 break;
                }
                
    	 default:System.out.println("Select only choices from(1-4");     
    	      
    	      
    	      
                   
        }
       
	}
        System.out.println("Enter lower range of weight in grams!");
        int lower=sc.nextInt();
        System.out.println("Enter upper range of weight in grams!");
        int upper=sc.nextInt();
        
        for(int i=0;i<4;i++)
        {
        	if(a[i]>=lower && a[i]<=upper)
        	{
        		System.out.print(i+1+"."+s[i]+"\n");
        		System.out.println("  weight:"+a[i]);
        	}
        }
        
        
        
        
        sc.close();
}
}