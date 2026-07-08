package TushCodes;


class Grandfather {   // Parent class

    public void land() {
        System.out.println("3 Acres");
    }
}

class Father extends Grandfather {   // Child class

    @Override
    public void land() {
        System.out.println("2 Acres");
    }
}

public class Son extends Father {

    public static void main(String[] args) {

        Son tushar = new Son();

        tushar.land();
    }
}
