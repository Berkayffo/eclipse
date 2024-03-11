import java.util.Iterator;

public class Matematik {

	public static void main(String[] args) {
		System.out.println("Math.sqrt(25) : " +Math.sqrt(25)); 
		System.out.println("Math.min(3, 5) : "+Math.min(3, 5));
		System.out.println("Math.max(3, 5) : "+Math.max(3, 5));
		System.out.println("Math.PI : "+Math.PI);
		System.out.println("Math.ceil(8.1) : "+Math.ceil(8.1) );
		System.out.println("Math.floor(8.1) : "+Math.floor(8.1));
		System.out.println("Math.round(3.4) : " +Math.round(3.4));
		System.out.println("Math.round(3.4) : "+Math.round(3.7) );
		
		System.out.println("Math.sqrt(25) : " +Math.sqrt(25)); 
		System.out.println("Math.min(3, 5) : "+benimMin(3, 5));
		System.out.println("Math.max(3, 5) : "+benimMax(3, 5));
		System.out.println("Math.PI : "+Math.PI);
		System.out.println("Math.ceil(8.1) : "+benimCeil(8.1) );
		System.out.println("Math.floor(8.1) : "+benimFloor(8.1));
		System.out.println("Math.round(3.4) : " +benimRound(3.4));
		System.out.println("Math.round(3.4) : "+benimRound(3.7) );
		
	}

	private static int benimRound(double d) {
		System.out.println((int)3.5);
		return 0;
	}

	private static double benimCeil(double d) {
		int sayi;
		if(d %1==0) {
			sayi = (int)d;
		}
		else sayi =(int)++d;
		return sayi;
	}

	private static double benimFloor(double d) {
		
		return (int)d;
	}

	private static int benimMax(int i, int j) {
		int max;
		if(i>j) max=i; else max=j;
		return max; 
	}

	private static int benimMin(int i, int j) {
int min;
if(i<j) min=i; else min=j;
return min; 
	}
		
	} 

	


