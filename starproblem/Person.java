public class Person {
    String firstName;
    String lastName;
    int pincode;

    public Person(String firstName, String lastName, int pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pincode = pincode;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.pincode == p.pincode;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Deva", "Deva", 12345);
        Person p2 = p1; 
        System.out.println(p1.equals(p2));  
    }
}
