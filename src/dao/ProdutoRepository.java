package dao;

import java.util.ArrayList;
import java.util.List;

import model.entity.Produto;

public class ProdutoRepository {

	private static ProdutoRepository repo;
	private List<Produto> produtos;

	private ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	public static ProdutoRepository getInstance() {
		if (repo == null)
			repo = new ProdutoRepository();
		return repo;
	}

	public void add(Produto produto) {
		this.produtos.add(produto);
	}

}
