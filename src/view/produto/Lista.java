package view.produto;


import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import view.produto.model.JListaDeProdutosTableModel;

@SuppressWarnings("serial")
public class Lista extends JDialog {
	private JTable jtLista;
	private JListaDeProdutosTableModel jtmListaDeProdutos;
	
	public Lista() {
		jtmListaDeProdutos = new JListaDeProdutosTableModel();
		jtLista = new JTable(jtmListaDeProdutos);
		
		getContentPane().add(new JScrollPane(jtLista));
		setSize(500,300);
		pack();
	}
}
