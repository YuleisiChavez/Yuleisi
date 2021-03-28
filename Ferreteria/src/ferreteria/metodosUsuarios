/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ferreteria.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class metodosUsuario {
    


 // private final pool conexion;
    
  public metodosUsuario(){
    conexion=new conectar();


  }


    public ArrayList<Usuario> login(String user, String clave){
     
           Connection conectar=null;
           PreparedStatement pst;
           ResultSet rs ;
           Usuario cuenta ;
           ArrayList list = new ArrayList();
       
          try{
               // obtenemos la conexion con la base de datos
               conectar = conexion.dataSource.getConnection(); 
           
               if(conectar != null){

                   String sql ="SELECT Usuario, Password FROM Usuarios WHERE User =? AND Pass=AES_ENCRYPT(?, 'key')";
                   pst = conectar.prepareStatement(sql);
                   pst.setString(1, user);
                   pst.setString(2, clave);
                   rs = pst.executeQuery();
               
                   if(rs.next()){
                   
                        cuenta = new Usuario();
                        cuenta.setUser(rs.getString("User"));
                        cuenta.setPass(rs.getString("Pass"));                                       
                        list.add(cuenta);
                  }
           
             }else{
             
                 JOptionPane.showMessageDialog(null, "Hubo un error al realizar la operación, intente mas tarde","ERROR",JOptionPane.ERROR_MESSAGE);
             }
       
         }catch(SQLException e){
     
             JOptionPane.showMessageDialog(null, e , " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
       
        }finally{
            try{
              conectar.close();
            }catch(SQLException ex){
               System.out.println("error "+ex);
            }
         }
 
    return list;
    }

   

} 