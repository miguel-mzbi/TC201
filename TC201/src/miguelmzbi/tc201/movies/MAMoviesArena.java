package miguelmzbi.tc201.movies;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MAMoviesArena {
	
	private static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {
		scan = new Scanner(System.in);
        //scan.useDelimiter("\\|\\^\\&");
		MAMovies moviesData1 = new MAMovies("/home/miguel/git/TC201/TC201/src/movies1.txt");
		
		moviesData1.readFile();
		System.out.println("(a) Give me 2 movies separated by ( &, | , ^) to obatain the set of actors relationships\n(b) Give me name of an actor and find his/her co-actors\nWrite 'a' or 'b'.");
		String choice = scan.nextLine();

		if (choice.equals("a")){
			System.out.println("Give me 2 movies separated by ( &, | , ^) to obatain the set of actors relationships. E.g: Apollo 13|Sleepless in Seattle");
			
			String movies = scan.nextLine();
			moviesData1.relations(movies);
		}
		else if (choice.equals("b")){
			System.out.println("Give me name of an actor and find his/her co-actors. E.g: Tom Hanks");
			String actor = scan.nextLine();
			moviesData1.coActors(actor);
		}
		
		
	}
}
