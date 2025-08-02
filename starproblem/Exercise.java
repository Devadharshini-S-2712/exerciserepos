public class Exercise {
    int marks;

    public Exercise(int marks) {
        this.marks = marks;
    }

    public int mark() {
        return 95;
    }

    public static void main(String[] args) {
        Exercise ex=new Exercise(95);
        Exercise exercise = ex;  
        System.out.println(ex.equals(exercise)); 

    }
}
