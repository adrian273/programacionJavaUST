/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionregistroenum;

/**
 *
 * @author kdr
 */
public class ExceptValidation extends Exception {
    
    private int carga;

    public ExceptValidation(int carga) {
        this.carga = carga;
    }

    public ExceptValidation(int carga, String message) {
        super(message);
        this.carga = carga;
    }
    
    
}
