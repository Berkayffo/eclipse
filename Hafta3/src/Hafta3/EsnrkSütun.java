package Hafta3;

import java.util.Scanner;

public class EsnrkSütun { 

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String subeler[] = { "Şube 1", "Şube 2", "Şube 3" };
		String model[] = { "Model 1", "Model 2", "Model 3", "Model 4" };
		byte sa = (byte) subeler.length;
		int ort[] = new int[sa];
		int min[] = new int[sa];
		int max[] = new int[sa];
		int urunMiktari[][] = { { 250, 300 }, { 100, 500, 300 }, { 3, 6, 2, 9 } };
		/*
		 * System.out.println(urunMiktari.length); for (int i = 0; i <
		 * urunMiktari.length; i++) {
		 * System.out.println(i+" satırın uzunluğu : "+urunMiktari[i].length); }
		 * System.out.println(urunMiktari[1].length);
		 */
		// Hesaplama işlemleri
		for (int i = 0; i < urunMiktari.length; i++) {
			ort[i] = Ortalama(urunMiktari[i]);
			min[i] = Minimum(urunMiktari[i]);
			max[i] = Maksimum(urunMiktari[i]);
		}
		System.out.printf("\n%-10s", "Şubeler");
		for (int i = 0; i < model.length; i++) {
			System.out.printf("%10s", model[i]);
		}
		System.out.printf("%10s %10s %10s", "Ortalama", "Minimum", "Maksimum");
		for (int i = 0; i < urunMiktari.length; i++) {
			System.out.printf("\n%-10s", subeler[i]);
			for (int j = 0; j < urunMiktari[i].length; j++) {
				System.out.printf("%10s", urunMiktari[i][j]);
			}
			System.out.printf("%10d %10d %10d", ort[i],min[i],max[i]);
		}
	}

	private static int Minimum(int[] is) {
		int min = is[0];
		for (int i = 0; i < is.length; i++) {
			if (is[i] < min)
				min = is[i];
		}
		return min;
	}

	private static int Maksimum(int[] is) {
		int max = is[0];
		for (int i = 0; i < is.length; i++) {
			if (is[i] > max)
				max = is[i];
		}
		return max;
	}

	private static int Ortalama(int[] is) {
		int toplam = 0;
		for (int i = 0; i < is.length; i++) {
			toplam += is[i];
		}
		return toplam / is.length;
	}

}
