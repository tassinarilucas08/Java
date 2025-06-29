package portugues;
public class Livro {
 private String name;
 private String escritor;   
 private int pags;
 private int anoLanc;

 public static void main(String[] args) {
    Livro livro = new Livro();
    livro.name = "Harry Potter";
    livro.pags = 543;
    livro.escritor = "Henry Cavell";
    livro.anoLanc = 1986;
    String livroName = livro.name;
    int livroPags = livro.pags;
    int livroAnoLanc = livro.anoLanc;
    String livroEscritor = livro.escritor;

    System.out.println("O livro " + livroName+", de " +livroPags+ " páginas, do escritor "+livroEscritor+", foi lançado no ano " +livroAnoLanc);
    }
}
//O código não foi pedido com getters e setters mas seria o correto a se fazer. Isso é apenas um exemplo rápido, mas não recomendado