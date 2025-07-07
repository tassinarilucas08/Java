public class Livro {
    private String titulo;
    private int pags;
    private Escritor escritor;

    public Livro(String titulo, int pags, Escritor escritor){
        this.titulo = titulo;
        this.pags = pags;
        this.escritor = escritor;
    }
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
    public void mostrarInfoLivro(){
        System.err.println("O livro do título " + getTitulo()+ " tem "+ getPags() +" pags"+ " e foi escrito pelo escritor(a) "+ 
        escritor.getName()+" de nacionalidade "+ escritor.getNacionalidade());
    }
}
