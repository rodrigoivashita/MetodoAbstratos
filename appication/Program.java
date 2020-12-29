package appication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shape: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("-------------------------------");
			System.out.println("SHAPE #" + i + " DATA:");
			System.out.print("Rentangle or Cicle? (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(color, width, heigth));
			} else if (ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));
			} 

		}
		System.out.println("-------------------------------");
		System.out.println("SHAPE AREA:");
		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		sc.close();
	}
}
