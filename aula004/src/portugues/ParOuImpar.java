public class ParOuImpar {
    public static boolean ehPar(int numero){
        boolean par = false;
        if(numero % 2 == 0){
            par = true;
        }
        return par;
    }
    public static void main(String[] args) {
        System.out.println(ehPar(10));
    }
}
