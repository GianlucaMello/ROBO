package controller;
import java.util.Scanner;

import members.ElbowMovimentation;
import members.HeadInclination;
import members.HeadRotation;
import members.WristleMovimentation;
import model.Robo;

public class Control {
	private int option = -1;
	private Scanner input = new Scanner(System.in);
	
	public Control() {
		
	}
	
	public void Start(Robo robo) {
		do {
			System.out.println("\nSelecione uma das opções: ");
			System.out.println("1 - Mostrar Status Atual de todos os Membros");
			System.out.println("2 - Cabeça(Inclinar)");
			System.out.println("3 - Cabeça(Rotacionar)");
			System.out.println("4 - Cotovelo Direito");
			System.out.println("5 - Cotovelo Esquerdo");
			System.out.println("6 - Pulso Direito");
			System.out.println("7 - Pulso Esquerdo");
			System.out.println("8 - Restaurar Estados Iniciais");
			System.out.println("0 - Sair");
			option = input.nextInt();
			
			switch (option) {
			case 1:
				robo.PrintAtualState(robo);
				break;
			case 2:
				HeadInclination headInclination = new HeadInclination(robo);
				break;
			case 3:
				HeadRotation headRotation = new HeadRotation(robo);
				break;
			case 4:
				ElbowMovimentation rightElbowMovimentation = new ElbowMovimentation(robo, "Right");
				break;
			case 5:
				ElbowMovimentation leftElbowMovimentation = new ElbowMovimentation(robo, "Left");
				break;
			case 6:
				WristleMovimentation rightWristleMovimentation = new WristleMovimentation(robo, "Right");
				break;
			case 7:
				WristleMovimentation leftWristleMovimentation = new WristleMovimentation(robo, "Left");
				break;
			case 8:
				robo.setInitialState(robo);
				break;
			case 0:
				break;

			default:
			}
			
			
		} while (option != 0);
	}

}
