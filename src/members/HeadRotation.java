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
				System.out.println("Erro ao buscar posição atual da rotação da cabeça!!");
				return;
			}
			
			System.out.println("A rotação atual da cabeça está: " + currentState + "\n");
			
			if(currentPosition == 0) {
				System.out.println("1 - Rotacionar a cabeça: " + headRotation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[++currentPosition]);
					System.out.println("A cabeça foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
			
			else if(currentPosition == headRotation.length-1) {
				System.out.println("1 - Rotacionar a cabeça: " + headRotation[currentPosition-1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[--currentPosition]);
					System.out.println("A cabeça foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			} 
			
			else {
				System.out.println("1 - Rotacionar a cabeça: " + headRotation[currentPosition-1]);
				System.out.println("2 - Rotacionar a cabeça: " + headRotation[currentPosition+1]);
				System.out.println("0 - Voltar");
				option = input.nextInt();
				switch (option) {
				case 1:
					robo.setHeadRotation(headRotation[--currentPosition]);
					System.out.println("A cabeça foi rotacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 2:
					robo.setHeadRotation(headRotation[++currentPosition]);
					System.out.println("A cabeça foi otacionada para: " + robo.getHeadRotation() + "\n");
					break;
				case 0:
					break;
				default:
				}
			}
		} 
		
		
		else {
			System.out.println("A cabeça esta na inclinação: " + robo.getHeadInclination()+ "\n");
			System.out.println("Não é possível rotacionar a cabeça do robo com a inclinação da cabeça no estado: \"" + robo.getHeadInclination() + "\"");
		}
	}
	

}
