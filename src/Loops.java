public class Loops {
    public static void main(String args[]){

        //While Loop
        int i=0,sum = 0;
        while(i<10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum); //output = 45

        //For Loop
        int sum1=0;
        for(i=0;i<10;i++){
            sum1 = sum1 + i;
        }
        System.out.println(sum1);  //output = 45
    }
}
