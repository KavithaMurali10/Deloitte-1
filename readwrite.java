package pro8;
import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;



public class readwrite {



	public static void main(String[] args) throws IOException {

		Scanner scanner= new Scanner(System.in);

		

		System.out.println("Enter the file to copy");

		String copy= scanner.nextLine();

		

		File file= new File(copy);

		if(file.exists()) {

			System.out.println("\""+copy+"\""+" exists");

			System.out.println("enter file to paste");

			String paste= scanner.nextLine();

			FileReader reader= new FileReader(file);

			FileWriter fw= new FileWriter(paste);

			

			int i=0;

			while((i=reader.read())!= -1) {

				fw.write((char)i);

				

			}

			reader.close();

			fw.close();

			

		

		}

		else {

			System.out.println("\""+copy+"\""+" doesnt exist");

		}

		

	}



}
