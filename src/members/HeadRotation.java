package members;
import java.util.Scanner;

import model.Robo;

public class HeadRotation {
	private Scanner input;

	public HeadRotation() {
	}
	
	public HeadRotation(Robo robo) {
		if(robo.headRotationIsPossible(robo)) {
			final String headRotation[] = robo.getHeadRotationPossibleStates();
			int option = -1;
			int currentPosition = -1;
			String currentState = robo.getHeadRotation();
			input = new Scanner(System.in);
			
			for(int i=0; i< headRotation.length; i++) {
				if(currentState == headRotation[i]) {
					currentPosition = i;
				}
			}
			
			if(currentPosition == -1){
				System.out.println("Erro ao buscar posi��o atual da rota��o da cabe�a!!");
				return;
			}
			
			System.out.println("A rota��o atual da cabe�a est�: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Rotacionar a cabe�a: " + headRotation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[++currentPosition]);
					System.out.println("A cabe�a foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == headRotation.length-1) {
				System.out.println("1 - Rotacionar a cabe�a: " + headRotation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[--currentPosition]);
					System.out.println("A cabe�a foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Rotacionar a cabe�a: " + headRotation[currentPosition-1]);
				System.out.println("2 - Rotacionar a cabe�a: " + headRotation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[--currentPosition]);
					System.out.println("A cabe�a foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 2:
					robo.setHeadRotation(headRotation[++currentPosition]);
					System.out.println("A cabe�a foi otacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
		} 
		
		
		else {
			System.out.println("A cabe�a esta na inclina��o: " + robo.getHeadInclination()+ "\n");
			System.out.println("N�o � poss�vel rotacionar a cabe�a do robo com a inclina��o da cabe�a no estado: \"" + robo.getHeadInclination() + "\"");
		}
	}
	

}
