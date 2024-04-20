
public class calısan {

	public static void main(String[] args) {

		Ogrenci ogr = new Ogrenci();// boş nesne
		ogr.Yazdir();
		System.out.println("------------------------");
		ogr.setAd("Ali");
		ogr.setVn(45);
		ogr.setFn(50);
		ogr.BasariNot();
		ogr.Yazdir();

		Ogrenci ogr1 = new Ogrenci("Ayşe", 50, 70);// parametreli nesne
		ogr1.Yazdir();
		System.out.println("------------------------");
		System.out.println(ogr1.toString());

	}

}
