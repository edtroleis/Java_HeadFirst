import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		DotCom one = new DotCom();
		DotCom two = new DotCom();
		DotCom three = new DotCom();
		
		one.setName("Pets.com");
		two.setName("eToys.com");
		three.setName("Go2.com");
		
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Insira um palpite");
			checkUserGuess(userGuess);
		}
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "errado";
		for(DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("correto")) {
				break;
			}
			if(result.equals("eliminar")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
	}
	
	private void finishGame() {
		System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto est√° vazio.");
		if(numOfGuesses <= 18) {
			System.out.println("VocÍ sÛ usou " + numOfGuesses + "palpites");
			System.out.println("VocÍ saiu antes de eliminar suas opÁıes.");
		} else {
			System.out.println("Demorou demais. " + numOfGuesses + " palpites");
			System.out.println("N√£o haver√° pesca com essas op√ß√µes.");
		}
	}
		
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}