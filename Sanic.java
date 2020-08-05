import java.util.Scanner;

public class Sanic {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = Double.parseDouble(sc.nextLine());
		
		System.out.printf("%.2f", r - 1);
	}
}
