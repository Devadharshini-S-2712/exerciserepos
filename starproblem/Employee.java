import java.util.*;


public class Employee{
    String First_name;
    String Last_name;
    int Emp_id;
public Employee(String First_name,String Last_name,int Emp_id ){
    this.First_name=First_name;
    this.Last_name=Last_name;
    this.Emp_id=Emp_id;
}

    public String toString() {
        return First_name + " " + Last_name;
        }
    
public static void main(String[] args) {
    Map<String,List<Employee>>map=new  HashMap<>();
    Employee e1=new Employee("Karthik", "Ragunathan", 123);
     Employee e2=new Employee("Dev", "Shree", 345);
     Employee e3=new Employee("keerthi", "Parthiban", 678);
     Employee e4=new Employee("lakshya", "Shree", 246);
      Employee e5=new Employee("refa", "king", 908);
    List<Employee>morningshift=new ArrayList<>();
    morningshift.add(e1);
     morningshift.add(e3);
    morningshift.add(e5);
    List<Employee> eveningshift=new ArrayList<>();
    eveningshift.add(e2);
    eveningshift.add(e4);
    map.put("Morning Shift", morningshift);
    map.put("Evening Shift", eveningshift);
    System.out.println(map);

    

}

}