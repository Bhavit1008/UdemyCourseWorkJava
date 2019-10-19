import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Arrays {
    public static void main(String args[]){
        int size;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = s.nextInt();
        int[] values = new int[size];

        for(int i=0;i<size;i++){
            values[i] = s.nextInt();
        }
        System.out.println("values of array\n");
        for(int i=0;i<size;i++){
            System.out.println(values[i]);
        }
        System.out.println("Length of the array");
        System.out.println(values.length);
    }
}
