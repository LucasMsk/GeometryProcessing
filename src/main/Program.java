package main;

import java.util.ArrayList;

import geometry.Figure;
import operations.FileOperations;
import tasks.*;

public class Program {

	public static void main(String[] args) {
		//Read and parse file
		ArrayList<Figure> file = FileOperations.ParseFile();
		
		//Task 1
		ArrayList<String> task1 = Task1.calculate(file);
		FileOperations.WriteFile("res/task1.txt", task1);
		
		//Task 2
		ArrayList<String> task2 = Task2.calculate(file);
		FileOperations.WriteFile("res/task2.txt", task2);
		
		//Task 3
		ArrayList<String> task3 = Task3.calculate(file);
		FileOperations.WriteFile("res/task3.txt", task3);
	}
	
}
