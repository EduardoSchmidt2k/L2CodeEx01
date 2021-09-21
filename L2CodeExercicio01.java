import java.util.Scanner;

public class L2CodeExercicio01 {
    public static void main(String[] args) {
        
        //CRIAÇÃO DE VÁRIAVEIS
        Scanner entrada = new Scanner(System.in);
        int auxiliarCaixa = 0;
        int auxiliarProduto = 0;
        double auxiliarCrescente = 0;
        String auxiliarNomes ="";
        double auxiliarCrescenteCaixas = 0;

        System.out.println("Escreva quantas caixas tens: ");

        //CRIAÇÃO DE VÁRIAVEIS
        auxiliarCaixa = entrada.nextInt();
        double[][] caixas = new double[auxiliarCaixa][3];
        double[] caixaSoma = new double[caixas.length];
        String[] caixasNomes = new String[caixas.length];


        //ENTRADA DE MEDIDAS DAS CAIXAS
        for(int i = 0; i <caixas.length; i++){
            System.out.println("\nEscreva as medidas da "+i+"° caixa (altura, largura, comprimento) :");
            for (int j = 0; j < 3; j++) {
                caixas[i][j] = entrada.nextDouble();
            }
        }
        

        //CRIAÇÃO DE VÁRIAVEIS
        System.out.println("\nEscreva quantos produtos queres encaixotar: ");
        auxiliarProduto = entrada.nextInt();
        double[][] produtos = new double[auxiliarProduto][3];
        String[] nomeProdutos = new String[auxiliarProduto];
        String [] resultado = new String[auxiliarProduto];


        //ENTRADA PARA NOME DO PRODUTO E MEDIDAS DO MESMO
        for (int i = 0; i < auxiliarProduto; i++) {
            entrada.nextLine();
            System.out.println("\nEscreva o nome do Produto: ");
            nomeProdutos[i] = entrada.nextLine();
            System.out.println("\nEscreva as medidas do "+nomeProdutos[i]+"(altura, largura, comprimento) :");
            for (int j = 0; j <produtos[i].length; j++) {
                produtos[i][j] = entrada.nextDouble();
            }
        }


        //FAZER A SOMA DAS MEDIDAS PARA ENTÃO DESCOBRIR O TAMANHO TOTAL DAS CAIXAS
        for (int i = 0; i < caixas.length; i++) {
            for (int j = 0; j < 3; j++) {
                caixaSoma[i] += caixas[i][j];
            }
        }


        //Arrumando o Vetor para os nomes das caixas para ficar mais bonito ao mostrar ao usuário.
        for (int i = 0; i < caixas.length; i++) {
            caixasNomes[i] = "caixa de ("+caixas[i][0]+" x "+caixas[i][1]+" x "+caixas[i][2]+")";
        }
        
        //Organizando o vetor em forma crescente.
        for (int i = 0; i < caixas.length; i++) {
            for (int j = 0; j < caixas.length; j++) {
                if(caixaSoma[i] < caixaSoma[j]){

                    //Auxiliar apenas para passar as caixas e o nome das caixas de forma crescente.
                    auxiliarCrescente = caixaSoma[i];
                    caixaSoma[i] = caixaSoma[j];
                    caixaSoma[j] = auxiliarCrescente;

                    //Colocando o nome das caixas em ordem crescente para ficar em par com as caixas em si.
                    auxiliarNomes = caixasNomes[i];
                    caixasNomes[i] = caixasNomes[j];
                    caixasNomes[j] = auxiliarNomes;

                    //Colocando as caixas em ordem crescente.
                    auxiliarCrescenteCaixas = caixas[i][0];
                    caixas[i][0] = caixas[j][0];
                    caixas[j][0] = auxiliarCrescenteCaixas;

                    auxiliarCrescenteCaixas = caixas[i][1];
                    caixas[i][1] = caixas[j][1];
                    caixas[j][1] = auxiliarCrescenteCaixas;

                    auxiliarCrescenteCaixas = caixas[i][2];
                    caixas[i][2] = caixas[j][2];
                    caixas[j][2] = auxiliarCrescenteCaixas;

                }
            }
        }

        //Apenas para pular uma linha e deixar o resultado mais organizado!
        System.out.println("");
        
        //Loop para conferir se os produtos cabem nas caixas e se cabe escolher a menor delas.
        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < caixas.length; j++) {
                if(produtos[i][0] <= caixas[j][0] && produtos[i][1] <= caixas[j][1] && produtos[i][2] <= caixas[j][2] ){
                    resultado[i] = "A melhor caixa para o produto "+nomeProdutos[i]+" é a "+caixasNomes[j];
                    /*Este break serve para assim que entrar em uma caixa que caiba 
                    e parar na menor pois as caixas estao em ordem crescente*/    
                    break; 
                }
                else{
                    resultado[i] = "O produto "+nomeProdutos[i]+" não cabe em nenhuma caixa!";
                }
            }

            // Anuncio de resultado
            System.out.println(resultado[i]);

        }

        entrada.close();
    }
    
}

