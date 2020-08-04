import java.util.Scanner;

public class HelpPHD {
	
	public static void solveProb(String prob) {
		String[] qns = prob.split("[^0-9]");
		
		if (qns.length == 0) {
			System.out.println("skipped");
		} else {
			int sum = Integer.parseInt(qns[0]) + Integer.parseInt(qns[1]);
			System.out.println(sum);
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());

		String[] problem = new String[num];
		
		for (int i = 0; i < num; i++) {
			solveProb(sc.nextLine());
		}
	}
}
