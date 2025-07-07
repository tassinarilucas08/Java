public class Escritor {
    private String name;
    private String nacionalidade;

    public Escritor(String name, String nacionalidade){
        this.name = name;
        this.nacionalidade = nacionalidade;
    }
    public void setName(String name){
        this.name = name;
    } 
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getName(){
        return name;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }  
    public void mostrarInfoEscritor(){
        System.out.println("O nome do escritor é "+ getName() +" e a nacionalidade dele é: "+ getNacionalidade());
    }
}
