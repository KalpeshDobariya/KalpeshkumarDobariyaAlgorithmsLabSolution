package Traveler;

public class DenominationCount {
	
	public void DenominationCount(int DenoNotes[], int amount) { 
		int[] noteCount = new int[DenoNotes.length];
		 
	try { 
		for (int i = 0; i < DenoNotes.length; i++) { 
			if (amount >= DenoNotes[i]) { 
				noteCount[i] = amount / DenoNotes[i];
				amount = amount - noteCount[i] * DenoNotes[i]; }}
		 
		if (amount > 0) { 
			System.out.println("exact amount cannot be given with the highest denomination"); } 
		
		else { System.out.println("Your payment in order to give min no of notes is"); 
		    for (int i = 0; i < DenoNotes.length; i++) { 
			if (noteCount[i] != 0) { 
				System.out.println(DenoNotes[i] + ":" + noteCount[i]); }}
		}}
	
	catch (ArithmeticException e) { 
			System.out.println(e+ " notes of denomination 0 is not valid"); 
		}}

}
