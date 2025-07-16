import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca{

    ArrayList<Livro> livros = new ArrayList<>(); 
    ArrayList<Escritor> escritores = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void adicionarEscritor(Escritor escritor){
        escritores.add(escritor);
    }
    public void mostrarEscritores(){
        for(Escritor escritor : escritores){
            escritor.mostrarInfoEscritor();
        }
    }
    public void mostrarLivros(){
        for(Livro livro : livros){
            livro.mostrarInfoLivro();
        }}
        
    public void cadastrarLivro(Scanner scanner){
        System.out.println("Quantos livros deseja cadastrar?");
        int qtd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Você vai cadastrar "+qtd+" livros!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

        for(int i=0; i<qtd; i++){
            System.out.println("\nVamos começar!");
            System.out.print("\nQual o nome do autor? ");
            String nome = scanner.nextLine();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("\nQual a nacionalidade do autor? ");
            String nacionalidade = scanner.nextLine();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("\nQual o título do livro? ");
            String titulo = scanner.nextLine();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("\nQuantas páginas tem o livro? ");
            int pags = scanner.nextInt();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            criarLivroComEscritor(nome, titulo, pags, nacionalidade);
           }
        }
     public void criarLivroComEscritor(String nome, String titulo, int pags, String nacionalidade) {
        Escritor escritor = new Escritor(nome, nacionalidade);
        Livro livro = new Livro(titulo, pags, escritor);

        adicionarEscritor(escritor);
        adicionarLivro(livro);
    }
}