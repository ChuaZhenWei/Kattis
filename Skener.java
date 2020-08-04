import java.util.Scanner;

public class Skener {
	
	public static void expandArticle(String[][] article, int Zr, int Zc) {
		for (int i = 0; i < article.length; i++) {
			for (int r = 0; r < Zr; r++) {
				for (int j = 0; j < article[i].length; j++) {
					for (int c = 0; c < Zc; c++) {
						System.out.print(article[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] RC = new Integer[4];

		for (int i = 0; i < 4; i++) {
			RC[i] = sc.nextInt();
		}
		sc.nextLine();
		
		String[][] article = new String[RC[0]][RC[1]];
		
		for (int j = 0; j < RC[0]; j++) {
			article[j] = sc.nextLine().split("");
		}
		
		expandArticle(article, RC[2], RC[3]);
	}
}
