package cyklus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cteni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      File myObj = new File("soubor.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
