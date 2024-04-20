import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void KayitEkle(Scanner giris, List<Ogrenci> ogrenciler) {
		System.out.print("İsim giriniz : ");
		String ad1 = giris.next();
		System.out.print("Vize Notu : ");
		int vn1 = giris.nextInt();
		System.out.print("Final Notu : ");
		int fn1 = giris.nextInt();
		Ogrenci ogrenci = new Ogrenci(ad1, vn1, fn1);
		ogrenciler.add(ogrenci);
		System.out.println(ad1 + " Kaydı eklendi");
	}

	public static void Listele(List<Ogrenci> ogrenciler) {
		System.out.println("Ad\tVize\tFinal\tBaşarı");
		/*
		 * for (Ogrenci ogrenci : ogrenciler) { System.out.println(ogrenci.toString());
		 * }
		 */
		for (int i = 0; i < ogrenciler.size(); i++) {
			System.out.println(ogrenciler.get(i).toString());
		}
	}

	public static void AdArama(String arananAd, List<Ogrenci> ogrenciler) {
		/*
		 * for (Ogrenci ogrenci : ogrenciler) {
		 * if(ogrenci.getAd().equalsIgnoreCase(arananAd)) { ogrenci.Yazdir(); } }
		 */
		for (int i = 0; i < ogrenciler.size(); i++) {
			if (ogrenciler.get(i).getAd().equalsIgnoreCase(arananAd)) {
				System.out.println(ogrenciler.get(i).toString());
			}
		}
	}

	public static void Ortalama(List<Ogrenci> ogrenciler) {
		int vnt = 0, fnt = 0, bnt = 0;
		/*
		 * for (Ogrenci ogrenci : ogrenciler) { vnt += ogrenci.getVn(); fnt +=
		 * ogrenci.getFn(); bnt += ogrenci.getBn(); }
		 */
		for (int i = 0; i < ogrenciler.size(); i++) {
			vnt += ogrenciler.get(i).getVn();
			fnt += ogrenciler.get(i).getFn();
			bnt += ogrenciler.get(i).getBn();
		}
		System.out.println("Vize not Ortalaması :" + (vnt / ogrenciler.size()));
		System.out.println("Final not Ortalaması :" + (fnt / ogrenciler.size()));
		System.out.println("Başarı not Ortalaması :" + (bnt / ogrenciler.size()));
	}

}
