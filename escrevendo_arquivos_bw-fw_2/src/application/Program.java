package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Esta é uma linha nova que foi add"};

		String path = "C:\\Users\\pqcir\\Documents\\RPG\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
