package br.com.mariolemos.controle_estoque.dominio.repositorio;

import br.com.mariolemos.controle_estoque.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
