import java.util.*;

public class ReverseInteger{
public static void main(String [] args){

Scanner scanner=new Scanner(System.in);
System.out.println("enter any number between -127 to 127 - ");
String original=scanner.nextLine();

StringBuilder sb=new StringBuilder(original);

String result=sb.reverse().toString();
System.out.println("the reversed integer - "+result);

scanner.close();
}
}