package Traveler;

public class BubbleSort { 
	
	public void BubbleSort(int[] denoNotes) {
		
		
		int n = denoNotes.length;  
		int temp = 0;  
		
		for(int i=0; i < n; i++){  
		    for(int j=1; j < (n-i); j++){  
		        if(denoNotes[j-1] < denoNotes[j]){  
		        //swap elements  
		        temp = denoNotes[j-1];  
		        denoNotes[j-1] = denoNotes[j];  
		        denoNotes[j] = temp;}  
		    }} 
}}
		
	

	      
	


