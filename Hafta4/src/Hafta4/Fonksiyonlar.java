package Hafta4;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void MenuGoruntule() {
		System.out.println("1-Kayıt giriş\n2-Listeleme\n3-İsim ile arama\n4-Düzeltme\n5-Silme\n6-Ortalama\n7-Çıkış");
		
	}

	public static void KayıtGiris(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, Scanner giris) {
		System.out.println("İsim giriniz: ");
		ad.add(giris.next());
		System.out.println("Vize notu giriniz: ");
		byte vnot=giris.nextByte();
		System.out.println("Final notu giriniz: ");
		byte fnot=giris.nextByte();
		vn.add(vnot);
		fn.add(fnot);
		bn.add((byte) (vnot*0.4+fnot*0.6));
		System.out.println("Başarıyla kayıt yaptınız.");  
	}

	public static void Listele(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn) {
		for (int i = 0; i < ad.size(); i++) {
			//System.out.println("İsim: "+ad.get(i));
			//System.out.println("Vize notu : "+vn.get(i));
			//System.out.println("Final notu : "+fn.get(i));
			//System.out.println("Başarı notu : "+bn.get(i));
			//System.out.println("-------------------");
			Yazdır(i,ad.get(i),vn.get(i),fn.get(i),bn.get(i)); 
		}
	} 

	private static void Yazdır(int i, String ad, Byte vn, Byte fn, Byte bn) {
		System.out.println("İndis değeri : "+i);
		System.out.println("İsim : "+ad);
		System.out.println("Vize notu : "+vn);
		System.out.println("Final notu : "+fn);
		System.out.println("Başarı notu : "+bn);
		System.out.println("--------------"); 
		
	}

	public static void AdArama(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String arananAd) {
		for (int i = 0; i < ad.size(); i++) {
			if(ad.get(i).equalsIgnoreCase(arananAd)) {
			Yazdır(i,ad.get(i),vn.get(i),fn.get(i),bn.get(i)); 
			
		}
		}	
		
	}
	public static void AdDüzeltme(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String düzeltilecekAd,Scanner giris) {
		Fonksiyonlar.AdArama(ad, vn, fn, bn, düzeltilecekAd);
		
		System.out.println("Hangi indisteki kayıt düzeltilecek : ");
		int düzeltilecekIndis=giris.nextInt();
		
		System.out.println("Yeni isim giriniz : ");
		ad.set(düzeltilecekIndis, giris.next());
		
		System.out.println("Yeni vize notu giriniz : ");
		byte vnot = giris.nextByte();
		
		System.out.println("Yeni final notu giriniz : ");
		byte fnot = giris.nextByte();
		
		vn.set(düzeltilecekIndis, vnot);
		fn.set(düzeltilecekIndis, fnot);
		bn.set(düzeltilecekIndis, (byte) (vnot * 0.4 + fnot * 0.6)); 
		System.out.println(düzeltilecekAd+"Kaydı düzeltildi");
	}

	public static void AdSilme(List<String> ad, List<Byte> vn, List<Byte> fn, List<Byte> bn, String silinecekAd,Scanner giris) {
		Fonksiyonlar.AdArama(ad, vn, fn, bn, silinecekAd);
		System.out.println("Hangi indisteki kayıt silinecek : ");
		int silinecekIndis=giris.nextInt();
		ad.remove(silinecekIndis);
		vn.remove(silinecekIndis);
		fn.remove(silinecekIndis);
		bn.remove(silinecekIndis);
		System.out.println(silinecekAd+"Listeden başarıyla silindi.");
		}

	public static byte Ortalama(List<Byte> sınavNotlar) {
		int toplam=0;
		for(Byte sınavNot : sınavNotlar) {
			toplam+=sınavNot;
		}
		return (byte) (toplam/sınavNotlar.size()); 
	}

}
