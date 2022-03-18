import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {
		
		String nome = JOptionPane
			.showInputDialog(null,"Laura:");
		String email = JOptionPane
			.showInputDialog(null,"conectlaura:"); 
		String telefone = JOptionPane
			.showInputDialog(null,"00000000:");
		
		String dados = "Nome: " + nome + "\n" +  
				"Email: " + email + "\n" +
				"Telefone: " + telefone;
		
		JOptionPane
			.showMessageDialog(null, dados);
	}

}
