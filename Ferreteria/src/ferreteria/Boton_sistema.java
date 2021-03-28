/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class Boton_sistema extends javax.swing.JFrame{
    DefaultTableModel model = new DefaultTableModel();
   JTable tablededatos = new JTable (model);


   
    
    
    public Boton_sistema(){
    initComponents();
    model.addColumn("Cedula");
    model.addColumn("Nombre");
    model.addColumn("Apellido");
    model.addColumn("Direccion");
    model.addColumn("Email");
    model.addColumn("Sexo");

    this.tablededatos.setModel(model);
    
    
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   
    
    
    
}
