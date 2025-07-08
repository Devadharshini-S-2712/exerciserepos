interface A{

    int age=66;
    String area="mubai";

    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("in sghow");
    }
    public void config(){
        System.out.println("configuration");
    }
}
public class demo{
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj.config();
        System.out.println(A.area);
        System.out.println(A.age);
    }
}