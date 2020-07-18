import java.util.Scanner;

public class Pet {
	public static void main (String[] args) {  
		int contestant = 0;
		int highestScore = -1;
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			total = 0;
			for (int j = 0; j < 4; j++) {
				int grade = sc.nextInt();
				total += grade;
			}
			sc.nextLine();
			
			if (total > highestScore) {
				highestScore = total;
				contestant = i + 1;
			}
		}
		
		System.out.println(contestant + " " + highestScore);
		
		sc.close();
    }
}