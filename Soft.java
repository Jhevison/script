import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.InputMismatchException;
                  
public class Soft extends JFrame{


JButton vezes = new JButton("x");
JButton menos = new JButton("-");
JButton mais = new JButton("+");
JButton dividir = new JButton("/");
JTextField texto = new JTextField();
JLabel resultado = new JLabel();
JTextField texto2 = new JTextField();



Soft(){
//Primeiro Evento
mais.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
//tratamento de erro
try{
double cap1 = Double.parseDouble(texto.getText());
double cap2 = Double.parseDouble(texto2.getText());


double resu = cap1+cap2;


resultado.setText("Resultado:"+resu+"");
texto.setText("");
texto2.setText("");
}catch(Exception erro){
                   
JOptionPane.showMessageDialog(null, "Erro! Digitacao Incorreta!");

}//fim catch


}
});//Fim evento



//Segundo Evento
menos.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent m){
//tratamento de erros
try{
double m1 = Double.parseDouble(texto.getText());
double m2 = Double.parseDouble(texto2.getText());
double ma = m1 - m2;


resultado.setText("Resultado:"+ma);
texto.setText("");
texto2.setText("");
}catch(Exception erro){

JOptionPane.showMessageDialog(null,"Erro! Digitacao incorreta");

}//fim catch



}
});

//Terceiro evento
vezes.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent v){

//tratamento de erros
try{
double v1 = Double.parseDouble(texto.getText());
double v2= Double.parseDouble(texto2.getText());
double v3 = v1 * v2;
resultado.setText("Resultado:"+v3+"");
texto.setText("");
texto2.setText("");
}catch(Exception erro){

JOptionPane.showMessageDialog(null, "Erro! Digitacao incorreta.");

}//fim catch


}
});

//Quarto Evento

dividir.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent d){

//tratamento de erros
try{
double d1 = Double.parseDouble(texto.getText());
double d2 = Double.parseDouble(texto2.getText());
double d3 = d1 / d2;
resultado.setText("Resultado:"+d3+"");
texto.setText("");
texto2.setText("");
}catch(Exception erro){

JOptionPane.showMessageDialog(null, "Erro! Digitacao Incorreta.");

}//fim catch

}
});

//add
add(texto);
add(texto2);
add(resultado);
add(vezes);
add(menos);
add(mais);
add(dividir);



//fontes
mais.setFont(new Font("Arial", Font.BOLD, 30));
texto.setFont(new Font("Arial", Font.BOLD, 20));
texto2.setFont(new Font("Arial", Font.BOLD, 20));
menos.setFont(new Font("Arial", Font.BOLD, 30));
vezes.setFont(new Font("Arial", Font.BOLD, 30));
dividir.setFont(new Font("Arial", Font.BOLD, 30));
resultado.setFont(new Font("Arial", Font.BOLD, 10));
//Layout
setLayout(new GridLayout(3, 6));
                             
//Janela
setTitle("Calculadora");
setSize(400, 400);
              
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);
setLocationRelativeTo(null);
setVisible(true);
}


public static void main(String[] args){


new Soft();

}
}
