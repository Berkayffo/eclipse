package Hafta4;

import java.util.List;
import java.util.Scanner;

public class fonksiyon {

	public static void menu() {
		System.out.println(
				"1.Kayıt girişi\n2.Listeleme\n3.İsim ile arama\n4.Düzeltme\n5.Silme\n6.Ortalama\n7.En büyük sayfa sayısı\n8.En düşük sayfa sayısı\n9.Çıkış");
	}

	public static void kayıt(List<String> ad, List<String> yazar, List<String> yayınEvi, List<Long> ss, List<Long> by,
			List<Long> fiyat, Scanner giris) {
		System.out.println("Kitap isimi giriniz: "); 
		ad.add(giris.next());
		System.out.println("Yazar ismi giriniz : ");
		yazar.add(giris.next());
		System.out.println("Yayın evi ismi giriniz : ");
		yayınEvi.add(giris.next());
		System.out.println("Safa sayısı giriniz : ");
		long sayfaSayısı = giris.nextLong(); 
		System.out.println("Basım yılı giriniz : ");
		long basımYılı = giris.nextLong();
		System.out.println("Fiyat giriniz : ");
		long f = giris.nextLong();
		System.out.println("Kaydınız tamamlanmıştır..."); 
	}

	public static void listele(List<String> ad, List<String> yazar, List<String> yayınEvi, List<Long> ss, List<Long> by,
			List<Long> fiyat) {
		for (int i = 0; i < ad.size(); i++) {
			Yazdır(i, ad.get(i), yazar.get(i), yayınEvi.get(i), ss.get(i), by.get(i), fiyat.get(i));
		} 

	}

	private static void Yazdır(int i, String ad, String yazar, String yayınEvi, Long ss, Long by, Long fiyat) {
		System.out.println("İndis değeri : " + i);
		System.out.println("Kitap ismi : " + ad);
		System.out.println("Yazar ismi : " + yazar);
		System.out.println("Yayın evi  : " + yayınEvi);
		System.out.println("Sayfa sayısı : " + ss);
		System.out.println("Basım yılı : " + by);
		System.out.println("Fiyat : " + fiyat);
		System.out.println("---------------------------");
	}

	public static void arama(List<String> ad, List<String> yazar, List<String> yayınEvi, List<Long> ss, List<Long> by,
			String aranan) {
		for (int i = 0; i < ad.size(); i++) {
			if (ad.get(i).equalsIgnoreCase(aranan)) { 
				Yazdır(i, ad.get(i), yazar.get(i), yayınEvi.get(i), ss.get(i), by.get(i), null);
			}
		}
	}

	public static void düzeltme(List<String> ad, List<String> yazar, List<String> yayınEvi, List<Long> ss,
			List<Long> by, String düzeltilecekAd, Scanner giris) {

		fonksiyon.arama(ad, yazar, yayınEvi, ss, by, düzeltilecekAd);
		System.out.println("Hangi indisteki kayıt düzeltilecek : ");
		int düzeltilecekIndis = giris.nextInt();
		System.out.println("Yeni isim giriniz : ");
		ad.set(düzeltilecekIndis, giris.next());
		System.out.println("Yeni yazar giriniz : ");
		String yyazar = giris.next();
		System.out.println("Yeni yayın evi giriniz : ");
		String yyayın = giris.next();
		System.out.println("Sayfa sayısı giriniz : ");
		Long sayfa = giris.nextLong();
		System.out.println("Basım yılı giriniz : ");
		Long basım = giris.nextLong();
		yazar.set(düzeltilecekIndis, yyazar);
		yayınEvi.set(düzeltilecekIndis, yyayın); 
		ss.set(düzeltilecekIndis, sayfa);
		by.set(düzeltilecekIndis, basım);
		System.out.println(düzeltilecekAd + "Kaydı düzeltildi");
	}

	public static void silme(List<String> ad, List<String> yazar, List<String> yayınEvi, List<Long> ss, List<Long> by,
			String silinecekAd, Scanner giris) {
		fonksiyon.arama(ad, yazar, yayınEvi, ss, by, silinecekAd);
		System.out.println("Hangi indisteki kayıt silinecek : ");
		int silinecekIndis = giris.nextInt();
		ad.remove(silinecekIndis);
		yazar.remove(silinecekIndis);
		yayınEvi.remove(silinecekIndis);
		ss.remove(silinecekIndis);
		by.remove(silinecekIndis);
		System.out.println(silinecekAd + "Listeden başarıyla silindi.");
	}

	public static Long ortalama(List<Long> sayfalar) {
	   
	    long toplam = 0;
	    for (Long sayfa : sayfalar) {
	        toplam += sayfa;
	    }

	    return toplam / sayfalar.size();
	}

}
