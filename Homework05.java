package Homeworks;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// kullanici 5 girdiyse bu islemin sonucunda konsolda 5!=1*2*3*4*5 = 120 yazdiralim
		
		   Scanner scan=new Scanner(System.in);
	       System.out.println("lutfen 10'dan kucuk pozitif bir tam sayi girin ");
	       
	       int sayi=scan.nextInt();
	       int faktoryel=1;
	       
	       System.out.print(sayi+"!=");
	       
	       for (int i = 1; i <= sayi; i++) {
	           faktoryel*=i;
	       }
	       
	       for ( int j = 1; j<=sayi; j++)  {   
        	   System.out.print(j);
        	   if (j != sayi) {
        		   System.out.print("*"); 
        	   }
	       }
	       
	       System.out.print("="+faktoryel);      

	       scan.close();	        
	       
	       

	}

}
