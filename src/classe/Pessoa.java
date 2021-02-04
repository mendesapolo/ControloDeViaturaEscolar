/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author António Apolo
 */
public class Pessoa {
    private int id;
    private String nome;
    private String bi;
    private String telefone;
    private String tipo;

    public Pessoa(String nome, String bi, String telefone, String tipo) {
        this.nome = nome;
        this.bi = bi;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public Pessoa(int id, String nome, String bi, String telefone, String tipo) {
        this.id = id;
        this.nome = nome;
        this.bi = bi;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    
}
