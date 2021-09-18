package l2codeex01;

/**
Dados de entrada do algoritmo sao os seguintes (altura x largura x comprimento):
40 10 25
40 30 30
15 20 10
10 30 10
30 15 10

Utilizando os dados de entrada acima, faca um algoritmo para resolver cada
uma das situacoes abaixo:

1. Calcular as dimensoes da menor caixa possivel para enviar os itens da compra.
2. Seu Manoel tem alguns formatos de caixa ja fabricadas, faca um algoritmo que
verifique a caixa ideal dentre as opcoes de tamanhos que ele possui:
Caixa 1: 30 40 80
Caixa 2: 80 50 40
Caixa 3: 50 80 60

O algoritmo deve ser capaz de resolver com outros conjuntos de dados de
entrada, com diferentes quantidades de caixas, exemplo:
10 15 30
20 10 20
10 10 10
20 20 20
30 10 10

 * 
 */
public class L2CodeExercicios {
    
    public static void main(String[] args) {
        
        Produto ps5 = new Produto("PlayStation5", 40, 10, 25);
        Produto volante = new Produto("Volante", 40, 30, 30);
        Produto joystick = new Produto("Joystick", 15, 20, 10);
        Produto fifa = new Produto("Fifa 22", 10, 30, 10);
        Produto callOfDuty = new Produto("Call of Duty - Cold War -", 30, 15, 10);
        
        System.out.println(ps5.calcularCaixaApropriada());
        System.out.println(volante.calcularCaixaApropriada());
        System.out.println(joystick.calcularCaixaApropriada());
        System.out.println(fifa.calcularCaixaApropriada());
        System.out.println(callOfDuty.calcularCaixaApropriada());
        
        System.out.println();

    }
    
}
