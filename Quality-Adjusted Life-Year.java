import java.util.Scanner;

public class QALY {
	public static void main (String[] args) {  
		double totalQALY = 0.0;
		String input;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			if (sc.hasNextLine()) {
				input = sc.nextLine();
				String value[] = input.split(" ");
				totalQALY += Double.parseDouble(value[0]) * Double.parseDouble(value[1]); 
			}
		}
		
		System.out.println(totalQALY);
        
        sc.close();
    }
}
