public class Bentuk {
    String warna;

    public Bentuk(){
        
    }

    public Bentuk(String warna) {
        this.warna= warna;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void printInfo(){
        System.out.println("Bentuk berwarna = " + warna);
    }

    public static void main(String[] args) {
        
    }
    
}
