/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2codeex01;

/**
 *
 * @author Eduardo Schmidt
 */
public class Produto {
    
    //Declaração de propriedade.
    private String nome;
    private double altura;
    private double largura;
    private double comprimento;

    //Declaração de construtor.
    public Produto(String nome, double altura, double largura, double comprimento){
        
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        
    }
    
    //Métodos Get e Set para poder modificar as variáveis.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

     public String calcularCaixaApropriada(){
        
        if(altura <= 30 && largura <= 40 && comprimento <= 80){
            return ("Utilizar a Caixa 1");
        }
        else if(altura <= 80 && largura <= 50 && comprimento <= 40){
            return ("Utilizar a Caixa 2");
        }
        else if (altura <= 50 && largura <= 80 & comprimento <= 60){
            return ("Utilizar a Caixa 3");
        }
        else{
            return ("Não tem caixa disponivel!");
        } 
        
    }
     
     public void imprimirResultado(){
         
     }
    
}
