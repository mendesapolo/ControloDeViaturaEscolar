/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.sql.Date;


/**
 *
 * @author António Apolo
 */
public class Manutencao {
    
    private int id;
    private String descricao;
    private Viatura viatura;
    private Date data;

    public Manutencao(String descricao, Viatura viatura, Date data) {
        this.descricao = descricao;
        this.viatura = viatura;
        this.data = data;
    }

    public Manutencao(int id, String descricao, Viatura viatura, Date data) {
        this.id = id;
        this.descricao = descricao;
        this.viatura = viatura;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
