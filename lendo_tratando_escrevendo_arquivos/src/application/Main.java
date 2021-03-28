package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import service.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();
		
		String path = "C:\\Users\\pqcir\\Documents\\Programação\\Java\\Curso_Java\\Java_Nelio-Alves\\Java_Orientação_Objetos\\source.txt";
		String path2 = "C:\\Users\\pqcir\\Documents\\Programação\\Java\\Curso_Java\\Java_Nelio-Alves\\Java_Orientação_Objetos\\sumarry.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String [] vect = line.split(",");
				String nome_produto = vect[0];
				String valor_produto = vect[1];
				String quantidade_produto = vect[0];
				
				Product prod = new Product (nome_produto, valor_produto, quantidade_produto);
				list.add(prod);
				line = br.readLine();
			}		
		
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
				
				for (Product p : list) {
					bw.write(String.valueOf(p));
					bw.newLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
				
		}
		catch (IOException e) {
			e.printStackTrace();
	}
  }
}
