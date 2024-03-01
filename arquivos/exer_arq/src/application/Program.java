package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import antities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String filePath = sc.nextLine();
		
		File sourceFile = new File(filePath);
		String sourceFolderStr = sourceFile.getParent();
	
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		System.out.println("Folder created: " + success);
		
		String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String names = fields[0].trim();
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2].trim());
				
				list.add(new Product(names, price, quantity));
				itemCsv = br.readLine();
				
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for(Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED: ");
				
			}catch(IOException e) {
				System.out.println("Error writting file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error  writting file: " + e.getMessage());
		}
		
		System.out.println(sourceFolderStr);
		
		sc.close();

	}

}
