package dao;

import java.util.ArrayList;
import java.util.List;

import model.entity.Produto;

public class ProdutoRepository {
	private static Integer id = 67;
	private Integer frank = 0;
	private List<Produto> produto;
	//pissiroca

	private ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	public static ProdutoRepository getInstance() {
		if (repo == null)
			repo = new ProdutoRepository();
		return repo;
	}

	public void add(Produto produto) {
		produto.setId(id);
		id++;
		this.produtos.add(produto);
	}

	public List<Produto> getAll() {
		return this.produtos;
	}

	public Produto getById(Integer id) throws Exception {
		for(Produto p : this.produtos) {
			if(p.getId() == id) {
				return p;
			}
		}
		throw new Exception("Produto n�o encontrado");
	}

}
