import java.util.Scanner;

public class Cliente {
    private static int contador = 0;
    private int id;
    private String name;
    private String lastName;
    private String senha;
    private String email;
    private String cpf;
    private String phone;
    private String street;
    private int numberHouse;

    public Cliente(int id, String name, String lastName, String email, String cpf, String phone, String street, int numberHouse){
        this.id = contador++;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.street = street;
        this.numberHouse = numberHouse;
    }
    public Cliente(){

    };
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
     public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public int getNumberHouse(){
        return numberHouse;
    }
    public void setNumberHouse(int numberHouse){
        this.numberHouse = numberHouse;
    }
    public void mostrarInfoCliente(){
        System.out.println("O nome deste cliente é " + getName() + " " + getLastName() + " e o seu email é " + getEmail() + ". O resto você não precisa saber");   
        }
    public void boasVindas(){
        System.out.println("Seja bem vindo " + getName() + " " + getLastName());
    }
    public void fazerCadastro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Digite seu sobrenome");
        String lastName = scanner.nextLine();
        setLastName(lastName);
    }    
}
