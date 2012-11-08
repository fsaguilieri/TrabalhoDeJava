package dao;

import model.entity.Produto;

public class ProdutoDAO {

	public void save(Produto produto) {
		ProdutoRepository.getInstance().add(produto);		
	}

}
