/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import classe.ControloViatura;
import dao.ControloViaturaDao;
import java.text.SimpleDateFormat;

/**
 *
 * @author António Apolo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(ControloViatura cv : ControloViaturaDao.findAll()){
            System.out.println("Data: "+(new SimpleDateFormat("dd/M/yyyy").format(cv.getEntrada())));
        }
    }
    
}
