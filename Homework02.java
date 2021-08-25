package Homeworks;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kmBirimFiyat = 0.10;
		int mesafe = 0;
		double indirim = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz: ");
		int yas = scan.nextInt();
		System.out.println("Hangi sehre ucmak istersiniz (B,C,D): ");
		String sehir = scan.next();
		System.out.println("Biletiniz gidis donus mu belirtiniz (Gidis Donus = true/ Tek Yon = false) ");
		boolean biletTipi = scan.nextBoolean();
		// sehir olayini bu sekilde tanimlayip istedigimiz yerde kullanabiliriz
		// yeni bir sehir eklemek istersekte sadece burdan degistirmemiz yeterli
		// olacaktir
		if (sehir.equalsIgnoreCase("b")) {
			mesafe = 500;
		} else if (sehir.equalsIgnoreCase("c")) {
			mesafe = 700;
		} else if (sehir.equalsIgnoreCase("d")) {
			mesafe = 900;
		} else {
			System.out.println("Yanlis girdiniz. Sadece B,C veya D sehri olabilir");
		}
		if (yas < 12) {
			indirim = 0.5;
		} else if (yas >= 12 && yas <= 24) {
			indirim = 0.10;
		} else if (yas > 65) {
			indirim = 0.30;
		} else {
			System.out.println("size yas indirimi yapilamiyor");
		}
		double tekYonBiletFiyati = (mesafe * kmBirimFiyat) - (mesafe * kmBirimFiyat * indirim);
		if (biletTipi) {
			System.out.println("extra yuzde 20 indirim kazandiniz");
			double gidisDonusToplamFiyat = 2 * tekYonBiletFiyati - 2 * tekYonBiletFiyati * 0.2;
			System.out.println("bilet fiyatiniz : " + gidisDonusToplamFiyat);
		} else {
			System.out.println("bilet fiyatiniz : " + tekYonBiletFiyati);
		}
		scan.close();

	}

}

