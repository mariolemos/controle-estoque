package br.com.mariolemos.controle_estoque.dominio.repositorio;

import br.com.mariolemos.controle_estoque.dominio.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
