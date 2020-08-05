import java.util.Scanner;

public class PopularVotes {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(sc.nextLine());
			int total = 0;
			int highest = -1;
			int winner = -1;
			int count = 0;
			
			for (int j = 0; j < N; j++) {
				int candidate = Integer.parseInt(sc.nextLine());
				total += candidate;
				
				if (candidate > highest) {
					highest = candidate;
					winner = j + 1;
					count = 0;
				} else if (candidate == highest) {
					count++;
				}
			}
			
			if (count > 0) {
				System.out.println("no winner");
			} else {
				if (highest > (total / 2)) {
					System.out.println("majority winner " + winner);
				} else {
					System.out.println("minority winner " + winner);
				}
			}
		}
		
	}
}
