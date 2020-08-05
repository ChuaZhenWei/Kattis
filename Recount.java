import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Recount {
	
	public static void countVotes(Map<String, Integer> votes, String candidates) {
		if (votes.containsKey(candidates) == false) {
			votes.put(candidates, 1);
		} else {
			votes.put(candidates, votes.get(candidates) + 1);
		}
	}
	
	public static void getWinner(Map<String, Integer> votes) {
		int highScore = -1;
		String winner = "";
		
		for (String winners : votes.keySet()) {
			if (votes.get(winners) > highScore) {
				highScore = votes.get(winners);
				winner = winners;
			} else {
				if (votes.get(winners) == highScore){
					winner = "Runoff!";
				}
				break;
			}
		}
		
		System.out.println(winner);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new HashMap<String, Integer>();
		String candidates = sc.nextLine();
		
		while (!candidates.equals("***")) {
			countVotes(votes, candidates);
			
			candidates = sc.nextLine();
		}
		
		Map<String, Integer> result = votes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		getWinner(result);
	}
}
