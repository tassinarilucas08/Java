import java.util.ArrayList;

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
        }
    }
     public void criarLivroComEscritor(String nome, String nacionalidade, String titulo, int pags) {
        Escritor escritor = new Escritor(nome, nacionalidade);
        Livro livro = new Livro(titulo, pags, escritor);

        adicionarEscritor(escritor);
        adicionarLivro(livro);
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.criarLivroComEscritor("J.K. Rowling", "Britânica", "Harry Potter e o Cálice de Fogo", 480);
        biblioteca.criarLivroComEscritor("E.Kuball", "Brasileiro", "Tudo dá certo no final", 333);

        biblioteca.mostrarLivros();
    }
}