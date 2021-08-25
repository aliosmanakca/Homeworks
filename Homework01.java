package Homeworks;

import java.util.Scanner;

public class Homework01 { 

	public static void main(String[] args) {
		/* A şehrinden uçamak isteyen bir kişi B şehrine 500km C şehrine 700km D şehrine
		 * 900 km mesafededir. km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat
		 * %50 indirim 12 ve 24 yas arasindaysa 10% indirim 65 yasindan buyukse 30%
		 * indirim gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim bu
		 * kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet ucretini
		 * hesaplayan program yazınız
		 */ 
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("donus bileti de alacaksaniz evet yoksa hayir yazin");
		String donus=scan.next().toLowerCase();
		int sonuc = 0;
		switch (donus) {
		case "evet": System.out.println("yasinizi girin");
		             sonuc=1; 
		    break;
		case "hayir": System.out.println("yasinizi girin");
	        break;  	
		default : System.out.println("gecerli cevap girin");
		}
		
		int yas=scan.nextInt();
		
		System.out.println("nereye gideceksiniz (B,C,D)");
		String sehir = scan.next();
	
		int mesafe = 0;
		double kmBirimFiyat = 0.10;
		double indirim = 0;
		if (sehir.equalsIgnoreCase("b")) {
			mesafe = 500;
		} else if (sehir.equalsIgnoreCase("c")) {
			mesafe = 700;
		} else if (sehir.equalsIgnoreCase("d")) {
			mesafe = 900;
		} else {
			System.out.println("Yanlis girdiniz. Sadece B,C veya D sehri olabilir");
			sonuc=-1;
		}
		
		
		if (yas < 12) {
			indirim = 0.5;
		} else if (yas >= 12 && yas <= 24) {
			indirim = 0.10;
		} else if (yas > 65) {
			indirim = 0.30;
		} else {
			indirim = 0;
		}
		
		double tekYonBiletFiyati = (mesafe * kmBirimFiyat) - (mesafe * kmBirimFiyat * indirim);
		
		if (sonuc==1)  {
			System.out.println("extra yuzde 20 indirim kazandiniz");
			System.out.println("bilet fiyatiniz : " + (2 * tekYonBiletFiyati - 2 * tekYonBiletFiyati * 0.2));
		} else if (sonuc==0)  {
			System.out.println("bilet fiyatiniz : " + tekYonBiletFiyati);
		}else {
			System.out.println("");
		}
		
			
scan.close();		
	}

}
