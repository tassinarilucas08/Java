public class Livro {
    private String titulo;
    private int pags;
    private Escritor escritor;
    private double preco;

    public Livro(String titulo, int pags, double preco, Escritor escritor){
        this.preco = preco;
        this.titulo = titulo;
        this.pags = pags;
        this.escritor = escritor;
    }
    public Livro(){

    };
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setPags(int pags){
        this.pags = pags;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getPags(){
        return pags;
    }
    public Escritor getEscritor(){
        return escritor;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void mostrarInfoLivro(){
        System.err.println("O livro do título " + getTitulo()+ " tem "+ getPags() +" pags"+ " e foi escrito pelo escritor(a) "+ 
        escritor.getName()+" de nacionalidade "+ escritor.getNacionalidade() + ". Seu preço é: "+getPreco());
    }
}
