import java.util.Scanner;

public class Planina {
	public static void main (String[] args) {  
		int pointPerSide = 2;
		int increment = 1;
		int n, points;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			pointPerSide += increment;
			increment *= 2;
		}
		
		points = pointPerSide * pointPerSide;
		
		System.out.println(points);
		
        sc.close();
    }
}