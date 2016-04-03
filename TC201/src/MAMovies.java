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
				String movieName = tempList.get(i).substring(1);
				String actorName = tempList.get(0);
				
				if (this.moviesData.containsKey(movieName)){
					 this.moviesData.get(movieName).add(actorName);
				}
				else{
					 this.moviesData.put(movieName, new ArrayList<String>());
					 this.moviesData.get(movieName).add(actorName);
				}
			}
		}
		
		System.out.println(this.moviesData);
	}
	
	public void relations(String moviesIn){
		if (moviesIn.contains("|")){
			String movie1 = moviesIn.split("\\|")[0];
			String movie2 = moviesIn.split("\\|")[1];
			ArrayList<String> actorsInMovies = new ArrayList<String>();
			
			for (int i = 0; i < this.moviesData.get(movie1).size(); i++ ){
				actorsInMovies.add(this.moviesData.get(movie1).get(i));
			}
			for (int i = 0; i < this.moviesData.get(movie2).size(); i++ ){
				if (!actorsInMovies.contains(this.moviesData.get(movie2).get(i))){
					actorsInMovies.add(this.moviesData.get(movie2).get(i));
				}
			}
			for (String s : actorsInMovies) {
				System.out.print(s +", ");
			}
		}
		
		else if(moviesIn.contains("&")){
			String movie1 = moviesIn.split("\\&")[0];
			String movie2 = moviesIn.split("\\&")[1];
			
			ArrayList<String> actorsInMovies = new ArrayList<String>(this.moviesData.get(movie1));
			actorsInMovies.retainAll(this.moviesData.get(movie2));
						
			if (actorsInMovies.size() == 0){
				System.out.println("None");
			}
			else{
				for (String s : actorsInMovies) {
					System.out.print(s +", ");
				}
			}
		}
		
		else{
			String movie1 = moviesIn.split("\\^")[0];
			String movie2 = moviesIn.split("\\^")[1];
			ArrayList<String> actorsInMovies = new ArrayList<String>();
			
			for (int i = 0; i < this.moviesData.get(movie1).size(); i++ ){
				if(!this.moviesData.get(movie2).contains(this.moviesData.get(movie1).get(i))){
					actorsInMovies.add(this.moviesData.get(movie1).get(i));
				}
			}
			for (int i = 0; i < this.moviesData.get(movie2).size(); i++ ){
				if(!this.moviesData.get(movie1).contains(this.moviesData.get(movie2).get(i))){
					actorsInMovies.add(this.moviesData.get(movie2).get(i));
				}
			}
			
			if (actorsInMovies.size() == 0){
				System.out.println("None");
			}
			else{
				for (String s : actorsInMovies) {
					System.out.print(s +", ");
				}
			}
		}
	}
	
	public void coActors(String actorIn){
		ArrayList<String> coActorsList = new ArrayList<String>();
		for (Object o: this.moviesData.keySet()){
			if (this.moviesData.get(o).contains(actorIn)){
				for (String e: this.moviesData.get(o)){
					if (!coActorsList.contains(e) && !e.equals(actorIn)){
						coActorsList.add(e);
					}
				}
			}
		}
		for (String s : coActorsList) {
			System.out.print(s +", ");
		}
	}
	
	
}