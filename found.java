interface Agriculture {
    void paddy();
    void wheat();
}

class Crop implements Agriculture {
    public void paddy() {
        System.out.println("Paddy is mostly grown in delta region");
    }

    public void wheat() {
        
    }
}

class Diet implements Agriculture {
    public void paddy() {
       
    }

    public void wheat() {
        System.out.println("Wheat is almost grown in the northern regions of India");
    }
}

public class  found{
   public static void main(String[] args) {
        Agriculture ag1 = new Crop();
        ag1.paddy();
        ag1.wheat();

        Agriculture ag2 = new Diet();
        ag2.paddy();
        ag2.wheat();
    }
}
