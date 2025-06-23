public class vehiclep {
    int vehicleno;
    String vcolor;
    String vehiclename;
   public vehiclep(int vehicleno,String vcolor,String vehiclename){
        this.vehicleno=vehicleno;
        this.vcolor=vcolor;
        this.vehiclename=vehiclename;
   }
   public int getvehicleno(){
    return vehicleno;
   }
   public String getvcolor(){
    return vcolor;
   }
  public String getvehiclename() {
        return vehiclename;
    }
    public static void main(String[] args) {
        vehiclep vp=new vehiclep(27,"Blue","Hyundai car");
        System.out.println(vp.vehicleno);
        System.out.println(vp.vcolor);
        System.out.println(vp.vehiclename);
        
    }
}
