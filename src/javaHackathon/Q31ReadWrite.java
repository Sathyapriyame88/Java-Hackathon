package javaHackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Q31ReadWrite {

	public static void main(String[] args) throws Exception {
		String sPath = System.getProperty("user.dir") + "/read.txt";
		System.out.println(sPath);
		String sLine;

		FileReader oFR = new FileReader(sPath);
		BufferedReader oBF = new BufferedReader(oFR);
		while ((sLine = oBF.readLine()) != null) {
			System.out.println(sLine);
		}

		String sPath1 = System.getProperty("user.dir") + "/write.txt";
		System.out.println(sPath1);
		FileWriter oFW = new FileWriter(sPath1);
		BufferedWriter oBW = new BufferedWriter(oFW);
		oBW.write("hackathon");
		oBW.newLine();
		oBW.write("javacode");
		oBW.newLine();
		oBW.write("this is a read file");
		oBW.newLine();
		oBW.write("platform independent");
		oBW.newLine();
		oBW.write("language");
		oBW.newLine();
		oBW.write("object oriented");
		oBW.newLine();
		oBW.write("java");
		oBW.newLine();
		oBW.write("how are you");
		oBW.newLine();
		oBW.write("hello");
		oBW.newLine();
		oBW.write("hi");
		oBW.newLine();
		oBW.close();

	}

}
