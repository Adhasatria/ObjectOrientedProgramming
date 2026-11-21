
abstract class Entitas {
    abstract void bergerak();
    abstract void bernafas();
}

interface Kerja {
    void masaknasi();
}

class Manusia extends Entitas implements Kerja {
    @Override
    void bergerak() {
        System.out.println("Lagi jalan....");
    }

    @Override 
    void bernafas(){
        System.out.println("Haaaah.....");
    }

    @Override
    public void masaknasi() {
        System.out.println("Nasi udah masak wak.....");
    }
}

public class Main {
    public static void main(String[] args) {
        Manusia satria = new Manusia();
        satria.bernafas();
        satria.bergerak();
        satria.masaknasi();
    }
}
