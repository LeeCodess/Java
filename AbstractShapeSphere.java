import java.util.*;

abstract class Shape{
abstract double surfaceArea();
abstract double volume();
}

class Sphere extends Shape{
double r;

public Sphere(double radius){
r=radius;
}

@Override
public double surfaceArea(){
return (4*3.14*r*r);
}

@Override
public double volume(){
return (4/3*3.14*r*r*r);
}
}

public class AbstractShapeSphere{
public static void main (String [] args){

Scanner scanner=new Scanner(System.in);

System.out.print("enter any r - ");
double r=scanner.nextDouble();

Sphere sphere=new Sphere(r);

double surfaceArea=sphere.surfaceArea();
double volume=sphere.volume();

System.out.println("the surface area - "+surfaceArea);
System.out.println("the volume - "+volume);

scanner.close();

}
}