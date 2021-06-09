package tasks;

import java.util.ArrayList;

import geometry.*;

public class Task2 {

	public static ArrayList<String> calculate(ArrayList<Figure> file) {
		ArrayList<String> result = new ArrayList<String>();
		
		//A
		double lenght = 0;
		for(Figure geo : file) {
			lenght += geo.lenght();
		}
		result.add("a. " + lenght);
		
		//B
		double area = 0;
		for(Figure geo : file) {
			area += geo.field();
		}
		result.add("b. " + area);
		
		//C 
		int c = 0, r = 0, l = 0;
		for(Figure geo : file) {
			if(geo instanceof Circle) {
				c++;
			} else if (geo instanceof Rectangle) {
				r++;
			} else {
				l++;
			}
		}
		result.add(String.format("c. Circle = %d, Rectangle = %d, Polyline = %d", c,r,l));
		
		
		return result;
	}
}
