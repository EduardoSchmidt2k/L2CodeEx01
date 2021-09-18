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
public class Caixa {
    
    // Declaração de propriedades. 
    private double altura;
    private double largura;
    private double comprimento;

    // Método Get e Set para caso precise alterar o valores.
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
    
    
    // Declaração de construtor.
    Caixa(double altura, double largura, double comprimento){
        
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        
    }
    
}
