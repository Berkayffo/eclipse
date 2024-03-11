import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<String> ad = new ArrayList<>();
			List<String> yazar = new ArrayList<>();
			List<String> yayın = new ArrayList<>();
			List<Long> sayfaSayisi = new ArrayList<>();
			List<Long> basimYili = new ArrayList<>();
			List<Long> fiyat = new ArrayList<>(); 

			byte menuSecimi;

			while (true) {
				Fonksiyonlar.menuGoruntule();
				menuSecimi = scanner.nextByte();

				switch (menuSecimi) {
				case 1:
					Fonksiyonlar.kayitEkle(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);
					break;
				case 2:
					Fonksiyonlar.listele(ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);
					break;
				case 3:
					Fonksiyonlar.isimAra(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);
					break;
				case 4:
					Fonksiyonlar.duzelt(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);
					break;
				case 5:
					Fonksiyonlar.sil(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);
					break;
				case 6:
					Fonksiyonlar.sayfaSayisiOrtalamaHesapla(sayfaSayisi);
					break;
				case 7:
					Fonksiyonlar.enBuyukSayfaSayisi(ad, sayfaSayisi);
					break;
				case 8:
					Fonksiyonlar.enDusukSayfaSayisi(ad, sayfaSayisi);
					break;
				case 9:
					System.out.println("Program sonlandırılıyor...");
					System.exit(0);
					break;
				default:
					System.out.println("Geçersiz menü seçimi. Tekrar deneyin.");
					break;
				}
			}
		}
	}
}
