/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Medicamento {
    private int id;
    private String nome;
    private String componenteAtivo;
    private String dataCadastro;
    
    public Medicamento() {}
    
    public Medicamento(int id, String nome, String componenteAtivo, String dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.componenteAtivo = componenteAtivo;
        this.dataCadastro = dataCadastro;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getComponenteAtivo() {
        return componenteAtivo;
    }
    
    public void setComponenteAtivo(String componenteAtivo) {
        this.componenteAtivo = componenteAtivo;
    }
    
    public String getDataCadastro() {
        return dataCadastro;
    }
    
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
