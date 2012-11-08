package view.produto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.vo.ProdutoVO;
import controller.ProdutosController;

@SuppressWarnings("serial")
public class New extends JDialog {
	private JPanel jpDescricao;
	private JLabel jlDescricao;
	private JTextField jtfDescricao;

	private JPanel jpQuantidade;
	private JLabel jlQuantidade;
	private JTextField jtfQuantidade;

	private JPanel jpValor;
	private JLabel jlValor;
	private JTextField jtfValor;

	private JButton jbSalvar;

	public New() {

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

		jbSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ProdutoVO vo = new ProdutoVO();
				vo.setDescricao(jtfDescricao.getText());
				vo.setQuantidade(new Integer(jtfQuantidade.getText()));
				vo.setValor(new BigDecimal(jtfValor.getText()));
				ProdutosController.create(vo);
			}

		});

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jpDescricao);
		getContentPane().add(jpQuantidade);
		getContentPane().add(jpValor);
		getContentPane().add(jbSalvar);

		setSize(500, 300);
		pack();
	}
}
