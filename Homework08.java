package Homeworks;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework08 {
	/*  TODO
    Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak ekleyen
    ve sonrasında her dakikanın ilk 10 saniyesinde kaydolmuş olanları şanslı
    kullanıcı olarak ekrana yazdıran bir uygulamadır.Bunun için;
    1- Bir user class oluşturun fields: name , registerDate (LocalDateTime cinsinden)
    2- Registration isminde bir class oluşturun ve register isminde bir metod ekleyerek
      Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i return edin.
    3- Registration classı na aynı zamanda kendine verilen ArrayListteki userlardan
      her dakikanın ilk 10 saniyesinde kaydolmuşları yazdıran printHappyUsers isminde
      bir metod daha ekleyiniz.
    İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.
    public static void main(String[] args) {
       Registration userReg = new Registration();
       ArrayList<User> register = userReg.register();
       userReg.printHappyUsers(register);
      }
​
 */
	
	static Scanner scan =new Scanner (System.in);
	static List <String> liste = new ArrayList<>();

	public static void main(String[] args) {
		
		printHappyUsers();
		
		tumliste();

	}
	
	private static void tumliste() {
		
		System.out.println("tum liste : "+liste); 
		
	}

	private static void printHappyUsers() {
		
        List <String> sanslilar = new ArrayList<>(); 
		
		for (int i = 1; i <=4; i++) {
			
		System.out.println("adinizi girin");
		String isim = scan.next();
		liste.add(isim);
		System.out.println("girdiginiz isim : "+isim+"  "+"vakit : "+LocalTime.now()); 
		LocalTime zaman = LocalTime.now();   
		if (zaman.getSecond()<11) {
			sanslilar.add(isim);
		}
		 
		} 
		
		System.out.println("dakikanin ilk on saniyesinde girenler : "+sanslilar);
		
	}


}
