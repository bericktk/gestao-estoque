package com.berickdev.estoque.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.berickdev.estoque.api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
