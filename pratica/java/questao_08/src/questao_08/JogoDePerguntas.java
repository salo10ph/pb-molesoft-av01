package questao_08;

import java.util.Scanner;

public class JogoDePerguntas {
	
	public static void main(String[] args) {

		int quantidadeDeRespostasCorretas = 0;
		int quantidadeDeRespostasErradas = 0;
		Scanner scan = new Scanner(System.in);
		String[] enunciadoDaQuestao = 
		{   
			"01)Quanto eh 2 + 2? \na) 4 \nb) 2 \nc) 5 \nd) 3",
			"02)Quanto eh 5 x 3? \na) 15 \nb) 10 \nc) 5 \nd) 18",
			"03)Qual eh a raiz quadrada de 9? \na) 12 \nb) 2 \nc) 3 \nd) 9",
			"04)Qual o valor aproximado de pi? \na) 5 \nb) 3,14 \nc) 2 \nd) 1,15",
			"05)Quanto eh 5 - 3? \na) 2 \nb) 1 \nc) 5 \nd) 3",
			"06)Quanto eh 8 / 2? \na) 1 \nb) 2 \nc) 4 \nd) 8",
			"07)Qual eh o dobro de 7? \na) 7 \nb) 10 \nc) 14 \nd) 20",
			"08)Quanto eh 5 ao quadrado? \na) 5 \nb) 20 \nc) 15 \nd) 25",
			"09)Quanto eh 2 ao cubo? \na) 8 \nb) 4 \nc) 12 \nd) 10",
			"10)Quanto eh 1 x 1? \na) 2 \nb) 1 \nc) 0 \nd) 11"
		};
		char[] alternativaCorreta = 
		{   
			'a',
			'a',
			'c',
			'b',
			'a',
			'c',
			'c',
			'd',
			'a',
			'b'
		};

		System.out.print("Digite o seu nome: ");
		String nomeDoJogador = scan.nextLine();
		
		for(int i = 0; i < 10; i++){
			
			System.out.println(enunciadoDaQuestao[i]);
			System.out.print("\n Digite sua resposta: ");
			char resposta = scan.next().charAt(0);
			
			if(resposta == alternativaCorreta[i]) {
				System.out.println("Parabens voce acertou!");
				quantidadeDeRespostasCorretas++;
			} else {
				System.out.println("Voce errou");
				quantidadeDeRespostasErradas++;
			}
			System.out.println("-----------------------");
		}

		System.out.println("Jogador: " + nomeDoJogador);
		System.out.println("Acertos: " + quantidadeDeRespostasCorretas);
		System.out.println("Erros: " + quantidadeDeRespostasErradas);
		
	}

}
