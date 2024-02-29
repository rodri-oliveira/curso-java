package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] file = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File files : file) {
			System.out.println(files);
		}
		
		boolean succes = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + succes);
		
		sc.close();

	}

}
