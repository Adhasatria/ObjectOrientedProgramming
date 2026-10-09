public class Lingkaran extends Bentuk {
    private double radius;
    protected static final double PI= 3.14;

    public Lingkaran() {
    }

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }

    public double hitungLuas(){
        return PI*(radius*radius);
    }

    @Override 
    public void printInfo(){
        System.out.println("Lingkaran berwarna "+ getWarna() + ", luas = " + hitungLuas());
    }

    

    
}
