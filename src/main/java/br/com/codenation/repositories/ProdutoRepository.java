package br.com.codenation.repositories;

import br.com.codenation.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNome (String nome );
    List<Produto> findByQuantidadeAndValor(int quantidade, double valor);

}



