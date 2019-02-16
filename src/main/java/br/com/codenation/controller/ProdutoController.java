package br.com.codenation.controller;

import br.com.codenation.models.Produto;
import br.com.codenation.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/")
    public List<Produto> getAll (){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto getAllById (@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/")
    public Produto save (@RequestBody Produto produto){
        return repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void ddelete (@PathVariable Long id){
        repository.deleteById (id);
    }


    @PutMapping("/{id}")
    public Produto udpate (@PathVariable Long id, @RequestBody Produto produto){
        produto.setId(id);
        return repository.save(produto);
    }


}
