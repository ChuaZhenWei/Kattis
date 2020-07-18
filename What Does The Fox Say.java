import java.util.ArrayList;
import java.util.Scanner;

public class FoxSay {
	public static void main (String[] args) {  
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			String animalSound = "";
			String recording[] = sc.nextLine().split(" ");
			
			ArrayList<String> record = new ArrayList<String>();
			ArrayList<String> notFox = new ArrayList<String>();
			
			for (String word : recording) {
				record.add(word);
			}
			
			while(!animalSound.equals("what does the fox say?")) {
				animalSound = sc.nextLine();
				String info[] = animalSound.split(" ");
				notFox.add(info[2]);
			}
			
			record.removeAll(notFox);
			
			String finalSound = String.join(" ", record);
			
			System.out.println(finalSound.trim());
		}
		
		
		sc.close();
    }
}