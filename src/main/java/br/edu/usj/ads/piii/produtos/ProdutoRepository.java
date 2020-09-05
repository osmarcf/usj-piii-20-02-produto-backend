package br.edu.usj.ads.piii.produtos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto, Long> {
    List<Produto> findAll();
}
