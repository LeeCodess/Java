import java.util.*;

class Rhombus{
double d1;
double d2;
double a;

public Rhombus(double diagonal1, double diagonal2, double side){
d1=diagonal1;
d2=diagonal2;
a=side;
}

public double area(){
return (d1*d2)/2;
}

public double perimeter(){
return 4*a;
}
}

public class AreaPeriRhombus{
public static void main(String [] args){

Scanner scanner=new Scanner(System.in);

System.out.print("enter diagonal 1 - ");
double d1=scanner.nextDouble();

System.out.print("enter diagonal 2 - ");
double d2=scanner.nextDouble();

System.out.print("enter side - ");
double a=scanner.nextDouble();

Rhombus rhombus=new Rhombus(d1,d2,a);

double area=rhombus.area();
double perimeter=rhombus.perimeter();

System.out.println("area of the rhombus - "+area);

System.out.println("perimeter of the rhombus - "+perimeter);

scanner.close();
}
}




