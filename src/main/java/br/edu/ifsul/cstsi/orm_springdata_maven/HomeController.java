package br.edu.ifsul.cstsi.orm_springdata_maven;


import br.edu.ifsul.cstsi.orm_springdata_maven.participante.ParticipanteController;

import java.util.Scanner;

public class HomeController {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.print("\n-------  Home -------");
            System.out.print(
                    """
    
                        1. Leilao
                        2. Manter lances
                        3. Manter Participante
                        4. Manter Itens do leilao
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> System.out.println("Em desenvolvimento"); //ItemController.main(null);
                case 2 -> System.out.println("Em desenvolvimento"); //ItemController.main(null);
                case 3 -> ParticipanteController.main(null);
                case 4 -> System.out.println("Em desenvolvimento"); //ItemController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while(opcao != 0) ;
        System.out.println("\n\n!!!!!!!! Fim da aplicação !!!!!!!!");
        input.close(); //libera o recurso
    }



}//fim classe
