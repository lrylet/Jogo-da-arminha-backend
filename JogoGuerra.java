
import java.util.Scanner;

public class JogoGuerra {
    public static void main(String[] args) {
        int player, computer;
        Municao jogador = new Municao();
        Municao computador = new Municao();

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Joguinho da Guerra");
        System.out.println("");


        player = 0;
        computer = 0;
        computador.setBullet(0);

        System.out.println("Munição disponível: " + jogador.getBullet());
        

        while (!(player == 3 && computer == 3) || !(player == 3 && computer == 1) || !(player == 1 && computer == 3)) {
            System.out.println("Selecione uma das opções disponíveis: ");
            if (jogador.getBullet() <= 0) {
                System.out.println("1 - Recarregar arma");
                System.out.println("2 - Escudo");
            } else {
                System.out.println("1 - Recarregar arma");
                System.out.println("2 - Escudo");  
                System.out.println("3 - Atirar");  
            }
                player = keyboard.nextInt();

                System.out.println("");
                if (player == 3 && jogador.getBullet() == 0){
                    System.out.println("Você escolheu recarregar estado sem munição, escolha APENAS 1 ou 2.");
                    player = keyboard.nextInt();
                } else {
                    switch(player) {
                    case 1:
                        System.out.println("O jogador escolheu recarregar sua arma");
                        jogador.setBullet(jogador.getBullet() + 1);
                        System.out.println("Munição disponível: " + jogador.getBullet());
                    break;
        
                    case 2:
                    System.out.println("O jogador utilizou o escudo!");
                    break;
        
                    case 3:
                        System.out.println("O jogador escolheu atirar!");
                        jogador.setBullet(jogador.getBullet() - 1);
                        System.out.println("Munição disponível: " + jogador.getBullet());
                    }
        
                }
                if (computador.getBullet() == 0){
                    computer = (int)(Math.random()* 2 + 1);
                } else {
                    computer = (int)(Math.random()* 3 + 1);
                }
                System.out.println("");
                switch(computer) {
                    case 1:
                    System.out.println("O computador escolheu recarregar sua arma");
                    computador.setBullet(computador.getBullet() + 1);
                    System.out.println("Munição disponível: " + computador.getBullet());
                    System.out.println("");
                    break;

                    case 2:
                    System.out.println("O computador utilizou o escudo!");
                    System.out.println("");
                    break; 
                    
                    case 3:
                    System.out.println("O computador escolheu atirar!");
                    computador.setBullet(computador.getBullet() - 1);
                    System.out.println("Munição disponível: " + computador.getBullet());
                    System.out.println("");
                    
                    break;


                }

                
                if(player == 3 && computer == 3){
                System.out.println("");
                System.out.println("Ocorreu um empate!");
                System.out.println("Eu mato, mas eu levo.");
                System.out.println("Fim de jogo...");
                break;
            
            } else {
                if (player == 3 && computer == 1){
                    System.out.println("Você matou o oponente! Parabéns pela vitória!");
                    System.out.println("Fim de jogo...");
                    break;

                } else {
                    if (player == 3 && computer == 2) {
                        System.out.println("Você atingiu o escudo do oponente, recarregue e tente mais uma vez!");
                        System.out.println("");
                    } else {

                        if (player == 2 && computer == 2 ){
                            System.out.println("Vocês se defenderam, mais um round!");
                            System.out.println("");
                        } else {

                            if (player == 2 && computer == 3 || player == 2 && computer == 1) {
                                System.out.println("Você se defendeu!");
                                System.out.println("");
                            } else {

                                if (player == 1 && computer == 2 || player == 1 && computer == 1) {
                                    System.out.println("Você recarregou, agora tem mais uma munição!");
                                    System.out.println("");
                                } else {
                                    System.out.println("Você foi morto, aceite essa derrota e mais sorte na próxima!");
                                    System.out.println("Fim de jogo...");
                                    break;
                                }
                            }
                        }
                    }
                }        
            
            }
        }
            keyboard.close();
    
    }
}