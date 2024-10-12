import java.util.Scanner;

public class Patente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pontos = 0;
        int partidas = 10;
        int partidasfeitas = 0;
        String letra;
        while (partidasfeitas < partidas) {
            System.out.println("Digite para sua partida v para vitoria, d para derrota, e para empate: ");
            letra = scan.nextLine();
            //System.out.println(letra);
            if (letra.equals("v")) {
                //System.out.println(letra);
                pontos += 10;
            } else if (letra.equals("d")) {
                pontos -= 2;
            } else if (letra.equals("e")) {
                pontos += 5;
            }
            else  {
                System.out.println("Responda novamente");
                partidasfeitas--;
            }
            partidasfeitas++;
        }
        if(pontos >=60){
            System.out.println("Você Subiu de Patente");
        } else if (pontos >= 21 && pontos <= 59) {
            System.out.println("Você Permaneceu na Patente");
        } else if (pontos < 21) {
            System.out.println("Você caiu de patente");
        }
        System.out.println(pontos);
    }
}