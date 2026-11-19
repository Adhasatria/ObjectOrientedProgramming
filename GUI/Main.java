import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Celscius to Fahrenheit");
        JPanel panel = new JPanel();
        JTextField input = new JTextField(10);
        JButton konversi = new JButton("Konversi");
        JLabel label = new JLabel("Masukkan suhu celcius =");
        JLabel hasil = new JLabel("Hasil koonversi : ");

        panel.add(label);
        panel.add(input);
        panel.add(konversi);
        panel.add(hasil);

        frame.add(panel, BorderLayout.EAST);
        frame.setSize(480, 100);
        frame.setVisible(true);

        konversi.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String masukkan = input.getText();
            Double celcius = Double.valueOf(masukkan);
            Double fahrenheit = (celcius * 9 / 5) + 32;
            String keluaran = String.valueOf(fahrenheit); 
            hasil.setText(keluaran);
        }
    });


        
    }
}
    
