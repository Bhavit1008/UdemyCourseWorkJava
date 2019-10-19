import java.util.Scanner;

public class ArrayOfStrings {
    public static void main(String args[]){
        String []name = new String[2];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<name.length;i++){
            name[i] = s.nextLine();
        }
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
    }
}
