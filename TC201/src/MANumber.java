
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
    	MANumber n84 = new MANumber(285657);
        int q = 192;
        int r = n84.calcGCD(q);
        System.out.println("gcd(" + n84.xOriginal + ", " + q + ") = " + r);
    }
}

