import java.util.Scanner;

    public class tempodejogo {

        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);

            int Hinicial = teclado.nextInt();
            int Hfinal = teclado.nextInt();

                if (Hinicial <= 24 && Hfinal <= 24) {
                    if(Hinicial < Hfinal) {
                        int Tempojogo = Hfinal - Hinicial;
                        System.out.println("O JOGO DUROU "+ Tempojogo +" HORA(S)");
                    }else {
                        int Tempojogo1 = (Hfinal - Hinicial) + 24;
                        System.out.println("O JOGO DUROU "+ Tempojogo1 +" HORA(S)");
                    }
                } else {
                    System.out.println("Horário Inválido");
                }
        }
    }