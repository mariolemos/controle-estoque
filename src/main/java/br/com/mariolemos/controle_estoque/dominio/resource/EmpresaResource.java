package br.com.mariolemos.controle_estoque.dominio.resource;

import br.com.mariolemos.controle_estoque.dominio.Empresa;
import br.com.mariolemos.controle_estoque.dominio.servico.EmpresaService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaResource {

    @Autowired
    public EmpresaService service;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Empresa> incluir(@RequestBody Empresa obj){
        obj = service.incluir(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Empresa>> listarTodos() {
        List<Empresa>obj = service.buscarTodos();
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Long id) {
        Empresa empresa = service.buscarPorId(id);
        return ResponseEntity.ok(empresa);
    }
}



