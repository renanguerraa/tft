import java.util.Scanner;
public class TFTLOL {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x, y, z;
        
        do{ 
            
            System.out.println("----------");
            System.out.println("Deseja saber sobre: \n 1- Campeoes"
                    + " \n 2- Itens");
            x = teclado.nextInt();

            if(x == 1){

                    System.out.println("----------");
                    System.out.println("Deseja saber sobre: \n 1- Assassino "
                            + "\n 2- Mestre das Laminas"
                            + "\n 3- Lutador"
                            + "\n 4- Elementalista"
                            + "\n 5- Guardiao"
                            + "\n 6- Pistoleiro"
                            + "\n 7- Cavaleiro"
                            + "\n 8- Patrulheiro"
                            + "\n 9- Metamorfo"
                            + "\n 10- Feiticeiro");
                    y = teclado.nextInt();

                    if(y == 1){

                        System.out.println("----------");
                        System.out.println(" Demonio: Evelynn(3)"
                                + "\n Imperial: Katarina(3)"
                                + "\n Ninja: Zed(2), Akali(4)"
                                + "\n Pirata: Pyke(2)"
                                + "\n Selvagem: Rengar(3)"
                                + "\n Vastinata: Kha'Zix(1)");
                    }

                    if(y == 2){

                        System.out.println("----------");
                        System.out.println(" Demonio: Aatrox(3)"
                                + "\n Exilado: Yasuo(5)"
                                + "\n Imperial: Draven(4)"
                                + "\n Nobre: Fiora(1)"
                                + "\n Ninja: Shen(2)"
                                + "\n Pirata: Gangplank(3)"
                                + "\n Hextec: Camille(1)");
                    }

                    if(y == 3){

                        System.out.println("----------");
                        System.out.println(" Glacial: Volibear(3)"
                                + "\n Robo: Blitzcrank(2)"
                                + "\n Selvagem: Warwick(1)"
                                + "\n Vastinata: Rek'Sai(2), Cho'Gath(4)"
                                + "\n Hextec: Vi(3)");
                    }

                    if(y == 4){

                        System.out.println("----------");
                        System.out.println(" Demonio: Brand(4)"
                                + "\n Glacial: Lissandra(2), Anivia(5)"
                                + "\n Ninja: Kennen(3)"
                                + "\n Yordle: Kennen(3)");
                    }

                    if(y == 5){
                       System.out.println("----------");
                       System.out.println(" Glacial: Braum(2)"
                               + "\n Nobre: Leona(4)");
                    }

                    if(y == 6){
                        System.out.println("----------");
                        System.out.println(" Nobre: Lucian(2)"
                                + "\n Pirata: Graves(1), Gangplank(3), Miss Fortune(5)"
                                + "\n Yordle: Tristana(1)"
                                + "\n Hextec: Jinx(4)");
                    }

                    if(y == 7){
                        System.out.println("----------");
                        System.out.println(" Glacial: Sejuani(4)"
                                + "\n Imperial: Darius(1)"
                                + "\n Nobre: Garen(1), Kayle(5)"
                                + "\n Fantasma: Morderkaiser(1)"
                                + "\n Yordle: Poppy(3)");
                    }

                    if(y == 8){
                        System.out.println("----------");
                        System.out.println(" Demonio: Varus(2)"
                                + "\n Glacial: Ashe(3)"
                                + "\n Nobre: Vayne(1)"
                                + "\n Fantasma: Kindred(4)");
                    }

                    if(y == 9){
                        System.out.println("----------");
                        System.out.println(" Demonio: Elise(1), Swain(5)"
                                + "\n Imperial: Swain(5)"
                                + "\n Dragao: Shyvana(3)"
                                + "\n Selvagem: Nidalee(1), Gnar(4)"
                                + "\n Yordle: Gnar(4)"
                                + "\n Hextec: Jayce(2)");
                    }

                    if(y == 10){
                        System.out.println("----------");
                        System.out.println(" Demonio: Morgana(3)"
                                + "\n Dragao: Aurelion(4)"
                                + "\n Fantasma: Karthus(5)"
                                + "\n Selvagem: Ahri(2)"
                                + "\n Vastinata: Kassadin(1)"
                                + "\n Yordle: Lulu(2), Veigar(3)");
                    }
                }

            if(x == 2){
                
                System.out.println("----------");
                System.out.println("Deseja saber sobre: \n 1- Espada G. p. C.(+AD)"
                        + "\n 2- Arco Recurvo (+AS)"
                        + "\n 3- Bastao Desnecessariamente Grande (+Dano em Habilidades)"
                        + "\n 4- Lagrima da Deusa (+Mana)"
                        + "\n 5- Cota de Malha (+Armor)"
                        + "\n 6- Cinto do Gigante (+HP)"
                        + "\n 7- Capa Negatron (+MR)"
                        + "\n 8- Espatula (Faz Coisas)");
                y = teclado.nextInt();
                
                if(y == 1){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Gume do Infinito (Mais dano em criticos)"
                            + "\n + Arco Recurvo = Lamina do Divino (Ganha chance de crit. por segundo)"
                            + "\n + Bastao Desnecessariamente Grande = Pistola Laminar Hextec (Cura em todo dano causado)"
                            + "\n + Lagrima da Deusa = Lança de Shojin (Ganha % da mana max por atq apos cast)"
                            + "\n + Cota de Malha = Anjo Guardiao (Revive com HP fixa)"
                            + "\n + Cinto do Gigante = Arauto de Zeke (Aliados prox. ganham AS)"
                            + "\n + Capa Negatron = Sedenta por Sangue (AA curam em % do dano)"
                            + "\n + Espatula = Lamina Fantasma de Youmuu (Un. tambem e um assassino)");
                }
                
                if(y == 2){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Lamina do Divino ()"
                            + "\n + Arco Recurvo = Canhao Fumegante ()"
                            + "\n + Bastao Desnecessariamente Grande = Lamina da Furia de Guinsoo ()"
                            + "\n + Lagrima da Deusa = Faca de Statikk ()"
                            + "\n + Cota de Malha = Dançarina Fantasma ()"
                            + "\n + Cinto do Gigante = Hidra Titânica ()"
                            + "\n + Capa Negatron = Lamina Amaldiçoada ()"
                            + "\n + Espatula = Espada do Rei Destruido ()");
                }
                
