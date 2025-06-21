package br.com.literalura;

import br.com.literalura.service.LivroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

    private final LivroService livroService;

    public LiterAluraApplication(LivroService livroService) {
        this.livroService = livroService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Listar livros");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            livroService.listarLivros();
        }
    }
}