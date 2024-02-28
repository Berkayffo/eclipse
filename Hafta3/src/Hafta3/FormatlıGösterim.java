package Hafta3;

public class FormatlıGösterim {

	public static void main(String[] args) {
		String ad="Ali";
		byte sb=66;
		int si=34334;
		double sd=23.45678912;
		System.out.printf("Adınız : |%s| yaşınız : %d\n",ad,sb);
		System.out.printf("Adınız : |%15s|yaşınız : %10d\n",ad,sb);
		System.out.printf("Adınız : |%15s|\n",ad);
		System.out.printf("|%f|\n",sd);
		System.out.printf("|%15.3f|\n",sd);
		System.out.printf("|%-15.3f|\n",sd);
		System.out.printf("|%15.13f|\n",sd);
		System.out.printf("%c\n",1000);
		System.out.printf("%x\n",sb);
		System.out.printf("%o\n",sb);
		System.out.printf("%x\n",255);
		System.out.printf("%X\n",255);
	}
 
}
