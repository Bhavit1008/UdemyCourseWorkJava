package ClassObjectConstructor;

public class ClassObjectConstructor {
    public ClassObjectConstructor(){
        System.out.println("i m in default constructor");
    }
    public ClassObjectConstructor(int a){
        System.out.println("i m in parameterized constructor : "+a++);
    }
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}
