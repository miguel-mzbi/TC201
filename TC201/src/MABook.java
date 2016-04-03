
public class MABook {
	String title;
    boolean borrowed;

    // Creates a new Book
    public MABook(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;        
    }
    
    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }
    
    // Marks the book as rented
    public void rented() {
        this.borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
    	if (this.borrowed){
    		return true;
    	}else{
    		return false;
    	}
    
    }
       

    public static void main(String[] arguments) {
        // Small test of the Book class
        MABook example = new MABook("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        
        example.rented();
        
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        
        example.returned();
        
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
