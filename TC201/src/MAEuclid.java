import java.util.Scanner;

public class MAEuclid{
	private int num;
	private int numOriginal;
	private static Scanner scan;
	
	public MAEuclid(int n){
		this.numOriginal = n;
		this.num = n;
	}
	
	public int calcGCD(int nToCompare){
		
		if(this.num == 0){
			return nToCompare;	
		}
		
		else if(nToCompare == 0){
			return this.num;
		}
		else{
			int temporal = this.num % nToCompare;
			this.num = nToCompare; 
			return this.calcGCD(temporal);
		}
        
    }

    public static void main(String[] args) {
    	scan = new Scanner(System.in);
    	MAEuclid n84 = new MAEuclid(84);
    	
    	System.out.println("Enter a number: ");
    	
    	int comparison = scan.nextInt();
        int result = n84.calcGCD(comparison);
        
        System.out.println("gcd(" + n84.numOriginal + ", " + comparison + ") = " + result);
    }
}

