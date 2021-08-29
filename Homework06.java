package Homeworks;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// yildizlardan eskenar ucgen yapimi
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girin");
		int sayi=scan.nextInt();
		
		for (int satirNo = 1; satirNo <= sayi; satirNo++) {
            
			for (int i = sayi-satirNo; i>0; i--) { 
			
				System.out.print(" ");
			}
			for (int i = 1; i <= (2*satirNo)-1; i++) {  
	        	
	            System.out.print("*");    
	        }
			 
			 System.out.println("");
        }
		

	    
	    
	    scan.close();	    
        }
	}


