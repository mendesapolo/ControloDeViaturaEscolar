/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author António Apolo
 * @param <Tipo>
 */
public interface IDAO<Tipo> {
    
    public boolean cadastrar(Tipo obj);
    public List<Tipo> findAll();
    public Tipo getById(int id);
    public boolean updade(Tipo obj);
    
}
