package com.example.artigospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.artigospringboot.entity.*;


public interface Contatos extends JpaRepository<Contato, Long>{

}
