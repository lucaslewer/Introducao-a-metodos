/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_tres;
import javax.swing.JOptionPane;

public class Exemplo_Tres {

    public static void main(String[] args) {
        int idade1, idade2;
        String nome1, nome2;
        
        nome1=JOptionPane,showInputDialog("Digite o nome da 1ª pessoa: ");
        idade2=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2ª pessoa"));
        
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
        
        JOptionPane.showMessageDialog(null, texto);
        
    }
    static String PessoaMaisVelha(String n1, int id1, String n2, int id2) {
        if (id1>id2)
            return n1 + " é a pessoa mais velha";
        else
            if (id2 > id1)
                return n2 + " é a pessoa mais velha";
            else
                return n1 + " e " + n2 + "tem a mesma idade";
            
    }
}
