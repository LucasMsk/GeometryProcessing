package tasks;

import java.util.ArrayList;

import geometry.*;

public class Task3 {
	
	public static ArrayList<String> calculate(ArrayList<Figure> file) {
		ArrayList<String> result = new ArrayList<String>();
		
		//A
		int count = 0;
		double lenght = 0;
		for(Figure geo : file) {
			if(geo instanceof Polyline) {
				count++;
				lenght += geo.lenght();
			}
		}
		double avg = lenght / count;
		result.add("a. " + avg);
		
		return result;
	}
}
