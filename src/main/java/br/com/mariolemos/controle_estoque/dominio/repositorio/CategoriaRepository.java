package br.com.mariolemos.controle_estoque.dominio.repositorio;

import br.com.mariolemos.controle_estoque.dominio.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
