package controller;
import model.Robo;

public class Main {

	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.setInitialState(robo);
		Control control = new Control();
		control.Start(robo);
		
	}

}
