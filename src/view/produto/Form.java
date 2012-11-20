package view.produto;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Form extends JDialog {
	protected JPanel jpDescricao;
	protected JLabel jlDescricao;
	protected JTextField jtfDescricao;

	protected JPanel jpQuantidade;
	protected JLabel jlQuantidade;
	protected JTextField jtfQuantidade;

	protected JPanel jpValor;
	protected JLabel jlValor;
	protected JTextField jtfValor;

	protected JButton jbSalvar;

	public Form() {

		jpDescricao = new JPanel();
		jlDescricao = new JLabel("Descricao");
		jtfDescricao = new JTextField(20);

		jpDescricao.add(jlDescricao);
		jpDescricao.add(jtfDescricao);

		jpQuantidade = new JPanel();
		jlQuantidade = new JLabel("Quantidade");
		jtfQuantidade = new JTextField(20);

		jpQuantidade.add(jlQuantidade);
		jpQuantidade.add(jtfQuantidade);

		jpValor = new JPanel();
		jlValor = new JLabel("Valor");
		jtfValor = new JTextField(20);

		jpValor.add(jlValor);
		jpValor.add(jtfValor);

		jbSalvar = new JButton("Salvar");

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jpDescricao);
		getContentPane().add(jpQuantidade);
		getContentPane().add(jpValor);
		getContentPane().add(jbSalvar);

		setSize(500, 300);
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getRootPane().setDefaultButton(jbSalvar);
	}
}
