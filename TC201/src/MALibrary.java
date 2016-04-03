import java.util.ArrayList;

public class MALibrary {
	String adress;
	ArrayList<MABook> bookList;	
	
	public MALibrary(String addressLib) {
		this.adress = addressLib;	
		this.bookList = new ArrayList<MABook>();
	}
	
	public void addBook(MABook theBook){
		this.bookList.add(theBook);
	}
	
	public static void printOpeningHours(){
		System.out.println("Libreries are open from 9am to 5pm");
	}
	
	public void printAddress(){
		System.out.println(this.adress);
	}
	
	public void borrowBook(String title){
		for(MABook theBook:this.bookList){
			if(title.equals(theBook.getTitle())){
				if(theBook.isBorrowed()){
					System.out.println("Sorry, already taken");
					return;
				}
				else{
					theBook.rented();
					System.out.println("You have borrowed the book");
					return;
				}
			}
		}
		System.out.println("The book isn't available in the catalog");
	}
	
	public void printAvailableBooks(){
		if(this.bookList.isEmpty()){
			System.out.println("The book isn't available in the catalog");
		}
		for(MABook theBook:this.bookList){
			System.out.println(theBook.getTitle());
		}
	}
	
	public void returnBook(String title){
		for(MABook theBook:this.bookList){
			if(title.equals(theBook.getTitle())){
				theBook.returned();
				System.out.println("The book has been returned");
			}
		}
	}
	
	public static void main(String[] args) {
        // Create two libraries
        MALibrary firstLibrary = new MALibrary("10 Main St.");
        MALibrary secondLibrary = new MALibrary("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new MABook("The Da Vinci Code"));
        firstLibrary.addBook(new MABook("Le Petit Prince"));
        firstLibrary.addBook(new MABook("A Tale of Two Cities"));
        firstLibrary.addBook(new MABook("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
