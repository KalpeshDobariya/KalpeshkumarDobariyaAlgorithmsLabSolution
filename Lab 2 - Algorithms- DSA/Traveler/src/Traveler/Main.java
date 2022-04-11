package Traveler;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) { 
	
	
	//MergeSortlmplementation mergeSortImplementation = new MergeSortlmplementation;
	//NotesCount notesCount = new NotesCount();
    
    BubbleSort bubbleSort= new BubbleSort();
    DenominationCount denoCount = new DenominationCount();
    
	System.out.println("Enter the array size of denominations "); 
	Scanner sc = new Scanner(System.in); 
	int denominationSize = sc.nextInt(); 
	
	int[] DenoNotes = new int[denominationSize]; 
	System.out.println("Enter the currency denominations value");
	for (int i = 0; i < denominationSize; i++) { 
	DenoNotes[i] = sc.nextInt(); } 
	
	System.out.println("Enter the amount you want to pay"); 
	
	int amount = sc.nextInt(); 
	bubbleSort.BubbleSort(DenoNotes);
	denoCount.DenominationCount(DenoNotes, amount); 

}}
