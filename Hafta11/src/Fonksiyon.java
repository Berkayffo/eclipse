import java.util.ArrayList;
import java.util.Scanner;

public class Fonksiyon {

	public static void KisiKayitEkle(Scanner giris, ArrayList<Kisi> kisiListesi) {
		System.out.print("Tc No giriniz : ");
		String tc = giris.next();
		while (tc.trim().isEmpty()) {
			System.out.println("tc Kimlik no boş olamaz tekrar giriniz : ");
			tc = giris.next();
		}
		System.out.print("Ad giriniz : ");
		String ad = giris.next();
		System.out.print("Soyad giriniz : ");
		String soyad = giris.next();
		Kisi kisi1 = new Kisi(tc, ad, soyad);
		kisiListesi.add(kisi1);
		System.out.println(ad + " kaydı eklendi");
	}

	public static void OgrenciKayitEkle(Scanner giris, ArrayList<Ogrenci> ogrenciListesi) {
		System.out.print("Tc No giriniz : ");
		String tc = giris.next();
		while (tc.trim().isEmpty()) {
			System.out.println("tc Kimlik no boş olamaz tekrar giriniz : ");
			tc = giris.next();
		}
		System.out.print("Ad giriniz : ");
		String ad = giris.next();
		System.out.print("Soyad giriniz : ");
		String soyad = giris.next();
		System.out.println("Vize Notu giriniz : ");
		int vn = giris.nextInt();
		System.out.println("Final Notu giriniz : ");
		int fn = giris.nextInt();
		Ogrenci ogrenci1 = new Ogrenci(tc, ad, soyad, vn, fn);
		ogrenciListesi.add(ogrenci1);
		System.out.println(ad + " kaydı eklendi");
	}

	public static void KisiListele(ArrayList<Kisi> kisiListesi) {
		System.out.println("Kişi listesi");
		if (kisiListesi.isEmpty()) {
			System.out.println("Gösterilecek veri listede yok");
			return;
		}
		for (Kisi kisi : kisiListesi) {
			System.out.println(kisi);
		}
	}

	public static void OgrenciListele(ArrayList<Ogrenci> ogrenciListesi) {
		System.out.println("Öğrenci Listesi");
		if (ogrenciListesi.isEmpty()) {
			System.out.println("Öğrenci listesi boş");
			return;
		}
		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci);
		}
	}

	public static void KisiAra(Scanner giris, ArrayList<Kisi> kisiListesi) {
		if (kisiListesi.isEmpty()) {
			System.out.println("Gösterilecek veri listede yok");
			return;
		}
		System.out.println("Aranacak Tc No : ");
		String tcAra = giris.next();
		boolean bosmu = true;
		for (Kisi kisi : kisiListesi) {
			if (kisi.getTcNo().equalsIgnoreCase(tcAra)) {
				kisi.Yazdir();
				bosmu = false;
			}
		}
		if (bosmu)
			System.out.println("Aranan kayıt bulunamadı");
	}

	public static void OgrenciAra(Scanner giris, ArrayList<Ogrenci> ogrenciListesi) {
		if (ogrenciListesi.isEmpty()) {
			System.out.println("Öğrenci listesi boş");
			return;
		}
		boolean bosmu = true;
		System.out.println("Aranacak Öğrenci Adı : ");
		String adAra = giris.next();
		for (Ogrenci ogrenci : ogrenciListesi) {
			if (ogrenci.getAd().equalsIgnoreCase(adAra)) {
				ogrenci.Yazdir();
				bosmu = false;
			}
		}
		if (bosmu)
			System.out.println("Aranan kayıt bulunamadı");
	}

	public static void Enb(ArrayList<Ogrenci> ogrenciListesi) {
		if (ogrenciListesi.isEmpty()) {
			System.out.println("Kayıtlı Öğrenci bulunamadı");
			return;
		}
		int enbVize = ogrenciListesi.get(0).getVizeNotu();
		Ogrenci enbOgrenci = null;
		for (Ogrenci ogrenci : ogrenciListesi) {
			if (ogrenci.getVizeNotu() > enbVize) {
				enbVize = ogrenci.getVizeNotu();
				enbOgrenci=ogrenci;
			}
		}
		System.out.println("En büyük Öğrenci Bilgileri : ");
		enbOgrenci.Yazdir();
	}
}
