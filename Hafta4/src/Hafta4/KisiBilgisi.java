package Hafta4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KisiBilgisi {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		List<String> ad=new ArrayList();
		List<Byte> vn=new ArrayList();
		List<Byte> fn=new ArrayList();
		List<Byte> bn=new ArrayList();
		byte menu;
		for(;;) {
			Fonksiyonlar.MenuGoruntule();
			menu=giris.nextByte();
			switch (menu) {
			case 1:Fonksiyonlar.KayıtGiris(ad,vn,fn,bn,giris);
				
				break;
			case 2:Fonksiyonlar.Listele(ad,vn,fn,bn);
				
				break;
			case 3:System.out.println("Aranacak adı girin : "); 
			String arananAd=giris.next();
			Fonksiyonlar.AdArama(ad,vn,fn,bn,arananAd);
	
				break;
			case 4:System.out.println("Düzeltilecek adı girin : "); 
			String düzeltilecekAd=giris.next();
			Fonksiyonlar.AdDüzeltme(ad,vn,fn,bn,düzeltilecekAd,giris);
	
				break;
			case 5:System.out.println("Silinecek adı girin : "); 
			String silinecekAd=giris.next();
			Fonksiyonlar.AdSilme(ad,vn,fn,bn,silinecekAd,giris);
	
				break;
			case 6:
			byte vizeOrt=Fonksiyonlar.Ortalama(vn);
			System.out.println("Vize not Ortalaması : "+vizeOrt);
			byte finalOrt=Fonksiyonlar.Ortalama(fn);
			System.out.println("Final not Ortalaması : "+finalOrt);
			byte basarıOrt=Fonksiyonlar.Ortalama(bn);
			System.out.println("Başarı  Ortalaması : "+basarıOrt);
	
				break;
			case 7:System.out.println("Program bitti...");
			System.exit(0);
				break;
	

			default:System.out.println("Yanlış menü değeri girdiniz");
				break;
			}
		}

	}
}
