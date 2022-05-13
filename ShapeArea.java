import java.util.Scanner;

public class ShapeArea {

    public static void area()
    {
        System.out.println("area of different shape");
    }
}

 class Circle extends ShapeArea
{
    public static void area()
    {
        System.out.println("area of circle = pi*radius*radius");
    }
}

class Square extends ShapeArea
{
    public static void area()
    {
        System.out.println("area of square = side*side");
    }


}

class testArea
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter shape to get area formula");
        String s= sc.nextLine();
        if(s.equals("Circle"))
        {
            Circle shape= new Circle();
            shape.area();
        }

        else
        {
            Square shape= new Square();
            shape.area();


        }
    }
}
