package payMoney;

import java.util.Scanner;

class ArrayTransaction
{
	int Array_Size,targetValue,numberofTarget;
	boolean b=false;
	int Array[];
	Scanner SC=new Scanner(System.in);
	
	//Method revoke from Main class
	void TargetSearchOp() {
		System.out.println("Enter the size of transaction array.");
		Array_Size = SC.nextInt();
		Array = new int[Array_Size];
		System.out.println("Enter the values in array.");
		
		//Method-2 to insert transaction values in array
		insertTransactionValues();
		System.out.println();
		    
		//for Number of target Search Operation   
		System.out.print("Enter the total no of targets that needs to be achieved = ");
		numberofTarget = SC.nextInt();
		for(int a=1;a<= numberofTarget;a++) {
		searchTargetValue();}	
		}
		         	   
	//Method-2
	    public void insertTransactionValues() {
		for (int i = 0; i < Array_Size; i++) {
		System.out.print("Value "+(i+1)+ ": ");
		Array[i] = SC.nextInt();}}
		   
    //method-3
       public void searchTargetValue() {
       //Input for Number of targets to check
    	   System.out.println();
    	   System.out.print("Enter the value of target :");
           long targets=SC.nextInt(); 
  	       long sum =Array[0];
  	   
       for (int i = 0; i < Array.length; i++){  
	   
       if (sum >= targets) {
	        System.out.println("Target "+ targets+ " achieved after " + (i+1)+" Transactions") ;
	        System.out.println();
	        b = true;
	        break;}
	   
       else{ 
           if(i<Array_Size-1) {   
	       long a=sum;
	       sum= a+Array[i+1];}
		 
           else{
           b = false ;
	       System.out.println("Given target is not achieved!!!");
	       break;}
	   }}} 
}

//Main Class
public class PayMoney {
	public static void main(String[]args) {
		
	ArrayTransaction targetValue = new ArrayTransaction();
    targetValue.TargetSearchOp();
}
}