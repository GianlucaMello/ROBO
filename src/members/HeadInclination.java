package members;
import java.util.Scanner;

import model.Robo;

public class HeadInclination {
	
	private Scanner input;

	public HeadInclination() {
		
	}
	
	public HeadInclination(Robo robo) {
		final String headInclination[] = robo.getHeadInclinationPossibleStates();
		int option = -1;
		int currentPosition = -1;
		String currentState = robo.getHeadInclination();
		input = new Scanner(System.in);
		 
		for(int i=0; i< headInclination.length; i++) {
			if(currentState == headInclination[i]) {
				currentPosition = i;
			}
		}
		if(currentPosition == -1){
			System.out.println("Erro ao buscar posi��o atual da inclina��o da cabe�a!!");
			return;
		}
		
		System.out.println("A inclina��o atual da cabe�a est�: " + currentState + "\n");
		
		if(currentPosition == 0) {
			System.out.println("1 - Inclinar a cabe�a: " + headInclination[currentPosition+1]);
			System.out.println("0 - Voltar");
			option = input.nextInt();
			switch (option) {
			case 1:
				robo.setHeadInclination(headInclination[++currentPosition]);
				System.out.println("A cabe�a foi inclinada para: " + robo.getHeadInclination() + "\n");
				break;
			case 0:
				break;
			default:
			}
		} 
		
		else if(currentPosition == headInclination.length-1) {
			System.out.println("1 - Inclinar a cabe�a: " + headInclination[currentPosition-1]);
			System.out.println("0 - Voltar");
			option = input.nextInt();
			switch (option) {
			case 1:
				robo.setHeadInclination(headInclination[--currentPosition]);
				System.out.println("A cabe�a foi inclinada para: " + robo.getHeadInclination() + "\n");
				break;
			case 0:
				break;
			default:
			}
		} 
		
		else {
			System.out.println("1 - Inclinar a cabe�a: " + headInclination[currentPosition-1]);
			System.out.println("2 - Inclinar a cabe�a: " + headInclination[currentPosition+1]);
			System.out.println("0 - Voltar");
			option = input.nextInt();
			switch (option) {
			case 1:
				robo.setHeadInclination(headInclination[--currentPosition]);
				System.out.println("A cabe�a foi inclinada para: " + robo.getHeadInclination() + "\n");
				break;
			case 2:
				robo.setHeadInclination(headInclination[++currentPosition]);
				System.out.println("A cabe�a foi inclinada para: " + robo.getHeadInclination() + "\n");
				break;
			case 0:
				break;
			default:
			}
		}
	}
}
