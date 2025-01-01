import java.util.*;

class Circle{
double r;

public Circle(double r){
r=radius;
}

public double area(){
return (3.14*r*r);
}

public double circumference(){
return (2*3.14*r);
}
}
public class AreaCircumfCircle{
public static void main (String [] args){

Scanner scanner=new Scanner(System.in);


System.out.print("enter value for r - ");
double r=scanner.nextDouble();

Circle circle=new Circle(r);

double area=circle.area();
double circumference=circle.circumference();

System.out.println("area of circle - "+area);
System.out.println("circumference of circle - "+circumference);

scanner.close();
}
}