package Hafta4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ödev {

	public static void main(String[] args) {
		// kitap adı, yazarı, yayınevi,sayfa sayısı, basım yılı, fiyatı bilgilerini
		// alıcaksın
		// 1. kayıt girişi 2.listeleme 3.isim arama 4.düzeltme 5.silme 6.ortalam 7.en
		// büyük sayfa sayısı kime ait 8. en düşük sayfa sayısı 9.çıkış
		Scanner giris = new Scanner(System.in);
		List<String> ad = new ArrayList();
		List<String> yazar = new ArrayList();
		List<String> yayınEvi = new ArrayList();
		List<Long> ss = new ArrayList();
		List<Long> by = new ArrayList();
		List<Long> fiyat = new ArrayList();
		byte menu;
		for (;;) {
			fonksiyon.menu();
			menu = giris.nextByte();
			switch (menu) { 
			case 1:
				fonksiyon.kayıt(ad, yazar, yayınEvi, ss, by, fiyat, giris);
				break;

			case 2:
				fonksiyon.listele(ad, yazar, yayınEvi, ss, by, fiyat);
				break;

			case 3:
				System.out.println("Aranacak adı girin : ");
				String aranan = giris.next();
				fonksiyon.arama(ad, yazar, yayınEvi, ss, by, aranan);
				break;

			case 4:
				System.out.println("Düzeltilecek adı girin : ");
				String düzeltilecekAd = giris.next();
				fonksiyon.düzeltme(ad, yazar, yayınEvi, ss, by, düzeltilecekAd, giris);
				break;

			case 5:
				System.out.println("Silinecek adı girin : ");
				String silinecekAd = giris.next();
				fonksiyon.silme(ad, yazar, yayınEvi, ss, by, silinecekAd, giris);
				break;

			case 6:
				Long SOrt = fonksiyon.ortalama(ss);
				System.out.println("Sayfa sayısı ortalaması : " + SOrt);

				break;

			case 9:
				System.out.println("Program bitti...");
				System.exit(0);

				break;

			default:
				System.out.println("Yanlış menü değeri girdiniz");
				break;
			}

		}

	}

}
