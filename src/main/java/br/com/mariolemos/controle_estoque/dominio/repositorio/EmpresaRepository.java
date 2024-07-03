package br.com.mariolemos.controle_estoque.dominio.repositorio;

import br.com.mariolemos.controle_estoque.dominio.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
