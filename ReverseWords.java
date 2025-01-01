import java.util.*;

public class ReverseWords{
public static void main(String [] args){

Scanner scanner = new Scanner (System.in);

String original = scanner.nextLine();

String [] words = original.split(" ");

StringBuilder sb = new StringBuilder();

for (int i=words.length-1;i>=0;i--){
sb.append(words[i]).append(" ");
}

System.out.println("final result - "+sb);

scanner.close();
}
}