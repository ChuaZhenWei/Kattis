import java.util.Scanner;
import java.lang.Math;

public class Pot {
	public static void main (String[] args) {  
		String n, value;
		double total = 0;
		double num = 0;
		double power = 0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextLine();
		
		for (int i = 0; i < Integer.parseInt(n); i++) {
			value = sc.nextLine();
			
			num = Double.parseDouble(value.substring(0, value.length() - 1));
			power = Double.parseDouble(value.substring(value.length() - 1));
			
			total += Math.pow(num, power);
		}
		
		System.out.println((int)total);
		
        sc.close();
    }
}