package Lab4_1;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Angle a = new Angle();
        a.Read();
        System.out.println("");
        a.Display();
        System.out.println("");
        System.out.println("Results: ");
        System.out.println("Radians: " + a.Radian());
        System.out.println("Sinus: " + a.Sin());
        System.out.println("");
        a.Minus();
        a.Display();
        System.out.println("");
        a.Plus();
        a.Display();
        System.out.println("");
        System.out.println("Results: ");
        System.out.println("Radians: " + a.Radian());
        System.out.println("Sinus: " + a.Sin());
	}
}