package Lab4_1;

import java.util.Scanner;
import java.lang.Math;

public class Angle {
	Scanner scan = new Scanner(System.in);

    private int grades;
    private int minutes;
    public int GetGrades()
    {
        return grades;
    }
    public int GetMinutes()
    {
        return minutes;
    }

    public boolean SetGrades(int grad)
    {
        if (grad < 0)
        {
            //grad = -grad;
        	System.out.println("Bad Input! Try Again!");
            return false;
        }
        grades = grad % 360;
        return true;
    }
    public boolean SetMinutes(int min)
    {
        if (min < 0)
        {
            //min = -min;
        	System.out.println("Bad Input! Try Again!");
            return false;
        }
        int rest = min / 60;
        grades += rest;
        minutes = min % 60;
        return true;
    }
    public boolean Init(int grad, int min)
    {
        return SetGrades(grad) && SetMinutes(min);
    }
    public void Read()
    {
        int grad;
        int min;
        do
        {
        	System.out.println("Grades: ");
            grad = scan.nextInt();
            System.out.println("Minutes: ");
            min = scan.nextInt();
        } while (!Init(grad, min));
    }
    public void Display()
    {
    	System.out.println("Grades: " + grades);
    	System.out.println("Minutes: " + minutes);
    }

    public void Minus()
    {
    	System.out.println("Minus Operations: ");
    	System.out.println("Minus to Grades: ");
        int minus_grad = scan.nextInt();
        System.out.println("Minus to Minutes: ");
        int minus_min = scan.nextInt();
        grades -= minus_grad;
        minutes -= minus_min;
        while(minutes < 0)
        {
            grades -= 1;
            minutes += 60;
        }
        SetGrades(grades);
        SetMinutes(minutes);
    }
    public void Plus()
    {
    	System.out.println("Plus Operations: ");
    	System.out.println("Plus to Grades: ");
        int plus_grad = scan.nextInt();
        System.out.println("Plus to Minutes: ");
        int plus_min = scan.nextInt();
        grades += plus_grad;
        minutes += plus_min;
        while (minutes > 60)
        {
            grades += 1;
            minutes -= 60;
        }
        SetMinutes(minutes);
        SetGrades(grades);
    }

    public double Radian()
    {
        double radian = 0;
        double gradians = grades + (minutes / 60);
        double scale = Math.pow(10, 3);
        radian = Math.ceil((gradians * (Math.PI / 180)) * scale) / scale;
        return radian;
    }
    public double Sin()
    {
        double radian = 0;
        double sin = 0;
        double gradians = grades + (minutes / 60);
        double scale = Math.pow(10, 3);
        radian = Math.ceil((gradians * (Math.PI / 180)) * scale) / scale;
        sin = Math.ceil((Math.sin(radian)) * scale) / scale;
        return sin;
    }
}