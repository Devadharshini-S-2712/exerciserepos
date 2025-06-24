import java.util.Scanner;
public class calculator{
    int a;
    int b;
    public int add(int a,int b){
        return a + b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul (int a,int b){
        return a*b;
    }
    public int div(int a,int b){
       return a%b;
    }
    public static void main(String[] args) {
        calculator c=new calculator();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=scan.nextInt();
        System.out.println("enter the b value:");
        int b=scan.nextInt();
        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
        System.out.println(c.mul(a, b));
        System.out.println(c.div(a, b));
    }
}