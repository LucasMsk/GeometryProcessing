package operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import geometry.*;

public class FileOperations {
	
	public static ArrayList<Figure> ParseFile() {
		ArrayList<Figure> file = new ArrayList<Figure>();
		
		try (BufferedReader reader = 
			       new BufferedReader(new FileReader("res/data.csv"))
		) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] geo = line.split(",");
				if(geo.length == 3) {
					int num = 0;
					try {
						num = Integer.parseInt(geo[0].trim());
					} catch(NumberFormatException e) {
						continue;
					}
					switch(geo[1]) {
						case "C": {
							String[] rep = geo[2].split(";");
							if(rep.length == 2) {
								String[] center = rep[0].split("-");
								Point cPoint = Point.verifyPoint(center);
								if(cPoint != null) {
									try {
										int r = Integer.parseInt(rep[1]);
										Circle circle = Circle.verifyCricle(num, cPoint, r);
										if(circle != null) {
											file.add(circle);
										}
									} catch (Exception e) {}
								}
							}
							break;
						}
						case "R": {
							String[] points = geo[2].split(";");
							if(points.length == 2) {
								String[] fs = points[0].split("-");
								Point fsPoint = Point.verifyPoint(fs);
								if(fsPoint != null) {
									String[] sc = points[1].split("-");
									Point scPoint = Point.verifyPoint(sc);
									if(scPoint != null) {
										file.add(new Rectangle(num, fsPoint,scPoint));
									} 
								} 
							}
							break;
						}
						case "L": {
							ArrayList<Point> pointList = new ArrayList<Point>();
							String[] points = geo[2].split(";");
							if(points.length >= 2) {
								for(String point : points) {
									String[] fs = point.split("-");
									Point fsPoint = Point.verifyPoint(fs);
									if(fsPoint != null) {
										pointList.add(fsPoint);
									} else {
										break;
									}
								}
							} 
							file.add(new Polyline(num, pointList));
							break;
						}
					}
				}
			  }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		return file;
	}
	
	public static void WriteFile(String path, ArrayList<String> content) {
		try {
			Files.write(Paths.get(path), content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
