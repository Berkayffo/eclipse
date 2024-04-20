
public class Ogrenci {

	private String ad;
	private int vn;
	private int fn;
	private int bn;

	@Override
	public String toString() {
		return ad + "\t" + vn + "\t" + fn + "\t" + bn;
	}

	public Ogrenci(String ad, int vn, int fn) {
		super();
		System.out.println("Parametreli kurucu fonksiyon");
		this.ad = ad;
		this.vn = vn;
		this.fn = fn;
		BasariNot();
	}

	public Ogrenci() {
		System.out.println("Parametresiz kurucu fonksiyon");
		this.vn = -1;
		this.fn = -1;
		BasariNot();
	}

	public void BasariNot() {
		this.bn = (int) (this.vn * 0.4 + this.fn * 0.6);
	}

	public void Yazdir() {
		System.out.println("Adı : " + this.ad);
		System.out.println("Vize notu : " + this.vn);
		System.out.println("Final notu : " + this.fn);
		System.out.println("Başarı Notu " + this.bn);
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getVn() {
		return vn;
	}

	public void setVn(int vn) {
		this.vn = vn;
	}

	public int getFn() {
		return fn;
	}

	public void setFn(int fn) {
		this.fn = fn;
	}

	public int getBn() {
		return bn;
	}

}