                if(y == 3){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Pistola Laminar Hextec ()"
                            + "\n + Arco Recurvo = Lamina da Furia de Guinsoo ()"
                            + "\n + Bastao Desnecessariamente Grande = Capuz da Morte de Rabadon ()"
                            + "\n + Lagrima da Deusa = Eco de Luden ()"
                            + "\n + Cota de Malha = Medalhao dos Solari de Ferro ()"
                            + "\n + Cinto do Gigante = Morellonomicon ()"
                            + "\n + Capa Negatron = Centelha Ionica ()"
                            + "\n + Espatula = Yuumi ()");
                }
                
                if(y == 4){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Lança de Shojin ()"
                            + "\n + Arco Recurvo = Faca de Statikk ()"
                            + "\n + Bastao Desnecessariamente Grande = Eco de Luden ()"
                            + "\n + Lagrima da Deusa = Abraço de Seraph ()"
                            + "\n + Cota de Malha = Coraçao Congelado ()"
                            + "\n + Cinto do Gigante = Redençao ()"
                            + "\n + Capa Negatron = Quietude"
                            + "\n + Espatula = Darkin");
                }
                
                if(y == 5){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Anjo Guardiao ()"
                            + "\n + Arco Recurvo = Dançarina Fantasma ()"
                            + "\n + Bastao Desnecessariamente Grande = Medalhao dos Solari de Ferro ()"
                            + "\n + Lagrima da Deusa = Coraçao Congelado ()"
                            + "\n + Cota de Malha = Armadura de Espinhos ()"
                            + "\n + Cinto do Gigante = Buff Vermelho ()"
                            + "\n + Capa Negatron = Quebra-lamina ()"
                            + "\n + Espatula = Juramento do Cavaleiro ()");
                }
                
                if(y == 6){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Heraldo de Zeke ()"
                            + "\n + Arco Recurvo = Hidra Titanica ()"
                            + "\n + Bastao Desnecessariamente Grande = Morellonomicon ()"
                            + "\n + Lagrima da Deusa = Redençao ()"
                            + "\n + Cota de Malha = Buff Vermelho ()"
                            + "\n + Cinto do Gigante = Armadura de Warmog ()"
                            + "\n + Capa Negatron = Zefiro ()"
                            + "\n + Espatula = Malho Congelado ()");
                }
                
                if(y == 7){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Sedenta por Sangue ()"
                            + "\n + Arco Recurvo = Lamina Amaldiçoada ()"
                            + "\n + Bastao Desnecessariamente Grande = Centelha Ionica ()"
                            + "\n + Lagrima da Deusa = Quietude ()"
                            + "\n + Cota de Malha = Quebra-lamina ()"
                            + "\n + Cinto do Gigante = Zefiro ()"
                            + "\n + Capa Negatron = Garra de Dragao ()"
                            + "\n + Espatula = Furacao de Runaan ()");
                }
                
                if(y == 8){
                    
                    System.out.println("----------");
                    System.out.println(" + Espada G. p. C. = Lamina Fantasma de Youmuu ()"
                            + "\n + Arco Recurvo = Espada do Rei Destruído ()"
                            + "\n + Bastao Desnecessariamente Grande = Yuumi ()"
                            + "\n + Lagrima da Deusa = Darkin ()"
                            + "\n + Cota de Malha = Juramento do Cavaleiro ()"
                            + "\n + Cinto do Gigante = Malho Congelado ()"
                            + "\n + Capa Negatron = Furacao de Runaan ()"
                            + "\n + Espatula = Força da Natureza ()");
                }
            }
            
            System.out.println("----------");
            System.out.println("Deseja saber mais alguma coisa? \n 1- Sim"
                        + "\n 2- Nao");
            z = teclado.nextInt(); 
        }
        while(z == 1);
    }
}
