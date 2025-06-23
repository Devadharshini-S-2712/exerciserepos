import java.util.Scanner;
public class sports{
    int playerno;
    String playername;
    int teammembers;
    String sportsname;
    public sports(int playerno,String playername,int teammembers,String sportsname){
        this.playerno=playerno;
        this.playername=playername;
        this.teammembers=teammembers;
        this.sportsname=sportsname;
    }
    public int getplayerno(){
        return playerno;
    }
    public String getplayername(){
        return playername;
    }
     public int getteammembers(){
        return teammembers;
    }
    public String getsportsname(){
        return sportsname;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the playerno:" );
        int playerno=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the player name");
        String playername=scan.nextLine();
        System.out.println("Enter the no of members in a team");
        int teammembers=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the sportsname");
        String sportsname=scan.nextLine();
       sports s=new sports(playerno, playername, teammembers, sportsname);
        System.out.println("playerno:"+ s.getplayerno());
        System.out.println("playername:"+s.getplayername());
        System.out.println("no of persons in a team" +s.getteammembers());
        System.out.println("name of the sports:"+s.getsportsname());
    }
}