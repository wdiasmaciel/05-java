import javax.swing.JOptionPane;
 
public class Main {
    
	public static void main(String args[]){
 		String nome, sobrenome, nomeCompleto;

        	nome = JOptionPane.showInputDialog("Digite o seu primeiro nome: ");
        	sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");

        	nomeCompleto = nome + " " + sobrenome;

        	JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nomeCompleto);
                 
		System.exit(0);
    }
}
