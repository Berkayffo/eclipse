package Hafta2;

import java.util.Scanner;

public class Satıs {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String iller[] = { "Sakarya", "Adana", "Ankara", "Trabzon" };
		String aylar[] = { "Ocak", "Şubat", "Mart" };
		byte sa = (byte) iller.length;
		byte su = (byte) aylar.length;
		int ort[]=new int[sa];
		int min[]=new int[sa];
		int max[]=new int[sa];
		int sm[][] = new int[sa][su];
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				System.out.print(iller[i] + " ilinin " + aylar[j] + "satışı gir");
				sm[i][j] = giris.nextInt();
			}
		} // i sonu
		 //	ortalama hesabı
		for (int i = 0; i < sa; i++) {
			for (int j = 0; j < su; j++) {
				ort[i]+=sm[i][j];
			}
		}
		//max hesabı
		for (int i = 0; i < sa; i++) {
			max[i]=sm[i][0];
			for (int j = 0; j < su; j++) {
				if( sm[i][j]>max[i]) {
					max[i]=sm[i][j];
				
				}
			}
		}
		//min hesabı
		for (int i = 0; i < sa; i++) {
			min[i]=sm[i][0];
			for (int j = 0; j < su; j++) {
				if( sm[i][j]<min[i]) {
					min[i]=sm[i][j];
				
				}
			}
		}
		int gtop=0,gmin=sm[0][0],gmax=sm[0][0];
		for (int i  = 0; i < sa ; i ++) {
			for (int j = 0; j < su; j++) {
				gtop+=sm[i][j];
				if(sm[i][j]<gmin) gmin=sm[i][j];
				if(sm[i][j]>gmax) gmax=sm[i][j];
			}
		}
		System.out.print("İller\t");
		for (int i = 0; i < su; i++) {
			System.out.print(aylar[i] + "\t");
		}
		System.out.println("Ort\tMin\tMax");
		for (int i = 0; i < sa; i++) {
			System.out.print(iller[i] + "\t");
			for (int j = 0; j < su; j++) {
				System.out.print(sm[i][j] + "\t");
			} //
			System.out.println(ort[i]/su+"\t"+min[i]+"\t"+max[i]);
		}
		System.out.println("\nGenel Ortalama : "+gtop/(sa*su));
		System.out.println("\nGenel Minimum : "+gmin);
		System.out.println("\nGenel Maksimum : "+gmax);
	}

}

