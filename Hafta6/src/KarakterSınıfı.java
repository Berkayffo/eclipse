import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KarakterSınıfı {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir string giriniz : ");
		String girilenVeri = giris.next();
		System.out.println("Girilen verinin ilk karakteri : " + girilenVeri.charAt(0));
		System.out.println("Girilen verinin ikinci karakteri : " + girilenVeri.charAt(1));
		System.out.println("Girilen verinin ikinci karakteri : " + girilenVeri.codePointAt(1));
		String ad1 = "ali", ad2 = "Ali", ad3 = "Zeynep";
		System.out.println(ad1 + "compare to : " + ad2 + " = " + ad1.compareTo(ad2));
		System.out.println(ad2 + "compare to : " + ad1 + " = " + ad2.compareTo(ad1));
		System.out.println(ad2 + "compare to : " + ad3 + " = " + ad2.compareTo(ad3));
		System.out.println(ad3 + "compare to : " + ad2 + " = " + ad3.compareTo(ad2));

		System.out.println(ad1 + "compareToIgnoreCase : " + ad2 + " = " + ad1.compareToIgnoreCase(ad2));
		System.out.println(ad2 + "compareToIgnoreCase : " + ad1 + " = " + ad2.compareToIgnoreCase(ad1));
		System.out.println(ad2 + "compareToIgnoreCase : " + ad3 + " = " + ad2.compareToIgnoreCase(ad3));
		System.out.println(ad3 + "compareToIgnoreCase : " + ad2 + " = " + ad3.compareToIgnoreCase(ad2));
		System.out.println(ad2 + " " + ad3);
		String ad4 = ad2.concat(" ");
		System.out.println(ad4.concat(ad3));
		System.out.println(ad3.contains("ey"));
		System.out.println(ad3.contains("a"));

		char veriler[] = { 'n', 'u', 'r' };
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(veriler, 0, 3);// karakter dizisini stringe çevirir
		char[] donusen=myStr2.toCharArray();//stringi karakter dizisine çevirir
		for(char c : donusen) {
			System.out.println(c);
		}
		
		System.out.println("Geriye dönen String: " + myStr2);
		System.out.println(ad3.startsWith("Ze"));
		System.out.println(ad3.startsWith("Ay"));
		System.out.println(ad3.endsWith("ay"));
		System.out.println(ad3.endsWith("ep"));
		String bosAd="";
		System.out.println(bosAd.isEmpty());
		System.out.println(ad1.isEmpty()); 
		String sehir="ankara";
		System.out.println(sehir.indexOf("a"));
		System.out.println(sehir.indexOf("k"));
		System.out.println(sehir.indexOf("a"));
		System.out.println(sehir.lastIndexOf("a"));
		System.out.println(sehir.replace('a', 'z'));
		System.out.println(ad3.toLowerCase());
		System.out.println(ad3.toUpperCase());
		String ad5="         Ali      ";
		System.out.println("|"+ad5+"|");
		System.out.println("|"+ad5.trim()+"|"); 
		System.out.println(ad3.length());
		String adlar = "Ali veli ahmet mehmet aynur nurten";
		String isimler[]=adlar.split(" ");
		for(String isim : isimler) {
			System.out.println(isim);
		}
		Arrays.sort(isimler);
		System.out.println("-------------------");
		for(String isim : isimler) {
			
		}
		Arrays.sort(isimler,Comparator.reverseOrder());
		System.out.println("--------------------");
		for(String isim :isimler ) {
			System.out.println(isim);
		}
		int sayılar[]= {12,4,-5,8,34,25,678,0};
		Arrays.sort(sayılar);
		for(int i:sayılar) {
			System.out.println(i+"\t");
		}
		//Arrays.sort(sayılar,Comparator,reverseOrder());
		System.out.println("--------------");
		for(int i : sayılar) {
			System.out.println(sayılar);
		}
		
		
	}

}
