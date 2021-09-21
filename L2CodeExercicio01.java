import java.util.Scanner;

public class L2CodeExercicio01 {
    public static void main(String[] args) {
        
        //CRIAÇÃO DE VÁRIAVEIS
        Scanner entrada = new Scanner(System.in);
        int auxiliarCaixa = 0;
        int auxiliarProduto = 0;
        int menorCaixa = 0;
        int caixaIdeal = 0;
        double auxiliarCrescente = 0;
        String auxiliarNomes ="";
        double auxiliarDoAux = 0;

        System.out.println("Escreva quantas caixas tens: ");

        //CRIAÇÃO DE VÁRIAVEIS
        auxiliarCaixa = entrada.nextInt();
        double[][] caixas = new double[auxiliarCaixa][3];
        double[] caixaSoma = new double[caixas.length];
        double[][] caixasCrescente = new double[caixas.length][3];
        double[] caixaSomaAuxiliar = new double[caixas.length];
        String[] caixasNomes = new String[caixas.length];
        //String[][] caixasCrescente = new double[caixas.length];


        //ENTRADA DE MEDIDAS DAS CAIXAS
        for(int i = 0; i <caixas.length; i++){
            System.out.println("Escreva as medidas da "+i+"° caixa (altura, largura, comprimento) :");
            for (int j = 0; j < 3; j++) {
                caixas[i][j] = entrada.nextDouble();
            }
        }
        

        //CRIAÇÃO DE VÁRIAVEIS
        System.out.println("Escreva quantos produtos queres encaixotar: ");
        auxiliarProduto = entrada.nextInt();
        double[][] produtos = new double[auxiliarProduto][3];
        String[] nomeProdutos = new String[auxiliarProduto];
        String [] resultado = new String[auxiliarProduto];


        //ENTRADA PARA NOME DO PRODUTO E MEDIDAS DO MESMO
        for (int i = 0; i < auxiliarProduto; i++) {
            entrada.nextLine();
            System.out.println("Escreva o nome do Produto: ");
            nomeProdutos[i] = entrada.nextLine();
            System.out.println("Escreva as medidas do "+nomeProdutos[i]+"(altura, largura, comprimento) :");
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


        //
        for (int i = 0; i < caixas.length; i++) {
            caixaSomaAuxiliar[i] = caixaSoma[i];
        }

        for (int i = 0; i < caixas.length; i++) {
            caixasNomes[i] = "Caixa de ("+caixas[i][0]+" x "+caixas[i][1]+" x "+caixas[i][2]+")";
        }
        
        //ORGANIZANDO O VETOR EM ORDEM CRESCENTE.
        for (int i = 0; i < caixas.length; i++) {
            for (int j = 0; j < caixas.length; j++) {
                if(caixaSoma[i] < caixaSoma[j]){
                    auxiliarCrescente = caixaSoma[i];
                    caixaSoma[i] = caixaSoma[j];
                    caixaSoma[j] = auxiliarCrescente;

                    auxiliarNomes = caixasNomes[i];
                    caixasNomes[i] = caixasNomes[j];
                    caixasNomes[j] = auxiliarNomes;

                    auxiliarDoAux = caixas[i][0];
                    caixas[i][0] = caixas[j][0];
                    caixas[j][0] = auxiliarDoAux;

                    auxiliarDoAux = caixas[i][1];
                    caixas[i][1] = caixas[j][1];
                    caixas[j][1] = auxiliarDoAux;

                    auxiliarDoAux = caixas[i][2];
                    caixas[i][2] = caixas[j][2];
                    caixas[j][2] = auxiliarDoAux;


                }
            }
        }

        for (int i = 0; i < produtos.length; i++) {
            for (int j = 0; j < caixas.length; j++) {
                if(produtos[i][0] <= caixas[j][0] && produtos[i][1] <= caixas[j][1] && produtos[i][2] <= caixas[j][2] ){
                    resultado[i] = "A MELHOR CAIXA PARA O PRODUTO "+nomeProdutos[i]+" É A "+caixasNomes[j];
                    break;
                }
                else{
                    resultado[i] = "O PRODUTO "+nomeProdutos[i]+" NÃO CABE EM NENHUMA CAIXA!";
                }
            }
            System.out.println(resultado[i]);

        }

    }
    
}

