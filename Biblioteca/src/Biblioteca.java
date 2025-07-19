import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca{

    ArrayList<Livro> livros = new ArrayList<>(); 
    ArrayList<Escritor> escritores = new ArrayList<>();

    public void alugarLivro(Scanner scanner){
        System.out.print("Quantos livros deseja alugar?");
        int qtd = scanner.nextInt();
        for(int i=0; i<qtd; i++){
            System.out.println("Qual o nome do livro?");
            String nomeLivro = scanner.nextLine();
            for(Livro livro : livros){
                if(nomeLivro.toUpperCase() == livro.getTitulo().toUpperCase()){
                    System.out.println("Você alugou o livro: "+livro.getTitulo());
                }
                else{
                    System.out.println("Vish... Infelizmente não temos esse");
                }
            }           
        }
    }
    public void comprarLivro(Scanner scanner, Usuario usuario){
        System.out.println("Quantos livros deseja comprar?");
        int qtd = scanner.nextInt();
        for(int i=0; i<qtd; i++){
            System.out.println("Qual o nome do livro?");
            String nomeLivro = scanner.nextLine();
            for(Livro livro : livros){
                if(nomeLivro.toUpperCase() == livro.getTitulo().toUpperCase()){
                    if(usuario.getDinheiro() >= livro.getPreco()){
                        System.out.println("Você comprou o livro: "+livro.getTitulo());
                    }
                    else{
                        System.out.println("Você não tem mais dinheiro pra gastar aqui");
                        break;
                    }
                }
                else{
                    System.out.println("Vish... Infelizmente não temos esse");
                }
            }
        }
    }
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
            System.out.print("\nQual o preço do livro? ");
            double preco = scanner.nextInt();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
            criarLivroComEscritor(nome, titulo, pags, nacionalidade, preco);
            System.out.println("Você cadastrou o livro: " +titulo+ ". Parabéns!");
           }
        }
     public void criarLivroComEscritor(String nome, String titulo, int pags, String nacionalidade, double preco) {
        Escritor escritor = new Escritor(nome, nacionalidade);
        Livro livro = new Livro(titulo, pags, preco, escritor);

        adicionarEscritor(escritor);
        adicionarLivro(livro);
    }
}