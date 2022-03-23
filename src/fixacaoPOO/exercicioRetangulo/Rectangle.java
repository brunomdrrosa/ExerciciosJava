package fixacaoPOO.exercicioRetangulo;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public double diagonal() {
		double pitagoras = (width * width) + (height * height);
		double diagonal = Math.sqrt(pitagoras);
		return diagonal;
	}
}
