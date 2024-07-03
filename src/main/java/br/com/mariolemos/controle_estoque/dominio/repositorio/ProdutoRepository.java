package br.com.mariolemos.controle_estoque.dominio.repositorio;

import br.com.mariolemos.controle_estoque.dominio.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
