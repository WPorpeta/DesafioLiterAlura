package br.com.literatura;

import br.com.literatura.service.LivroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

    private final LivroService livroService;

    public LiteraturaApplication(LivroService livroService) {
        this.livroService = livroService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiteraturaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Buscar livro por título");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Listar autores");
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                livroService.buscarLivroPorTitulo(titulo);
            }
            case 2 -> livroService.listarLivros();
            case 3 -> livroService.listarAutores();
            default -> System.out.println("Opção inválida!");
        }
    }
}