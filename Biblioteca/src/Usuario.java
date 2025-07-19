import java.util.Scanner;

public class Usuario {
    private static int contador = 0;
    private boolean isLogged = false;
    private int id;
    private int idType;
    private String name;
    private String lastName;
    private String senha;
    private String email;
    private String cpf;
    private String phone;
    private String street;
    private int numberHouse;
    private double dinheiro;

    public Usuario(String name, String lastName, String senha, String email, String cpf, String phone, String street, int numberHouse, double dinheiro) {
    this.id = contador++;
    this.idType = 1;
    this.name = name;
    this.lastName = lastName;
    this.senha = senha;
    this.email = email;
    this.cpf = cpf;
    this.phone = phone;
    this.street = street;
    this.numberHouse = numberHouse;
    this.dinheiro = dinheiro;
    this.isLogged = false;
    }
    public Usuario(){

    };
    public boolean getIsLogged(){
        return isLogged;
    }
    public void setIsLogged(boolean isLogged){
        this.isLogged = isLogged;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
     public int getIdType(){
        return idType;
    }
    public void setIdType(int idType){
        this.idType = idType;
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
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    public double getDinheiro(){
        return dinheiro;
    }
    public static Usuario fazerCadastro(Scanner scanner){

        System.out.println("\nSeja bem vindo! Vamos fazer o seu cadastro!\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite seu sobrenome: ");
        String lastName = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite o valor que tem pra gastar: ");
        double dinheiro = scanner.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite seu cpf no formato XXX.XXX.XXX-XX: ");
        String cpf = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite seu telefone no formato XX XXXXX-XXXX: ");
        String phone = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Digite sua rua: ");
        String street = scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("Digite o número da sua casa: ");
        int numberHouse = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------\n");

        Usuario usuario = new Usuario(name, lastName, senha, email, cpf, phone, street, numberHouse, dinheiro);

        System.out.println("\nSeja bem-vindo " + usuario.getName() + " " + usuario.getLastName() + "!");
        return usuario;
    }    
}