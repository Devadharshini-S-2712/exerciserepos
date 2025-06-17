public class reversnumber {
    public static void main(String[] args) {
        int number=10022423;
        int reversed=0;
        while(number!=0){
            int perform=number%10;
            reversed=reversed*10+perform;
            number=number/10;


        }
        System.out.println(reversed);
    }
}
