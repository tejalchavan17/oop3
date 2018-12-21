import java.io.*;
import java.lang.Math;
abstract class Shape
{
    int dim1,dim2;
    Shape(int dim1,int dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
     Shape(int dim1)
    {
        this.dim1=dim1;
    }
    abstract void area();
}
class Triangle extends Shape
{
    Triangle(int dim1,int dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        System.out.println("Area of Triangle= "+0.5*dim1*dim2);
    }
            
}
class Rectangle extends Shape
{
    Rectangle(int dim1,int dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        System.out.println("Area of Rectangle= "+dim1*dim2);
    }
            
}
class Square extends Shape
{
    Square(int dim1)
    {
          super(dim1);      
    }
    void area()
    {
        System.out.println("Area of Square= "+dim1*dim1);
    }
            
}
class Circle extends Shape
{
    Circle(int dim1)
    {
        super(dim1);
    }
    void area()
    {
        System.out.println("Area of Circle= "+3.14*dim1*dim1);
    }
            
}
class Cylinder extends Shape
{
    Cylinder(int dim1,int dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        System.out.println("Area of Cylinder= "+(2*3.14*dim1*dim1)+(2*3.14*dim1*dim2));
    }
            
}
class Cone extends Shape
{
    Cone(int dim1,int dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        System.out.println("Area of Cone= "+3.14*dim1*(Math.sqrt(dim2*dim2+dim1*dim1)+dim1));
    }
            
}
class Main1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        String ans=new String();
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Square");
        System.out.println("4.Circle");
        System.out.println("5.Cylinder");
        System.out.println("6.Cone");
        do
        {
        System.out.println("Enter dimension1");
        int dm1=Integer.parseInt(br.readLine());
        System.out.println("Enter dimension2");
        int dm2=Integer.parseInt(br.readLine());
        System.out.println("Enter your Choice");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1: Triangle t=new Triangle(dm1,dm2);
                    t.area();
                    break;
            case 2: Rectangle r=new Rectangle(dm1,dm2);
                    r.area();
                    break;
            case 3: Square s=new Square(dm1);
                    s.area();
                    break;
            case 4: Circle ci=new Circle(dm1);
                    ci.area();
                    break;
            case 5: Cylinder cy=new Cylinder(dm1,dm2);
                    cy.area();
                    break;
            case 6: Cone co=new Cone(dm1,dm2);
                    co.area(); 
                    break;
            default: System.out.println("wrong choice");
        }
        System.out.println("Do you want to continue?(y/n)");
        ans=br.readLine();
        }while(ans.equals("y"));
    }
}

/*output:
1.Triangle
2.Rectangle
3.Square
4.Circle
5.Cylinder
6.Cone
Enter dimension1
10
Enter dimension2
20
Enter your Choice
1
Area of Triangle= 100.0
Do you want to continue?(y/n)
y
Enter dimension1
20
Enter dimension2
30
Enter your Choice
2
Area of Rectangle= 600
Do you want to continue?(y/n)
y
Enter dimension1
30
Enter dimension2
40
Enter your Choice
3
Area of Square= 900
Do you want to continue?(y/n)
y
Enter dimension1
40
Enter dimension2
50
Enter your Choice
4
Area of Circle= 5024.0
Do you want to continue?(y/n)
y
Enter dimension1
30
Enter dimension2
20
Enter your Choice
5
Area of Cylinder= 5652.03768.0
Do you want to continue?(y/n)
y
Enter dimension1
10
Enter dimension2
20
Enter your Choice
6
Area of Cone= 1016.1253449349341
Do you want to continue?(y/n)
y
Enter dimension1
8
Enter dimension2
8
Enter your Choice
8
wrong choice
Do you want to continue?(y/n)
n*/
