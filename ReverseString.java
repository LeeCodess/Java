import java.util.*;

public class ReverseString{
public static void main (String [] args){

Scanner scanner = new Scanner(System.in);
System.out.println("enter a line - ");
String original=scanner.nextLine();

StringBuilder sb = new StringBuilder(original);
String result=sb.reverse().toString();

System.out.println("the reversed string - "+result);

scanner.close();
}
}