import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField pantalla;
    private String operador = "";
    private double num1 = 0;

    public Calculadora() {  initComponents();  }
    private void initComponents() {
        setTitle("Calculadora Grid");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        // Pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);
        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));
        String[] botones = { "7", "8", "9", "/", "2^x", "4", "5", "6", "*","3^x", "1", "2", "3", "-","4^x", "C", "0", "=", "+","5^x"  };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            boton.addActionListener(this);
            panelBotones.add(boton);
        }
        add(panelBotones, BorderLayout.CENTER);        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        // Si es número
        if (comando.matches("[0-9]")) {
            pantalla.setText(pantalla.getText() + comando);
        }
        // Si es operación
        else if (comando.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(pantalla.getText());
            operador = comando;
            pantalla.setText("");
        }
        else if(comando.matches("[2-5]\\^x")){
            num1 = Double.parseDouble(pantalla.getText());
            operador = comando;
            pantalla.setText("");
        }
        // Si es = tomará el valor num1 y num2 para operar
        else if (comando.equals("=")) {
            double num2;
            if (!comando.matches("[2-5]\\^x")){ 
                num2=0;
            }
            else{
                num2 = Double.parseDouble(pantalla.getText());
            }
            double resultado = 0;
            switch (operador) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(this, "No se puede dividir entre 0");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                case "2^x":
                    resultado = Math.pow(2,num1);
                    break;
                case "3^x":
                    resultado = Math.pow(3,num1);
                    break;
                case "4^x":
                    resultado = Math.pow(4,num1);
                    break;
                case "5^x":
                    resultado = Math.pow(5,num1);
                    break;
            }
            pantalla.setText(String.valueOf(resultado));
        }
        // Si es C
        else if (comando.equals("C")) {
            pantalla.setText("");
            operador = "";
            num1 = 0;
        }
    }
    public static void main(String[] args) {
        new Calculadora();
    }
}