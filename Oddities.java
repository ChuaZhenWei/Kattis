import java.util.Scanner;

public class Oddities {
	public static void main (String[] args) {  
		int n, x;
		
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(sc.nextLine());
			
			if (x % 2 == 0) {
				System.out.println(x + " is even");
			} else {
				System.out.println(x + " is odd");
			}
		}
		
    }
}