package CaldoVerde;

import java.util.Scanner;

public class CaldoVerde {

    public static void main(String[] args) {

        // Ingredientes
        String ingrediente1 = "1 Maço de couve";
        String ingrediente2 = "4 batatas";
        String ingrediente3 = "1 linguiça calabresa";
        String ingrediente4 = "1 colher de sopa de óleo";
        String ingrediente5 = "1 cebola média";
        String ingrediente6 = "1 maço de salsinha";
        String ingrediente7 = "1 colher de chá de sal";
        String ingrediente8 = "5 xícaras de chá de água";

        // Utensílios
        String utensilios1 = "Panela de pressão";
        String utensilios2 = "Colher de sopa";
        String utensilios3 = "Colher de chá";
        String utensilios4 = "Liquidificador";
        String utensilios5 = "Colher de madeira";
        String utensilios6 = "Faca";
        String utensilios7 = "Tábua";
        String utensilios8 = "Tesoura";
        String utensilios9 = "Bowl";
        String utensilio10 = "Fogão";

        // Acompanhamentos
        String acompanhamento1 = "Queijo ralado";
        String acompanhamento2 = "Pão francês";

        // Passo a passo
        System.out.println("1. INÍCIO");
        System.out.println("Pegar a " + utensilios7 + " e a " + utensilios6 + " para cortar todos os ingredientes necessários (couve, calabresa, cebola, salsinha, batata).");
        System.out.println("2. Ligar o " + utensilio10 + ".");
        System.out.println("3. Pegar a " + utensilios1 + ", encher com " + ingrediente8 + " e colocar " + ingrediente2 + " cortadas para cozinhar por 10 minutos.");
        System.out.println("4. Desligar o " + utensilio10 + ".");
        System.out.println("5. Pegar o " + utensilios4 + " e acrescentar as batatas cozidas, " + ingrediente1 + ", " + ingrediente6 + " e " + ingrediente5 + ".");
        System.out.println("6. Ligar o " + utensilios4 + " e bater por 5 minutos.");
        System.out.println("7. Ligar o " + utensilio10 + ".");
        System.out.println("8. Em uma panela, esquentar " + ingrediente4 + " para fritar " + ingrediente3 + " por 5 minutos.");
        System.out.println("9. Juntar todos os ingredientes, acrescentar " + ingrediente7 + " e levar ao fogo médio por mais 10 minutos, misturando com a " + utensilios5 + ".");
        System.out.println("10. Desligar o " + utensilio10 + ".");
        System.out.println("11. Servir o caldo em um " + utensilios9 + " com os acompanhamentos desejados.");

        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Verificar se vai adicionar pão francês
        System.out.print("Deseja adicionar pão francês? (s/n): ");
        String respostaPao = scanner.nextLine();

        if (respostaPao.equalsIgnoreCase("s")) {
            System.out.println("12. Adicionando acompanhamento: " + acompanhamento2);
            System.out.println("Pegar a " + utensilios6 + ", a " + utensilios7 + " e o " + acompanhamento2 + ".");
            System.out.println("Cortar o " + acompanhamento2 + " em rodelas e reservar.");
        } else {
            System.out.println("12. Acompanhamento " + acompanhamento2 + " não será adicionado.");
        }

        // Verificar se vai adicionar queijo ralado
        System.out.print("Deseja adicionar queijo ralado? (s/n): ");
        String respostaQueijo = scanner.nextLine();

        if (respostaQueijo.equalsIgnoreCase("s")) {
            System.out.println("13. Adicionando acompanhamento: " + acompanhamento1);
            System.out.println("Pegar a " + utensilios8 + " e abrir o pacote de " + acompanhamento1 + ".");
            System.out.println("Acrescentar o " + acompanhamento1 + " ao " + utensilios9 + " (a gosto).");
        } else {
            System.out.println("13. Acompanhamento " + acompanhamento1 + " não será adicionado.");
        }

        // Finalização
        System.out.println("14. FIM - Caldo Verde pronto! Bom apetite!");

        scanner.close();
    }
}


