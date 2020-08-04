import java.util.Scanner;

public class Skocimis {
	
	public static int checkMaxMove(Integer[] kanPos) {
		int maxMove = Math.max(Math.abs(kanPos[0] - kanPos[1]), Math.abs(kanPos[1] - kanPos[2])) - 1;
		
		return maxMove;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxMove;
		
		Integer[] kanPosition = new Integer[3];

		for (int i = 0; i < 3; i++) {
			kanPosition[i] = sc.nextInt();
		}
		
		maxMove = checkMaxMove(kanPosition);
		
		System.out.println(maxMove);
	}
}
