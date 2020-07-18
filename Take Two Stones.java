import java.util.Scanner;

public class TakeTwoStones {
	public static void main (String[] args) {    
		Scanner sc = new Scanner(System.in);
		
        int stones = sc.nextInt();
        
        if (stones % 2 != 0) {
        	System.out.println("Alice");
        } else {
        	System.out.println("Bob");
        }
        
        sc.close();
    }
}