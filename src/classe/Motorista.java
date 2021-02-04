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
public class Motorista {
    
    private int id;
    private Pessoa pessoa;
    private Viatura viatura;

    public Motorista(Pessoa pessoa, Viatura viatura) {
        this.pessoa = pessoa;
        this.viatura = viatura;
    }

    public Motorista(int id, Pessoa pessoa, Viatura viatura) {
        this.id = id;
        this.pessoa = pessoa;
        this.viatura = viatura;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }
    
}
