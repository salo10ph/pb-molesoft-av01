package questao_09;

import java.util.Scanner;
import java.time.LocalTime;

public class BoasVindas {
	
	public static void main(String[] args) {
		
		String[] usuarioExistente = {"salomao silva", "pedro souza", "caracol2000"};
		String[] senhaExistente   = {"batatinha123", "calopsita567", "senha987"};
		boolean logarUsuario = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o usuario: ");
		String usuarioDigitado = scan.nextLine();
		
		System.out.print("Digite a senha: ");
		String senhaDigitada = scan.nextLine();
		
		LocalTime horarioAtual = LocalTime.now();

		for(int i = 0; i < 3; i++) {
			if(usuarioDigitado.equals(usuarioExistente[i]) && senhaDigitada.equals(senhaExistente[i])) {
				logarUsuario = true;
				break;	
			}
		}
		
		if(logarUsuario) {
			if( ( horarioAtual.equals(LocalTime.of(0, 0)) ) || ( horarioAtual.isAfter(LocalTime.of(0, 0)) && horarioAtual.isBefore(LocalTime.of(6,0) ) ) ){
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			} else if(horarioAtual.isAfter(LocalTime.of(5, 59, 59, 999999999)) && horarioAtual.isBefore(LocalTime.of(12, 0))) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			} else if(horarioAtual.isAfter(LocalTime.of(11, 59, 59, 999999999)) && horarioAtual.isBefore(LocalTime.of(18, 0))) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			} else {
				System.out.println("Boa noite, você se logou ao nosso sistema.");
			}	
		} else {
			System.out.println("Usuário e/ou senha incorretos.");
		}
	}
}