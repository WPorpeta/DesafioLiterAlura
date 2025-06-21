package br.com.literatura.service;

import org.springframework.stereotype.Service;

@Service
public class LivroService {
    public void buscarLivroPorTitulo(String titulo) {
        System.out.println("Buscando livro com título: " + titulo);
    }

    public void listarLivros() {
        System.out.println("Listando livros...");
    }

    public void listarAutores() {
        System.out.println("Listando autores...");
    }
}