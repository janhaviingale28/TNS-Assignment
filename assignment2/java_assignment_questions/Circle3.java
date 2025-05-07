import java.util.Scanner;


//  Assignment Question 3 :  Class Circle with methods to input radius and calculate area.


class Circle {
    double radius;
    String color;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle: ");
        radius = sc.nextDouble();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Colour of Circle: ");
        color = sc.nextLine();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Color: " + color);
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}

