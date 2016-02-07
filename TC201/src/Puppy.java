
class Puppy {
	private int age;
	private int wt;
	private String name;

	
	public Puppy(int age, String name, int wt){
		this.age = age;
		this.name = name;
		this.wt = wt;		
	}

	public int getAge(){
		return age;
	}
	
	public void eat(int food){
		this.wt+=food;
		System.out.println(this.name + " had for lunch "+ food + " kg of food. "+ this.name + " now weights "+ this.wt);

	}
	
	public void run(int meters){
		System.out.println(this.name + " walked "+ meters + " meters ");
	}
	
	public static void main(String[] args){
		Puppy kassab = new Puppy(19, "Kassab", 180);
		System.out.println(kassab.getAge()+" years");
		kassab.run(10);
		kassab.eat(10);
	}
	

}
