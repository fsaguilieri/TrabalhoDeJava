package dao;

import model.entity.Produto;

public class ProdutoDAO {

	public boolean commit(Produto produto) {
		ProdutoRepository.getInstance().add(produto);		
		return true;
	}

}
