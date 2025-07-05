public class Biblioteca{

    public static void main(String[] args) {
        Escritor escritor = new Escritor("J.K.Rowling", "Britânica");
        Livro livro = new Livro("Harry Potter e o Cálice de Fogo", 480, escritor);

        System.out.println(livro);
    }
}
