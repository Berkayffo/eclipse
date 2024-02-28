package Hafta1;

public class Fonksiyonlar {

	public static void menu() {
		System.out.println("1.Listeleme\n2.Ad arama\n3.En düşük fiyat\n4.Ortalana\n5.Çıkış");
		

	}

	public static void listele(String[] kitapAdi, String[] yazarAdi, String[] yayınEviAdi, int[] sayfaSayısı,
			int[] fiyat) {
		for(int i=0; i<fiyat.length; i++) {
			System.out.println("Kitap Adı:"+kitapAdi);
			System.out.println("Yazar Adı:"+yazarAdi);
			System.out.println("Yayın Evi Adı:"+yayınEviAdi);
			System.out.println("Sayfa sayısı:"+sayfaSayısı);
			System.out.println("Fiyat:"+fiyat);




		}
		
	}

	public static void arama(String arananKitapAdi, String[] kitapAdi, String[] yazarAdi, String[] yayınEviAdi,
			int[] sayfaSayısı, int[] fiyat) {
		for(int i=0; i<fiyat.length; i++) {
			if(arananKitapAdi.equalsIgnoreCase(kitapAdi[i]));
			System.out.println("Kitap Adı:"+kitapAdi);
			System.out.println("Yazar Adı:"+yazarAdi);
			System.out.println("Yayın Evi Adı:"+yayınEviAdi);
			System.out.println("Sayfa sayısı:"+sayfaSayısı);
			System.out.println("Fiyat:"+fiyat);
		}
		
	}

	public static void EnDusuk(String[] kitapAdi, String[] yazarAdi, String[] yayınEviAdi, int[] sayfaSayısı,
			int[] fiyat) {
		int minSayfa=sayfaSayısı[0];
		for (int i = 0; i < sayfaSayısı.length; i++) {
			if(sayfaSayısı[i]<minSayfa) minSayfa=sayfaSayısı[i];
		}
		for(int i=0; i<fiyat.length; i++) {
			if(minSayfa==sayfaSayısı[i]);
			System.out.println("Kitap Adı:"+kitapAdi);
			System.out.println("Yazar Adı:"+yazarAdi);
			System.out.println("Yayın Evi Adı:"+yayınEviAdi);
			System.out.println("Sayfa sayısı:"+sayfaSayısı);
			System.out.println("Fiyat:"+fiyat);
		}
		
	}
	

	public static int Ortalama(int[] fiyat) {
		int toplamFiyat=0;
		for (int i = 0; i < fiyat.length; i++) {
			toplamFiyat+=fiyat[i];
			
		}
		return toplamFiyat/fiyat.length;
	}

}
