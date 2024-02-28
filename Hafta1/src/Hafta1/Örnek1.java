package Hafta1;

import java.util.Scanner;

public class Örnek1 {

//TAM SAYI
// byte:-128,+128 1 byte
//short -32768,+32767 2 byte
//int 4 byte
//long 8 byte

//ONDALIKLI SAYI
//float 4byte noktadan sonra 7 hane
//double 8 byte noktadan sonra 15 hane
//long float 10 byte

//char 2 byte
//string verinin +1 fazlası kadar yer kaplar
 	
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Kitap sayısı giriniz:");
		byte ks=giris.nextByte();
		String kitapAdi[]=new String[ks];
		String yazarAdi[]=new String[ks];
		String yayınEviAdi[]=new String[ks];
		int sayfaSayısı[]=new int[ks];
		int fiyat[]=new int[ks];
		byte menu;
		for (int i = 0; i < ks; i++) {
		System.out.println((i+1)+".kitap adı :");
		kitapAdi[i]=giris.next();
		System.out.println((i+1)+".yazar adı :");
		yazarAdi[i]=giris.next();
		System.out.println((i+1)+".yayın evi adı :");
		yayınEviAdi[i]=giris.next();
		System.out.println((i+1)+".sayfa sayısı :");
		sayfaSayısı[i]=giris.nextInt();
		System.out.println((i+1)+".fiyatı :");
		fiyat[i]=giris.nextInt();
		}//Veri giriş sonu
		for(;;) {
			Fonksiyonlar.menu();
			menu=giris.nextByte();
			switch (menu) {
			case 1:Fonksiyonlar.listele(kitapAdi,yazarAdi,yayınEviAdi,sayfaSayısı,fiyat);
				break;
			case 2:System.out.println("Aranacak kitap adını giriniz : ");
				String arananKitapAdi=giris.next();
				Fonksiyonlar.arama(arananKitapAdi,kitapAdi,yazarAdi,yayınEviAdi,sayfaSayısı,fiyat);
				break;
			case 3:Fonksiyonlar.EnDusuk(kitapAdi,yazarAdi,yayınEviAdi,sayfaSayısı,fiyat);

				break;
			case 4:int OrtFiyat=Fonksiyonlar.Ortalama(fiyat);
			System.out.println("Kitapların ortalama fiyatı"+OrtFiyat);
				
				break;
			case 5:System.out.println("Program bitti");
			System.exit(0);
				break;

			default:System.out.println("Yanlış işlem girdiniz");
				break;
			}
		}
	}
}
