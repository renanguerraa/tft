package tft.lol;

import java.util.Scanner;
public class TFTLOL {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x, y, z;
        
        System.out.println("Deseja saber sobre: \n 1- Campeões"
                + " \n 2- Itens");
        x = teclado.nextInt();
        
        if(x == 1){
            
            do{

                System.out.println("----------");
                System.out.println("Deseja saber sobre: \n 1- Assassino "
                        + "\n 2- Mestre das Lâminas"
                        + "\n 3- Lutador"
                        + "\n 4- Elementalista"
                        + "\n 5- Guardião"
                        + "\n 6- Pistoleiro"
                        + "\n 7- Cavaleiro"
                        + "\n 8- Patrulheiro"
                        + "\n 9- Metamorfo"
                        + "\n 10- Feiticeiro");
                y = teclado.nextInt();

                if(y == 1){

                    System.out.println("----------");
                    System.out.println("Demônio: Evelynn(3)"
                            + "\n Imperial: Katarina(3)"
                            + "\n Ninja: Zed(2), Akali(4)"
                            + "\n Pirata: Pyke(2)"
                            + "\n Selvagem: Rengar(3)"
                            + "\n Vastinata: Kha'Zix(1)");
                }

                if(y == 2){

                    System.out.println("----------");
                    System.out.println("Demônio: Aatrox(3)"
                            + "\n Exilado: Yasuo(5)"
                            + "\n Imperial: Draven(4)"
                            + "\n Nobre: Fiora(1)"
                            + "\n Ninja: Shen(2)"
                            + "\n Pirata: Gangplank(3)"
                            + "\n Hextec: Camille(1)");
                }

                if(y == 3){
                    
                    System.out.println("----------");
                    System.out.println("Glacial: Volibear(3)"
                            + "\n Robô: Blitzcrank(2)"
                            + "\n Selvagem: Warwick(1)"
                            + "\n Vastinata: Rek'Sai(2), Cho'Gath(4)"
                            + "\n Hextec: Vi(3)");
                }

                if(y == 4){
                    
                    System.out.println("----------");
                    System.out.println("Demônio: Brand(4)"
                            + "\n Glacial: Lissandra(2), Anivia(5)"
                            + "\n Ninja: Kennen(3)"
                            + "\n Yordle: Kennen(3)");
                }

                if(y == 5){
                   System.out.println("----------");
                   System.out.println("Glacial: Braum(2)"
                           + "\n Nobre: Leona(4)");
                }

                if(y == 6){
                    System.out.println("----------");
                    System.out.println("Nobre: Lucian(2)"
                            + "\n Pirata: Graves(1), Gangplank(3), Miss Fortune(5)"
                            + "\n Yordle: Tristana(1)"
                            + "\n Hextec: Jinx(4)");
                }

                if(y == 7){
                    System.out.println("----------");
                    System.out.println("Glacial: Sejuani(4)"
                            + "\n Imperial: Darius(1)"
                            + "\n Nobre: Garen(1), Kayle(5)"
                            + "\n Fantasma: Morderkaiser(1)"
                            + "\n Yordle: Poppy(3)");
                }

                if(y == 8){
                    System.out.println("----------");
                    System.out.println("Demônio: Varus(2)"
                            + "\n Glacial: Ashe(3)"
                            + "\n Nobre: Vayne(1)"
                            + "\n Fantasma: Kindred(4)");
                }

                if(y == 9){
                    System.out.println("----------");
                    System.out.println("Demônio: Elise(1), Swain(5)"
                            + "\n Imperial: Swain(5)"
                            + "\n Dragão: Shyvana(3)"
                            + "\n Selvagem: Nidalee(1), Gnar(4)"
                            + "\n Yordle: Gnar(4)"
                            + "\n Hextec: Jayce(2)");
                }

                if(y == 10){
                    System.out.println("----------");
                    System.out.println("Demônio: Morgana(3)"
                            + "\n Dragão: Aurelion(4)"
                            + "\n Fantasma: Karthus(5)"
                            + "\n Selvagem: Ahri(2)"
                            + "\n Vastinata: Kassadin(1)"
                            + "\n Yordle: Lulu(2), Veigar(3)");
                }
                
                System.out.println("----------"
                        + "\n Deseja saber algo mais? \n 1- Sim"
                        + "\n 2- Nao");
                z = teclado.nextInt();
            }
            while(z == 1);
        }
        
        if(x == 2){
            System.out.println("jaja eu faço haha sou o renan no github");
        }
    }
}
