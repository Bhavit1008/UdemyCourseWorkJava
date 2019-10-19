public class StringBuild {
    public static void main(String args[]){

        String info = "";
        info += "My name is Bhavit";
        info += " ";
        info += "This is my course material";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();
        sb.append("String builder is used.").append(" ").append("by using append function");
        System.out.println(sb);
    }
}
