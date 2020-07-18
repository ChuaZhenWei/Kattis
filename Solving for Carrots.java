import java.util.Scanner;

public class Carrotz {
	public static void main (String[] args) {    
		Scanner sc = new Scanner(System.in);
		
		String inputs = sc.nextLine();
		String value[] = inputs.split(" ");
		
		for (int i = 0; i < Integer.parseInt(value[0]); i++) {
			String describe = sc.nextLine();
		}
        
		System.out.println(value[1]);
		
        sc.close();
    }
}