package com.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileInputOutput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Current directory: "+ new File("").getAbsolutePath());
		String fileName = "src/Level+9+&+8_Flexi_OPS+TFO+and+ATCI_V2.csv";
		Path path = Paths.get(fileName);
		try 
		{
			List<String> lines = Files.readAllLines(path);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		File file = new File(fileName);
		if(!file.exists())
		{
			System.out.println("The file doesn't exist");
			return;
		}
		else
		{
			System.out.println("File found successfully!");
		}
	}

}
