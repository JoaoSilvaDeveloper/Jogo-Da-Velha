/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha;
import javax.swing.*;
/**
 *
 * @author Joma
 */
public class Metodos {
    int cont=0;
    int vitoriax=0;
    int vitoriaO=0;
    int empate=0;
    int op;
    boolean zit = true;
    public void marcar(JButton b1){
        if(cont%2==0){
           if(b1.getText().equals("")){
               b1.setText("X");
               cont++;
              
           }
       }
       if(cont%2==1){
           if(b1.getText().equals("")){
               b1.setText("O");
               cont++;
           }
       }
    }
    public void vitoriax(JLabel ContWin2,JLabel ContWin1,JButton b1,JButton b2,JButton b3){
       if(cont > 4){
         if(b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")){
             JOptionPane.showMessageDialog(null, "Jogador 1 Venceu", "Vitória", 1);
             vitoriax++;
             Integer.toString(vitoriax);
             ContWin1.setText("Número de Vitórias:"+vitoriax);
             zit=false;
             
         }else if(b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")){
             JOptionPane.showMessageDialog(null, "Jogador 2 Venceu", "Vitória", 1);
             vitoriaO++;
             Integer.toString(vitoriaO);
             ContWin2.setText("Número de Vitórias:"+vitoriaO);
             zit=false;
         }
       }
        
    }
    public void empate(JLabel ContEmpate,JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9){
        if(!b1.getText().equals("")&&
           !b2.getText().equals("")&&
           !b3.getText().equals("")&&
           !b4.getText().equals("")&&
           !b5.getText().equals("")&&
           !b6.getText().equals("")&&
           !b7.getText().equals("")&&
           !b8.getText().equals("")&&
           (!b9.getText().equals(""))&& zit==true) {
             JOptionPane.showMessageDialog(null, "Deu Velha", "Empate", 2);
             empate++;
             Integer.toString(empate);
             ContEmpate.setText("Número de Empate:"+empate);
         }
     
        
        
    }
    public void apagar(JButton Novo,JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9){
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            cont=0;
        }
         }

    
    


