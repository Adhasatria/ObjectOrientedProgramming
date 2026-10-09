import java.util.Scanner;
public class Calc{
    public static void kalkulator(){
        Scanner input = new Scanner(System.in);

        int angka1;
        int angka2;
        char pilihan;

        System.out.println("Silahkan masukkan Angka pertama anda");
        System.out.println("Angka 1 :");
        angka1= input.nextInt();
        System.out.println("Silahkan masukkan Angka kedua anda");
        System.out.println("Angka 2 :");
        angka2= input.nextInt();

        do{
        System.out.println("Pilih operasi yang ingin dijalankan :");
        System.out.println('+');
        System.out.println('-');
        System.out.println('*');
        System.out.println('/');
        pilihan= input.next().charAt(0);
        
        switch (pilihan){
            case '+' :
                System.out.println("Hasil penjumlahan angka adalah :" + (angka1 + angka2));
                break;
            
            case '-' :
                System.out.println("Hasil pengurangan angka adalah :" + (angka1 - angka2));
                break;
            
            case '*' :
                System.out.println("Hasil perkalian angka adalah :" + (angka1 * angka2));
                break;
            case '/' :
                int hasil;
                hasil= angka1 / angka2;
                if(angka1==0||angka2==0){
                    System.out.println("Gagal!!");
                }else{
                    System.out.println("Hasil pembagian angka adalah :" + (hasil));
                }
                break;
            default:
                System.out.println("input tidak valid");
                break;
                }
        }while(pilihan !='+'&& pilihan !='-'&& pilihan !='*'&& pilihan !='/');
        input.close();
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di Kalkulator");
        kalkulator();

    }
}
