package br.com.codenation.repositories;

import br.com.codenation.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNomeAndQuantidade(String nome, int quantidade);
    Produto findByNome (String nome );

}



