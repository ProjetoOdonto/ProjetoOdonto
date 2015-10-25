/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;



/**
 *
 * @author Andre
 */
public class Despecas {
    private int codFornecedor;
    private int codDespecas;
    private double valor;
    private String situacao;
    private  String dataLaçamento;
    private String dataEmissao;
    private String dataVencimento;
    
    public int getCodFornecedor(){
    return codFornecedor;
    }
    public void setCodFornecedor(int codFornecedor){
        
        this.codFornecedor =  codFornecedor;
    }
    public int getCodDespecas(){
    return codDespecas;
    }
    
    public void setCodDespecas(int codDespecas){
    this.codDespecas = codDespecas;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataLaçamento() {
        return dataLaçamento;
    }

    public void setDataLaçamento(String dataLaçamento) {
        this.dataLaçamento = dataLaçamento;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
    
}
