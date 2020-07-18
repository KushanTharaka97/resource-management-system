/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_projectse;

/**
 *
 * @author asus
 */
class Chemical {
    private String cName,cQuentity,cExp,cSupplier;
    
    //default constructor
    public  Chemical(String cName,String cQuentity,String cExp,String cSupplier){
        this.cName=cName;
        this.cQuentity=cQuentity;
        this.cExp=cExp;
        this.cSupplier=cSupplier;
  
    }

    //SETTING GETTERS AND SETTERS TO ALL THE VARIABLES
    public String getcName() {
        return cName;
    }

    public String getcQuentity() {
        return cQuentity;
    }

    public String getcExp() {
        return cExp;
    }

    public String getcSupplier() {
        return cSupplier;
    }
}
