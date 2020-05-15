package members;
import java.util.Scanner;

import model.Robo;

public class ElbowMovimentation {
	private Scanner input;
	public ElbowMovimentation(Robo robo, String direction) {
		final String elbowMovimentation[] = robo.getElbowMovimentationPossibleStates();
		int option = -1;
		int currentPosition = -1;
		String currentState = "";
		input = new Scanner(System.in);
		
		switch(direction) {
		case "Left":
			currentState = robo.getLeftElbow();
			for(int i=0; i< elbowMovimentation.length; i++) {
				if(currentState == elbowMovimentation[i]) {
					currentPosition = i;
				}
			}
			if(currentPosition == -1){
				System.out.println("Erro ao buscar posição atual do cotovelo esquerdo!!");
				return;
			}
			
			System.out.println("O cotovelo esquerdo está: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Movimentar o cotovelo esquerdo para: " + elbowMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftElbow(elbowMovimentation[++currentPosition]);
					System.out.println("O cotovelo esquerdo foi movido para: " + robo.getLeftElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == elbowMovimentation.length-1) {
				System.out.println("1 - Movimentar o cotovelo esquerdo para: " + elbowMovimentation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftElbow(elbowMovimentation[--currentPosition]);
					System.out.println("O cotovelo esquerdo foi movido para: " + robo.getLeftElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Movimentar o cotovelo esquerdo para: " + elbowMovimentation[currentPosition-1]);
				System.out.println("2 - Movimentar o cotovelo esquerdo para: " + elbowMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftElbow(elbowMovimentation[--currentPosition]);
					System.out.println("O cotovelo esquerdo foi movido para: " + robo.getLeftElbow() + "\n");
					break;
				case 2:
					robo.setLeftElbow(elbowMovimentation[++currentPosition]);
					System.out.println("O cotovelo esquerdo foi movido para: " + robo.getLeftElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			break;
		case "Right":
			currentState = robo.getRightElbow();
			for(int i=0; i< elbowMovimentation.length; i++) {
				if(currentState == elbowMovimentation[i]) {
					currentPosition = i;
				}
			}
			if(currentPosition == -1){
				System.out.println("Erro ao buscar posição atual do cotovelo direito!!");
				return;
			}
			
			System.out.println("O cotovelo direito está: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Movimentar o cotovelo direito para: " + elbowMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightElbow(elbowMovimentation[++currentPosition]);
					System.out.println("O cotovelo direito foi movido para: " + robo.getRightElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == elbowMovimentation.length-1) {
				System.out.println("1 - Movimentar o cotovelo direito para: " + elbowMovimentation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightElbow(elbowMovimentation[--currentPosition]);
					System.out.println("O cotovelo direito foi movido para: " + robo.getRightElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Movimentar o cotovelo direito para: " + elbowMovimentation[currentPosition-1]);
				System.out.println("2 - Movimentar o cotovelo direito para: " + elbowMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightElbow(elbowMovimentation[--currentPosition]);
					System.out.println("O cotovelo direito foi movido para: " + robo.getRightElbow() + "\n");
					break;
				case 2:
					robo.setRightElbow(elbowMovimentation[++currentPosition]);
					System.out.println("O cotovelo direito foi movido para: " + robo.getRightElbow() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			
			break;
		default:
				
		}
	}
}
