class Factory {
    void agriculture() {
        System.out.println("Farmers need organic pesticides");
    }
}

class Chemical extends Factory {
    void chemical() {
        System.out.println("Chemical industry releases the chemical content in the river");
    }
}

public class Main {
    public static void main(String[] args) {
        Chemical c = new Chemical();
        c.agriculture();
        c.chemical();
       
    }
}
