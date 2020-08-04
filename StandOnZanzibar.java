import java.util.Scanner;

public class Zanzibar {
	
	public static int checkImport(String val) {
		String[] value = val.split(" ");
		int preVal = Integer.parseInt(value[0]);
		int imported = 0;
		int num;
		
		for (int i = 1; i < value.length - 1; i++) {
			num = Integer.parseInt(value[i]);
			
			if (num > (preVal * 2)) {
				imported += num - (preVal * 2);
			}
			
			preVal = num;
		}
		
		return imported;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int imported;
		int num = Integer.parseInt(sc.nextLine());
		String values;
		
		for (int i = 0; i < num; i++) {
			values = sc.nextLine();
			imported  = checkImport(values);
			System.out.println(imported);
		}
	}
}
