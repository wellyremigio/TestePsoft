
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = read.next();
        System.out.println("Olá, " + nome);
        read.close();
    }
}
