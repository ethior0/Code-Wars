
public class Kata {

	public static String rps(String p1, String p2) {
		
		if (p1.equals(p2)) {
			return "Draw!";
		} else {
			if (p1 == "scissors" && p2 == "paper") return "Player 1 won!";
			else if (p1 == "paper" && p2 == "scissors") return "Player 2 won!";

			if (p1 == "paper" && p2 == "rock") return "Player 1 won!";
			else if (p1 == "rock" && p2 == "paper") return "Player 2 won!";
			
			if (p1 == "rock" && p2 == "scissors") return "Player 1 won!";
			else if (p1 == "scissors" && p2 == "rock") return "Player 2 won!";
		}
		return "";
	}
	
	public static void main(String[] args) {
		
		System.out.println(rps("paper", "paper"));
		
	}
}
