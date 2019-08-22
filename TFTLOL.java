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
                            + "Robô: Blitzcrank(2)"
                            + "Selvagem: Warwick(1)"
                            + "Vastinata: Rek'Sai(2), Cho'Gath(4)"
                            + "Hextec: Vi(3)");
                }

                if(y == 4){
                    
                    System.out.println("----------");
                    System.out.println("Demônio: Brand(4)"
                            + "Glacial: Lissandra(2), Anivia(5)"
                            + "Ninja: Kennen(3)"
                            + "Yordle: Kennen(3)");
                }

                if(y == 5){
                   System.out.println("----------");
                   System.out.println("Glacial: Braum(2)"
                           + "Nobre: Leona(4)");
                }

                if(y == 6){
                    System.out.println("----------");
                    System.out.println("Nobre: Lucian(2)"
                            + "Pirata: Graves(1), Gangplank(3), Miss Fortune(5)"
                            + "Yordle: Tristana(1)"
                            + "Hextec: Jinx(4)");
                }

                if(y == 7){
                    System.out.println("----------");
                    System.out.println("Glacial: Sejuani(4)"
                            + "Imperial: Darius(1)"
                            + "Nobre: Garen(1), Kayle(5)"
                            + "Fantasma: Morderkaiser(1)"
                            + "Yordle: Poppy(3)");
                }

                if(y == 8){
                    System.out.println("----------");
                    System.out.println("Demônio: Varus(2)"
                            + "Glacial: Ashe(3)"
                            + "Nobre: Vayne(1)"
                            + "Fantasma: Kindred(4)");
                }

                if(y == 9){
                    System.out.println("----------");
                    System.out.println("Demônio: Elise(1), Swain(5)"
                            + "Imperial: Swain(5)"
                            + "Dragão: Shyvana(3)"
                            + "Selvagem: Nidalee(1), Gnar(4)"
                            + "Yordle: Gnar(4)"
                            + "Hextec: Jayce(2)");
                }

                if(y == 10){
                    System.out.println("----------");
                    System.out.println("Demônio: Morgana(3)"
                            + "Dragão: Aurelion(4)"
                            + "Fantasma: Karthus(5)"
                            + "Selvagem: Ahri(2)"
                            + "Vastinata: Kassadin(1)"
                            + "Yordle: Lulu(2), Veigar(3)");
                }
                
                System.out.println("----------"
                        + "\n Deseja saber algo mais? \n 1- Sim"
                        + "\n 2- Nao");
                z = teclado.nextInt();
            }
            while(z == 1);
        }
        
        if(x == 2){
            System.out.println("jaja eu faço");
        }
    }
}
