package model;


public class Robo {
	private String headInclination, headRotation, leftElbow, leftWristle, rightElbow, rightWristle;
	private final String elbowState[] = {"Em Repouso", "Levemente Contraído", "Contraído", "Fortemente Contraído"};
	private final String headInclinationState[] = {"Para Cima", "Em Repouso", "Para Baixo"};
	private final String headRotationState[] = {"-90°", "-45°", "Em Repouso", "45°", "90°"};
	private final String wristleState[] = {"-90°", "-45°", "Em Repouso", "45°", "90°", "135°", "180°"};
	
	public Robo() {
	}

	
	//Don't know how to name this section
	public String[] getHeadInclinationPossibleStates() {
		return headInclinationState;
	}
	
	public String[] getHeadRotationPossibleStates() {
		return headRotationState;
	}
	
	public String[] getElbowMovimentationPossibleStates() {
		return elbowState;
	}
	
	public String[] getWristleMovimentationPossibleStates() {
		return wristleState;
	}
	
	public void PrintAtualState(Robo robo) {
		System.out.println("A inclinação da cabeça está: " + robo.getHeadInclination());
		System.out.println("A rotação da cabeça está em: "    + robo.getHeadRotation());
		System.out.println("O cotovelo direito está: "     + robo.getRightElbow());
		System.out.println("O pulso direito está em: "        + robo.getRightWristle());
		System.out.println("O cotovelo esquerdo está: "    + robo.getLeftElbow());
		System.out.println("O pulso esquerdo está em: "       + robo.getLeftWristle());
	}
	
	//R.O.B.O Rules
	public void setInitialState(Robo robo) {
		robo.headInclination = "Em Repouso";
		robo.headRotation = "Em Repouso";
		robo.leftElbow = "Em Repouso";
		robo.leftWristle = "Em Repouso";
		robo.rightElbow = "Em Repouso";
		robo.rightWristle = "Em Repouso";
	}
	
	public boolean headRotationIsPossible(Robo robo) {
		if(robo.headInclination != "Para Baixo") {
			return true;
		}
		return false;
	}
	
	public boolean leftWristleMovimentationIsPossible(Robo robo) {
		if(robo.leftElbow == "Fortemente Contraído") {
			return true;
		}
		return false;
	}
	public boolean rightWristleMovimentationIsPossible(Robo robo) {
		if(robo.rightElbow == "Fortemente Contraído") {
			return true;
		}
		return false;
	}
	
	
	//Getters e Setters
	public String getHeadInclination() {
		return headInclination;
	}

	public void setHeadInclination(String headInclination) {
		this.headInclination = headInclination;
	}

	public String getHeadRotation() {
		return headRotation;
	}

	public void setHeadRotation(String headRotation) {
		this.headRotation = headRotation;
	}

	public String getLeftElbow() {
		return leftElbow;
	}

	public void setLeftElbow(String leftElbow) {
		this.leftElbow = leftElbow;
	}

	public String getLeftWristle() {
		return leftWristle;
	}

	public void setLeftWristle(String leftWristle) {
		this.leftWristle = leftWristle;
	}

	public String getRightElbow() {
		return rightElbow;
	}

	public void setRightElbow(String rightElbow) {
		this.rightElbow = rightElbow;
	}

	public String getRightWristle() {
		return rightWristle;
	}

	public void setRightWristle(String rightWristle) {
		this.rightWristle = rightWristle;
	}


	@Override
	public String toString() {
		return "Robo [headInclination=" + headInclination + ", headRotation=" + headRotation + ", leftElbow="
				+ leftElbow + ", leftWristle=" + leftWristle + ", rightElbow=" + rightElbow + ", rightWristle="
				+ rightWristle + "]";
	}
	
	
}
