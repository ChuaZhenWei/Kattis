import java.util.Scanner;

public class TransitWoes {
	public static Integer[] getInput(Scanner sc) {
		
		String userInput = sc.nextLine();
		String input[] = userInput.split(" ");
		Integer numInput[] = new Integer[input.length];
		
		for (int i = 0; i < input.length; i++) {
			numInput[i] = Integer.parseInt(input[i]);
		}
		
		return numInput;
	}
	
	public static int calTime(int s, Integer walk[], Integer ride[], Integer wait[]) {
		int totalTime = s;
		
		for (int i = 0; i < walk.length; i++) {			
			if (i != (walk.length - 1)) {
				totalTime += ((wait[i] / walk[i]) >= 1) ? wait[i] : (wait[i] % (walk[i] - wait[i]));
				totalTime += ride[i];
			} else {
				totalTime += walk[i];
			}
		}
		
		return totalTime;
	}
	
	public static void main (String[] args) {    
		Scanner sc = new Scanner(System.in);
		
        Integer stn[] = getInput(sc);
        Integer walk[] = getInput(sc);
        Integer ride[] = getInput(sc);
        Integer wait[] = getInput(sc);
        
        int totalTime = calTime(stn[0], walk, ride, wait);
        
        if (totalTime <= stn[1]) {
        	System.out.println("yes");
        } else {
        	System.out.println("no");
        }
        
        sc.close();
    }
}
