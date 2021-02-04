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
public class Usuario {
    
    private int id;
        private String userName;
    private String senha;

    public Usuario(String userName, String senha) {
        this.userName = userName;
        this.senha = senha;
    }

    public Usuario() {
    }

    public Usuario(int id, String userName, String senha) {
        this.id = id;
        this.userName = userName;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
