package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\pqcir\\Documents\\RPG\\dados fodel.txt";
		
		// tentando inicializar o fr-br para ler o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// le uma linha
			String line = br.readLine();
			// enquanto a linha for diferente de nulo, printa e le a proxima
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}


