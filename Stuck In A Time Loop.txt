import java.util.Scanner;

public class TimeLoop {
	public static void main (String[] args) {    
		Scanner sc = new Scanner(System.in);
		
        int numLoop = sc.nextInt();
        
        for (int i = 0; i < numLoop; i++) {
			System.out.println((i+1) + " Abracadabra");
		}
        
        sc.close();
    }
}