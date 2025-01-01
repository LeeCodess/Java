abstract class Interest{
abstract double calculateSimpleInterest();
abstract double calculateCompoundInterest();
}

class CalculateInterest extends Interest{
double p;
double r;
double t;

public CalculateInterest(double principal, double rate, double time){
p=principal;
r=rate;
t=time;
}

@Override
double calculateSimpleInterest(){
return (p*r*t)/100;
}

@Override
double calculateCompoundInterest(){
return p*Math.pow(1+(r/100),t)-p;
}
}

public class CalculateSimpleCompoundInterest{
public static void main(String [] args){

CalculateInterest calculateInterest = new CalculateInterest(25000,9.25,5);

double calculateSimpleInterest=calculateInterest.calculateSimpleInterest();
double calculateCompoundInterest=calculateInterest.calculateCompoundInterest();

System.out.println("the simple interest is - "+calculateSimpleInterest);
System.out.println("the compound interest is - "+calculateCompoundInterest);

}
}