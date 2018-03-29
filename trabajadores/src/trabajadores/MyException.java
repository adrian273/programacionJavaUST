/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

/**
 *
 * @author kdr
 */
class MyException extends Exception {
    
    private String msg;
    
    MyException(String msg){
        super(msg);
    }
    
}
