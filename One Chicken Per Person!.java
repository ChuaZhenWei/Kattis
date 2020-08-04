import java.util.Scanner;
import java.lang.Math;

public class Chicken {
	
	public static void enoughChicken(int people, int chicken) {
		int diff = chicken - people;
		
		String more = (Math.abs(diff) > 1) ? "pieces" : "piece";
		
		if (diff >= 0) {
			System.out.println("Dr. Chaz will have " + diff + " " + more + " of chicken left over!");
		} else {
			System.out.println("Dr. Chaz needs " + Math.abs(diff) + " more " + more + " of chicken!");
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		int chicken = sc.nextInt();
		
		enoughChicken(people, chicken);
	}
}
