package GetterAndSetter;

public class GetterAndSetter {
    private int a,b;

    public int getter(){
        return a+b;
    }
    public void setter(int x,int y){
        this.a = x;
        this.b = y;
    }
}
