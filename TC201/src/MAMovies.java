import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MAMovies {
	private HashMap<String, ArrayList<String>> moviesData;
	private Scanner scan;
	private File textFile;
	
	public MAMovies(String txt) {
		this.textFile = new File(txt);
		this.moviesData = new HashMap<String, ArrayList<String>>();
	}
	

	public void readFile() throws FileNotFoundException{
		scan = new Scanner(this.textFile);
		
		while (scan.hasNextLine()){
			String line = scan.nextLine();
			ArrayList<String> tempList = new ArrayList<String>(Arrays.asList(line.split(",")));
			
			for (int i=1; i<tempList.size(); i++ ){
				
				if (this.moviesData.containsKey(tempList.get(i))){
					 this.moviesData.get(tempList.get(i)).add(tempList.get(0));
				}
				else{
					 this.moviesData.put(tempList.get(i), new ArrayList<String>());
					 this.moviesData.get(tempList.get(i)).add(tempList.get(0));
				}
			}
		}
		System.out.println(this.moviesData);

	}
}
