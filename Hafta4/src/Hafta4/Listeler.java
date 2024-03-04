package Hafta4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listeler {

	public static void main(String[] args) {
		List<String> ad=new ArrayList<String>();
		ad.add("Ali");
		System.out.println(ad); 
		ad.add("Veli");
		System.out.println(ad);
		ad.add("Ayşe");
		System.out.println(ad);
		ad.add(1, "Berkay");
		System.out.println(ad);
		ad.add(0, "Ahmet");
		System.out.println(ad);
		System.out.println("Listenin uzunluğu : "+ad.size());
		System.out.println("Zeynep ad listesinde var mı: "+ad.contains("Zeynep"));
		System.out.println("Berkay ad listesinde var mı: "+ad.contains("Berkay"));
		System.out.println(ad.get(0));
		for (int i = 0; i < ad.size(); i++) {
			System.out.println(i+".isim : "+ad.get(i));
			
		}
		System.out.println("----------------");
		for(String isim : ad ) {
			System.out.println(isim);
		}
		System.out.println("-------------");
		for (Iterator iterator = ad.iterator(); iterator.hasNext();) {
			String isim = (String) iterator.next();
			System.out.println(isim);
		}
		//ad.clear();//tüm listeyi siler
		String silinen=ad.remove(0);
		System.out.println(silinen+" listenin geri kalanı : "+ad);
		boolean silinenAd=ad.remove("Berkay");
		System.out.println(ad);
		ad.set(1, "Mert");
		System.out.println("Güncellenen liste : "+ad);
		System.out.println("Mert kaçıncı indiste : "+ad.indexOf("Mert")); 
 		
	}
}