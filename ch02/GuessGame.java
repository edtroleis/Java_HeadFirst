public class GuessGame {
	//GuessGame tem 3 varíaveis de instância para os 3 objetos Player
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		//Cria 3 objetos Player e atribui a eles as 3 variáveis de instância Player
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//Declara 3 variáveis para armazenar os 3 palpites que os jogadores fornecerão
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//Declara 3 variáveis para armazenar um valor verdadeiro ou falso baseado na resposta do jogador
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//Cria um número "alvo" que os jogadores terão que adivinhar
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Estou pensando em um número entre 0 e 9...");
		
		while(true) {
			System.out.println("O número a adivinhar é " + targetNumber);
			
			//Chama o método guess() de cada jogador
			p1.guess();
			p2.guess();
			p3.guess();
			
			//Obtém o palpite de cada jogador (o resultado da execução de sue método guess()) acessando a variável numérica de cada um
			guessp1 = p1.number;
			System.out.println("O jogador um forneceu o palpite " + guessp1);
			guessp2 = p2.number;
			System.out.println("O jogador dois forneceu o palpite " + guessp2);
			guessp3 = p3.number;
			System.out.println("O jogador três forneceu o palpite " + guessp3);
			
			//Verifica o palipite de cada jogador para ver se é igual ao número-alvo
			//Se um jogador acertar, sua variável será configurado com true (lembre-se de que configuramos com false como padrão)
			if(guessp1 == targetNumber) {
				p1isRight = true;
			}
			if(guessp2 == targetNumber) {
				p2isRight = true;
			}
			if(guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			//Se algum jogador acertar
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("Temos um vencedor");
				System.out.println("O jogador um acertor? " + p1isRight);
				System.out.println("O jogador dois acertor? " + p2isRight);
				System.out.println("O jogador três acertor? " + p3isRight);
				System.out.println("Fim do jogo");
				break;	//Fim do jogo, portanto sai do loop
			} else {
				//Devemos continuar porque ninguém acertou!
				System.out.println("Os jogadores terão que tentar novamente");
			}
		}
	}
}