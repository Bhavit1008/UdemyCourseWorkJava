import java.util.Scanner;

public class IfStatements {
    public static void main(String args[]){
        boolean x = 5<10;
        if(x)
            System.out.println("x is true");
        else
            System.out.println("x is false");

        Scanner s = new Scanner(System.in);
        int c=0;
        if(c == s.nextInt())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
