
public class MALych {
	private int firstN, lastN, ayeLych, avastLych, naturalPalindrome; 
	
	public MALych(int f, int l){
		this.firstN = f;
		this.lastN = l;
		this.ayeLych = 0;
		this.avastLych = 0;
		this.naturalPalindrome = 0;
		
	}
	
	public void orderingLych(){
		for(int step = this.firstN; step <= this.lastN; step += 1){
			this.getLych(step);
		}
		System.out.println("The range started in " + this.firstN + " inclusive, to " + this.lastN 
				+ " inclusive. The quantity of natural palindromes is " + this.naturalPalindrome 
				+ ". The quantity of Lychrel numbers was " + this.ayeLych 
				+ ". The quantity of numbers that holded for 30 iterations the Lychrel method was " + this.avastLych + ".");
	}
	
	
	public void getLych(int number){
		int workingNumber = number;
		int iterations = 0;
		while (iterations <= 30){
			int reversedNumber = reverseN(workingNumber);
			if (workingNumber == reversedNumber){
				System.out.println("The number " + number + " did became a palindrome after: " + iterations + " iterations.");
				if (iterations == 0){
					this.naturalPalindrome += 1;
				}
				this.avastLych += 1;
				break;
			}
			else if (iterations == 30){
				System.out.println("The number " + number 
						+ " is coulnd't hold the Lychrel method after 30 iterations, thus is a Lychrel number");
				this.ayeLych += 1;
				break;
			}
			else {
				workingNumber = workingNumber + reversedNumber;
				iterations +=1;
			}
		}
	}
	
	public int reverseN(int number){
		int reversingN = number;
		int reversedN = 0;
		while (reversingN != 0){
			reversedN = reversedN * 10 + reversingN % 10;
			reversingN = reversingN / 10;
		}
		return reversedN;
	}
	
}
