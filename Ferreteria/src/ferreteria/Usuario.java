/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

/**
 *
 * 
 */
public class Usuario {
    
    private String User;     
  private String Pass;          

  public Usuario(){         
    User="";         
    Pass="";     
  }      

  public String getUser() {         
    return User;     
  }      

  public void setUser(String User) {
     this.User = User;     
  }      

  public String getPass() {         
     return Pass;     
  }      

  public void setPass(String Pass) {         
    this.Pass = Pass;     
  }                 

   
}