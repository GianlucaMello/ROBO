package members;
import java.util.Scanner;

import model.Robo;

public class WristleMovimentation {
	private Scanner input;
	public WristleMovimentation() {
		
	}


	public WristleMovimentation(Robo robo, String direction) {

		final String wristleMovimentation[] = robo.getWristleMovimentationPossibleStates();
		int option = -1;
		int currentPosition = -1;
		String currentState = "";
		input = new Scanner(System.in);
		
		switch(direction) {
		case "Left":
		if(robo.leftWristleMovimentationIsPossible(robo)){
			currentState = robo.getLeftWristle();
			for(int i=0; i< wristleMovimentation.length; i++) {
				if(currentState == wristleMovimentation[i]) {
					currentPosition = i;
				}
			}
			if(currentPosition == -1){
				System.out.println("Erro ao buscar posição atual do pulso esquerdo!!");
				return;
			}
			
			System.out.println("O pulso esquerdo está: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Movimentar o pulso esquerdo para: " + wristleMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftWristle(wristleMovimentation[++currentPosition]);
					System.out.println("O pulso esquerdo foi movido para: " + robo.getLeftWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == wristleMovimentation.length-1) {
				System.out.println("1 - Movimentar o pulso esquerdo para: " + wristleMovimentation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftWristle(wristleMovimentation[--currentPosition]);
					System.out.println("O pulso esquerdo foi movido para: " + robo.getLeftWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Movimentar o pulso esquerdo para: " + wristleMovimentation[currentPosition-1]);
				System.out.println("2 - Movimentar o pulso esquerdo para: " + wristleMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setLeftWristle(wristleMovimentation[--currentPosition]);
					System.out.println("O pulso esquerdo foi movido para: " + robo.getLeftWristle() + "\n");
					break;
				case 2:
					robo.setLeftWristle(wristleMovimentation[++currentPosition]);
					System.out.println("O pulso esquerdo foi movido para: " + robo.getLeftWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			
			} else {
				System.out.println("O cotovelo esquerdo está no estado: "+ robo.getLeftElbow() + "\n");
				System.out.println("Não é possível movimentar o pulso esquerdo com o cotovelo esquerdo em um estado diferente de \"Fortemente Contraído\"");
			}
		break;
		case "Right":
		if(robo.rightWristleMovimentationIsPossible(robo)){
			currentState = robo.getRightWristle();
			for(int i=0; i< wristleMovimentation.length; i++) {
				if(currentState == wristleMovimentation[i]) {
					currentPosition = i;
				}
			}
			if(currentPosition == -1){
				System.out.println("Erro ao buscar posição atual do pulso direito!!");
				return;
			}
			
			System.out.println("O pulso direito está: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Movimentar o pulso direito para: " + wristleMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightWristle(wristleMovimentation[++currentPosition]);
					System.out.println("O pulso direito foi movido para: " + robo.getRightWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == wristleMovimentation.length-1) {
				System.out.println("1 - Movimentar o pulso direito para: " + wristleMovimentation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightWristle(wristleMovimentation[--currentPosition]);
					System.out.println("O pulso direito foi movido para: " + robo.getRightWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Movimentar o pulso direito para: " + wristleMovimentation[currentPosition-1]);
				System.out.println("2 - Movimentar o pulso direito para: " + wristleMovimentation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setRightWristle(wristleMovimentation[--currentPosition]);
					System.out.println("O pulso direito foi movido para: " + robo.getRightWristle() + "\n");
					break;
				case 2:
					robo.setRightWristle(wristleMovimentation[++currentPosition]);
					System.out.println("O pulso direito foi movido para: " + robo.getRightWristle() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}	
		} else {
			System.out.println("O cotovelo direito está no estado: "+ robo.getRightElbow() + "\n");
			System.out.println("Não é possível movimentar o pulso direito com o cotovelo direito em um estado diferente de \"Fortemente Contraído\"");
		}
		break;
		default:
				
		}
	}
}

