package GetterAndSetter;

public class DriverClass {
    public static void main(String args[]){
        GetterAndSetter obj = new GetterAndSetter();
        obj.setter(4,5);
        System.out.println(obj.getter());
    }
}
