package Homeworks;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("musteri kartiniz varsa evet yoksa hayir yazin");
		String kart=scan.next().toLowerCase();
		
		System.out.println("kac adet urun aldiniz");
		int adet=scan.nextInt();
		
		System.out.println("liste fiyati ne kadar");
		int fiyat=scan.nextInt();
		
		switch (kart) {
		
		case "evet":
			if (adet>10) {
				System.out.println("odenecek tutar : "+(fiyat-fiyat*20/100));
			}else {
				System.out.println("odenecek tutar : "+(fiyat-fiyat*15/100));
			}
			break;
		
		case "hayir":
			if (adet>10) {
					System.out.println("odenecek tutar : "+(fiyat-fiyat*15/100));
			}else {
				System.out.println("odenecek tutar : "+(fiyat-fiyat*10/100));
			}
			break;
			
			default : System.out.println("gecerli cevap girin");	
		}
		
scan.close();		
	}

}
