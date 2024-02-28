package Hafta2;

import java.util.Scanner;

public class ÖDEV {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String kisiler[] = { "Ali", "Ayşe", "Fatma" };
		String aylar[] = { "Ocak", "şubat" };
		byte sa = (byte) kisiler.length;
		byte su = (byte) aylar.length;
		int top[] = new int[sa];
		int min[] = new int[sa];
		int max[] = new int[sa];
		int maas[] = new int[sa];
		int harcamaListesi[][] = new int[sa][su];
		int kalanlarListesi[][] = new int[sa][su];
		
		// Maaş ve Harcama Bilgisi Alma
		
		for (int i = 0; i < sa; i++)
		{

			System.out.println(kisiler[i] + " nin maşını giriniz :");
			maas[i] = scn.nextInt();
			
			for (int j = 0; j < su; j++)
			{
				System.out.println(kisiler[i] + " nin " + aylar[j] + " ayının harcamasını giriniz :");
				harcamaListesi[i][j] = scn.nextInt();

			}

		}
		
		//Toplam Harcam Bulma
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				top[i]+= harcamaListesi[i][j];
			}
		}
		
		//Min Bulma
		for (int i = 0; i < sa; i++) {
			min[i] = harcamaListesi[i][0];
			for (int j = 0; j < su; j++) {
				if (harcamaListesi[i][j] <= min[i] ) {
					min[i] = harcamaListesi[i][j];
				}
			}
		}
		
		//Max Bulma
		for (int i = 0; i < sa; i++) {
			max[i] = harcamaListesi[i][0];
			for (int j = 0; j < su; j++) {
				if (harcamaListesi[i][j] >= max[i] ) {
					max[i] = harcamaListesi[i][j];
				}
			}
		}
		
		//Elde Kalan Bulma
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				kalanlarListesi[i][j]= maas[i]-harcamaListesi[i][j];
			}
		}
		
		//Tablo 1 (Harcama)
		System.out.print("Kişiler\t");
		for (int i = 0; i < su; i++) {
			System.out.print(aylar[i]+"\t");
		}
		System.out.println("Top\tOrt\tMin\tMax");
		for (int i = 0; i < sa; i++) {
			System.out.print(kisiler[i]+"\t");
			for (int j = 0; j < su; j++) {
				System.out.print(harcamaListesi[i][j]+"\t");
			}
			System.out.println(top[i]+"\t"+(top[i]/su)+"\t"+min[i]+"\t"+max[i]);
		}
		
		System.out.println();
		
		//Tablo 2 (Elde Kalan)
				System.out.print("Kişiler\t");
				for (int i = 0; i < su; i++) {
					System.out.print(aylar[i]+"\t");
				}
				System.out.println();
				for (int i = 0; i < sa; i++) {
					System.out.print(kisiler[i]+"\t");
					for (int j = 0; j < su; j++) {
						System.out.print(kalanlarListesi[i][j]+"\t");
					}
					System.out.println();
				}

	}

}

