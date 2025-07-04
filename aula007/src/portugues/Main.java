package portugues;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Dogao";
        cachorro1.idade = 3;
        cachorro1.raca = "Labrador";
        
        cachorro1.Latir();
        cachorro1.Comer();
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Dogona";
        cachorro2.idade = 2;
        cachorro2.raca = "Poodle";
        cachorro2.Latir();
        cachorro2.Comer();
    }
}
