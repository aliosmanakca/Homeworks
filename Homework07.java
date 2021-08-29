package Homeworks;

import java.util.Scanner;

public class Homework07 {
	
	

	public static void main(String[] args) {
		/* kullanicidan 15 karakterli bir sifre girmesini isteyin
		 * eger tekrar eden karakter varsa gecersiz sifre 
		 * yoksa gecerli sifre yazdirin */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 15 karakterli bir sifre giriniz");
        String sifre = scan.next();
        
        int sayac=0;
        
        if (sifre.length() == 15) {
            for (char karakter = ' '; karakter < '~'; karakter++) {    
                if (sifre.indexOf(karakter) != -1 && sifre.lastIndexOf(karakter) == sifre.indexOf(karakter)) {
                	     sayac++; 
                	    
               }
                
               }
            if (sayac==15) {
            	System.out.println("gecerli sifre");
            } else {
            	System.out.println("gecersiz sifre");
            }
        } 
        else {
            System.out.println("girdiginiz kelime 15 karakterden olusmuyor lutfen 15 karakter giriniz");
	  }
        scan.close(); 
	}

}
