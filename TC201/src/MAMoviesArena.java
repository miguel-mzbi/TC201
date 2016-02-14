import java.io.FileNotFoundException;

public class MAMoviesArena {
	
	public static void main(String[] args) throws FileNotFoundException{
		MAMovies moviesData1 = new MAMovies("C:\\Users\\MiguelAngel\\git\\TC201\\TC201\\bin\\movies1.txt");
		moviesData1.readFile();
	}
}
