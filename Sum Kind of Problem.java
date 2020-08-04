import java.util.Scanner;
import java.lang.Math;

public class Sum {
	
	public static void findSum(double[] N) {
		int size = N.length;
		
		for (int i = 0; i < size; i++) {
			double num = N[i];
			double S2 = Math.pow(N[i], 2);
			double S3 = num * (num + 1);
			double S1 = S3 / 2;
			
			System.out.println((i+1) + " " + (int)S1 + " " + (int)S2 + " " + (int)S3);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		double[] N = new double[num];
		
		for (int i = 0; i < num; i++) {
			N[sc.nextInt() - 1] = sc.nextDouble();
			sc.nextLine();
		}
		
		findSum(N);
	}
}
