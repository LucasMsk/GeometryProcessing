package tasks;

import java.util.ArrayList;

import geometry.Figure;

public class Task1 {

	public static ArrayList<String> calculate(ArrayList<Figure> file) {
		ArrayList<String> invalidFormatIdList = new ArrayList<String>();
		
		for(int i = 0; i<file.size()-1; i++) {
			int next = i+1;
			if(i==file.size()-1) {
				next = 100000;
			}
			int num = file.get(i).getNum();
			int nextNum = file.get(next).getNum();
			if(nextNum != num+1) {
				for(int j = num; j<nextNum; j++) {
					invalidFormatIdList.add(Integer.toString(j));
				}
			}
		}
		return invalidFormatIdList;
	}

}
