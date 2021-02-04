/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Date;

/**
 *
 * @author António Apolo
 */
public class ControloViatura {
    
    private int id;
    private Date entrada;
    private Date saida;
    private Viatura viatura;

    public ControloViatura(int id, Date entrada, Date saida, Viatura viatura) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.viatura = viatura;
    }

    public ControloViatura(Date entrada, Date saida, Viatura viatura) {
        this.entrada = entrada;
        this.saida = saida;
        this.viatura = viatura;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }
    
}
