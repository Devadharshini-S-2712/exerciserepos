public class vehicle{
    int vno;
    String vehiclename;
     public int getvno() {
        return vno;
    }
    public String getvehiclename(){
        return vehiclename;
    }
    public static void main(String[] args) {
        vehicle v=new vehicle();
        System.out.println("Default constructor  is called");
        System.out.println(v.getvno());
        System.out.println(v.getvehiclename());
        
    }
}