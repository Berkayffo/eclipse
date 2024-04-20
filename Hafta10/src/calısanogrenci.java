import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calısanogrenci {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		byte menu;
		for (;;) {
			System.out.println("0-Çıkış\n1-KAyıt ekle\n2-Listele\n3-İsim arama\n4-Ortalama");
			menu = giris.nextByte();
			switch (menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:
				Fonksiyonlar.KayitEkle(giris, ogrenciler);
				break;
			case 2:
				Fonksiyonlar.Listele(ogrenciler);
				break;
			case 3:
				System.out.println("Aranacak ismi giriniz :");
				String arananAd = giris.next();
				Fonksiyonlar.AdArama(arananAd,ogrenciler);
				break;
			case 4:Fonksiyonlar.Ortalama(ogrenciler);
				break;
			default:
				System.out.println("Yanlış Menü değeri");
				break;
			}
		}

	}

}
