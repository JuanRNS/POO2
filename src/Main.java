import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sim= 0;
        String resposta;

        System.out.println("Telefonou para a vitima?: ");
        resposta = scan.nextLine();
        if (resposta .equals("sim")){
            sim++;
        }

        System.out.println("Esteve no local do crime?: ");
        resposta = scan.nextLine();
        if (resposta .equals("sim")){
            sim++;
        }

        System.out.println("Mora perto da vitima?: ");
        resposta = scan.nextLine();
        if (resposta .equals("sim")){
            sim++;
        }

        System.out.println("Tinha dividas com a vitima: ");
        resposta = scan.nextLine();
        if (resposta .equals("sim")){
            sim++;
        }

        System.out.println("Já trabalhou com a vitima: ");
        resposta = scan.nextLine();
        if (resposta .equals("sim")){
            sim++;
        }

        if (sim == 2){
            System.out.println("Suspeita");
        } else if (sim >= 3 && sim <= 4) {
            System.out.println("Cumplice");
        } else if (sim == 5) {
            System.out.println("Assasisino");
        } else {
            System.out.println("Inocente");
        }
    }
}