/*Given gps coordinates of below cities, estimate the area enclosed by the cities
 * Atlanta = 33.7490° N, -84.3880° W
 * Orlando = 28.5383355,-81.37923649999999
 * Savannah = 32.0835407,-81.09983419999998
 * Charlotte = 35.2270869,-80.84312669999997
 */
public class EstimateAreas {

	public static void main(String[] args) {
		/*double [] Atlanta = {33.7490,-84.3880};
		double [] Orlando = {28.5383355,-81.37923649999999};
		double [] Savannah = {32.0835407,-81.09983419999998};
		double [] Charlotte = {35.2270869,-80.84312669999997};
		*/
	
		
		double [] Atlanta = {Math.toRadians(33.7490),Math.toRadians(-84.5545400)};
		double [] Orlando = {Math.toRadians(28.5383355),Math.toRadians(-81.37923649999999)};
		double [] Savannah = {Math.toRadians(32.0835407),Math.toRadians(-81.09983419999998)};
		double [] Charlotte = {Math.toRadians(35.2270869),Math.toRadians(-80.84312669999997)};
		double radius, side1, side2, side3, side4, side5, area = 0, s;
		
		radius = 6371.01;
		//distance from Atlanta to Orlando
		side1 = radius*Math.acos(Math.sin(Atlanta[0])*Math.sin(Orlando[0])+Math.cos(Atlanta[0])*Math.cos(Orlando[0])*Math.cos(Atlanta[1]-Orlando[1]));
		//distance from Orlando to Savannah
		side2 = radius*Math.acos(Math.sin(Orlando[0])*Math.sin(Savannah[0])+Math.cos(Orlando[0])*Math.cos(Savannah[0])*Math.cos(Orlando[1]-Savannah[1]));
		//distance from Savannah to Charlotte
		side3 = radius*Math.acos(Math.sin(Savannah[0])*Math.sin(Charlotte[0])+Math.cos(Savannah[0])*Math.cos(Charlotte[0])*Math.cos(Savannah[1]-Charlotte[1]));
		//distance from Charlotte to Atlanta
		side4 = radius*Math.acos(Math.sin(Charlotte[0])*Math.sin(Atlanta[0])+Math.cos(Charlotte[0])*Math.cos(Atlanta[0])*Math.cos(Charlotte[1]-Atlanta[1]));
		//distance from Atlanta to Savannah
		side5 = radius*Math.acos(Math.sin(Atlanta[0])*Math.sin(Savannah[0])+Math.cos(Atlanta[0])*Math.cos(Savannah[0])*Math.cos(Atlanta[1]-Savannah[1]));
		//area of the first triangle
		s = (side1 + side2 + side5) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side5)) + area;
		//2nd triangle
		s = (side3 + side4 + side5) / 2;
		area = Math.sqrt(s * (s - side3) * (s - side4) * (s - side5)) + area;
		System.out.println(area);
		System.out.println(side1);
		System.out.println(side2);
		System.out.println(side3);
		System.out.println(side4);
		System.out.println(side5);
//I don't know, I think it's right, but I don't know what the problem is
	}

}/*
// Point(1) Atlanta, Georgia; 51.5138505182,-0.15690922737098845
 // Point(2) Orlando, Florida; 28.5383355,-81.37923649999999
 // Point(3) Savannah, Georgia; 32.0835407,-81.09983419999998
 // Point(4) Charlotte, North Carolina;35.2270869,-80.84312669999997
 public static void main(String[] args) {
 
  double x1 = 51.5138505182;
  double y1 = -0.15690922737098845;
 
  double x2 = 28.5383355;
  double y2 = -81.37923649999999;
 
  double x3 = 32.0835407;
  double y3 = -81.09983419999998;
 
  double x4 = 35.2270869;
  double y4 = -80.84312669999997;
 
  // Calculating 1st triangle; p1, p2 and, p3
  double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
  double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
  double s = (side1 + side2 + side3) / 2;
  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 
  // Calculating 2nd triangle; p1, p3 and, p4
 
  side1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
  side2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
  side3 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
  s = (side1 + side2 + side3) / 2;
  area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) + area;
 
  System.out.print("The area enclosed by 4 cities is " + area + " km^2");*/
