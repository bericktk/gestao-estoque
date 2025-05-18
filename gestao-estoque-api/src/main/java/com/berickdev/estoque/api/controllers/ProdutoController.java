package com.berickdev.estoque.api.controllers;
import com.berickdev.estoque.api.models.Produto;
import com.berickdev.estoque.api.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

}
