package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\pqcir\\Documents\\RPG\\dados fodel.txt";
		// inicializar o fr e br para leitura do arquivo
		FileReader fr = null;
		BufferedReader br = null;
		
		// tentando inicializar eles
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

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
		finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
