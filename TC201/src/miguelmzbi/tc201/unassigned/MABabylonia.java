package miguelmzbi.tc201.unassigned;

public class MABabylonia {
	private double number, guess, division, privGuess;
	
	public MABabylonia(double n){
		this.number = n;
		this.guess = 0;
		this.privGuess = 0;
	}
	
	public double babyloniaRoot(){
		this.guess = this.number / 2;
		this.privGuess = this.guess + 1;
		
		while (this.guess != this.privGuess){
			division = this.number / this.guess;
			this.privGuess = this.guess;
			this.guess = (this.guess + division)/2;
			
		}
		return this.guess;
	}
	
	public static void main(String[] args) {
		MABabylonia n8 = new MABabylonia(8.5);
		double result = n8.babyloniaRoot();
		System.out.println(result);

	}
}
