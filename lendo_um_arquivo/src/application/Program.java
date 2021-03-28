package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// inicializando um file com o path do meu arquivo
		File file = new File("C:\\Users\\pqcir\\Documents\\RPG\\dados fodel.txt");
		// inicializando um scanner com valores nulos
		Scanner sc = null;
		// realizando a leitura do meu arquivo
		try {
			sc = new Scanner(file);
			// enquanto tiver mais uma linha para ler leia ela
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		// fechando o nosso scanner se o sc for != null
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
