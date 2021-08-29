package Homeworks;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/* Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi methodu kodlayınız....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
      */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. sayiyi girin");
		double sayi1=scan.nextDouble();
		
		System.out.println("yapacaginiz islemin sembolunu girin");
		String sembol=scan.next();
		
		System.out.println("2. sayiyi girin");
		double sayi2=scan.nextDouble();
		
		if (sembol.equals("+")) {
			System.out.println("sonuc : "+ (sayi1+sayi2));
		}
		else if (sembol.equals("-")) {
			System.out.println("sonuc : "+ (sayi1-sayi2));
		}
		else if (sembol.equals("*")) {
			System.out.println("sonuc : "+ (sayi1*sayi2));
		}
		else if (sembol.equals("/")) {
			System.out.println("sonuc : "+ (sayi1/sayi2));
		}
		else {
			System.out.println("dort islemden birini secin");
		}
scan.close();
	}

}
