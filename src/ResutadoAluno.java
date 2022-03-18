import javax.swing.JOptionPane;

public class ResutadoAluno {

	public static void main(String[] args) {
		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null,"Media"));
		
		if (media >= 6.0) {
			JOptionPane.showMessageDialog(null,"Aprovado");
		} else if (media < 6.0) {JOptionPane.showMessageDialog((null,"Reprovado");}
		

	}

}
