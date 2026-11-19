
abstract class Kendaraan {
    abstract void bergerak();

    void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan.");
    }
}

interface BisaBerhenti {
    void berhenti();
}

class Mobil extends Kendaraan implements BisaBerhenti {
    @Override
    void bergerak() {
        System.out.println("Mobil sedang berjalan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nyalakanMesin();
        mobil.bergerak();
        mobil.berhenti();
    }
}
