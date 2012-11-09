package view.produto.model;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import view.vo.ProdutoVO;
import controller.ProdutosController;

public class JListaDeProdutosTableModel extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String[] nomesDasColunas = new String[]{"Descricao", "Quantidade", "Valor"};
	private List<ProdutoVO> listaDeProdutos;
	
	public JListaDeProdutosTableModel() {
		atualizarDados();
	}
	
	@Override
	public int getRowCount() {
		if(listaDeProdutos == null)
			return 0;
		return listaDeProdutos.size();
	}
	
	public int getColumnCount() {
		return nomesDasColunas.length;
	}
	
	private void atualizarDados() {
		this.listaDeProdutos = ProdutosController.getAllProdutos();
		fireTableStructureChanged();
	}
	
	public Object getValueAt(int row, int column) {
		ProdutoVO p = this.listaDeProdutos.get(row);
		return "";
	}
	
	public String getColumnName(int column) {
		return this.nomesDasColunas[column];
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}
}
