interface activity{
    String exercise="Jogging";
    void show();
}
class swimming implements activity{
    public void show(){
        System.out.println("swimming in the age from 10 to 20 ");
    }
}
public class demo2{
    public static void main(String[] args) {
        activity obj=new swimming();
        obj.show();
        System.out.println(obj.exercise);
    }
}