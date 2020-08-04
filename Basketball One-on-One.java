import java.util.Scanner;

public class Basketball {
	
	public static void checkScore(String scoreBoard) {
		int Alice = 0;
		int Barbara = 0;
		int player = 0;
		int score = 1;
		int rule = 0;
		char winner = 'A';
		
		for (int i = 0; i < scoreBoard.length() / 2; i++) {
			if (scoreBoard.charAt(player) == 'A') {
				Alice += Character.getNumericValue(scoreBoard.charAt(score));
			} else if (scoreBoard.charAt(player) == 'B') {
				Barbara += Character.getNumericValue(scoreBoard.charAt(score));
			}
			
			if (Alice == 10 && Barbara == 10) {
				rule = 1;
			}
			
			if (rule == 0) {
				if (Alice == 11) {
					winner = 'A';
				} else if (Barbara == 11) {
					winner = 'B';
				}
			} else {
				if ((Alice - Barbara) >= 2)
					winner = 'A';
				else if ((Barbara - Alice) >= 2) {
					winner = 'B';
				}
			}
			
			player += 2;
			score += 2;
		}
		
		System.out.println(winner);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String scoreBoard = sc.nextLine();

		checkScore(scoreBoard);
	}
}
