import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		ArrayList<Kisi> kisiListesi = new ArrayList<Kisi>();
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		byte menu;
		while (true) {
			System.out.println("0-Çıkış");
			System.out.println("1-Kisi Kayıt Ekle");
			System.out.println("2-Öğrenci Kayıt Ekle");
			System.out.println("3-Kişi Listele");
			System.out.println("4-Öğrenci Listele");
			System.out.println("5-Kisi ara");
			System.out.println("6-Öğrenci Ara");
			System.out.print("Seçiminiz : ");
			menu = giris.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:
				Fonksiyon.KisiKayitEkle(giris, kisiListesi);
				break;
			case 2:
				Fonksiyon.OgrenciKayitEkle(giris, ogrenciListesi);
				break;
			case 3:
				Fonksiyon.KisiListele(kisiListesi);
				break;
			case 4:
				Fonksiyon.OgrenciListele(ogrenciListesi);
				break;
			case 5:
				Fonksiyon.KisiAra(giris, kisiListesi);
				break;
			case 6:
				Fonksiyon.OgrenciAra(giris, ogrenciListesi);
				break;
			case 7:Fonksiyon.Enb(ogrenciListesi);break;
			default:
				System.out.println("Yanlış Menü Değeri");
				break;
			}
		}
	}

}
