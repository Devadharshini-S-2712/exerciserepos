interface socialmedia{
String videos="Youtube";
String reels="Instagram";
String connection="Facebook";
void authYourself();
void pull();
void persist();
}
class Youtube implements socialmedia{
    public void pull(){
        System.out.println("Youtuber post the regular contents in  youtube platform");
    }
    public void authYourself(){}
    public void persist(){}
}
class Instagram implements socialmedia{
    public void authYourself(){
        System.out.println("Scrolling reels");
    }
    public void pull(){}
    public void persist(){}
}
class Facebook implements socialmedia{
    public void persist(){
        System.out.println("connect with other people");
    }
    public void authYourself(){}
    public void pull(){}
}
public class Youtuber{
    public static void main(String[] args) {
        socialmedia med=new Youtube();
        med.pull();
    }
}


