import java.util.Scanner;

public class MANumber{
	private int x, xOriginal;
	
	public MANumber(int num){
		this.xOriginal = num;
		this.x = num;
	}
	
	public int calcGCD(int y){
		
		if(this.x == 0){
			return y;	
		}
		
		else if(y == 0){
			return this.x;
		}
		else{
			int work = this.x % y;
			this.x = y; 
			return this.calcGCD(work);
		}
        
    }

    public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);
    	MANumber n84 = new MANumber(1423);
    	int q;
    	
    	System.out.println("Enter a number: ");
    	
    	q = reader.nextInt();
        int r = n84.calcGCD(q);
        
        System.out.println("gcd(" + n84.xOriginal + ", " + q + ") = " + r);
    }
}

