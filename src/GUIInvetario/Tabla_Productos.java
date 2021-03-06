/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIInvetario;

import Clases.Registrar_Producto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class Tabla_Productos extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    int con = 0;

    /**
     * Creates new form Tabla_Producto
     */
    public Tabla_Productos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        GuardarProducto();
        HistorialdeProducto();
        
    }
    
        public void GuardarProducto(){
    
        String data[][]={};
        String col[] = {"CODIGOEAN","NOMBRE CORTO","NOMBRE LARGO","DESCRPCION","PRECIO VENTA","PRECIO COMPRA","LARGO","ANCHO","ALTO","STOCK","CATEGORIA","FECHA VENCIMIENTO"};
        model = new DefaultTableModel(data, col);
        jTable_Tabla_Productos.setModel(model);
        
    }
    
    public void HistorialdeProducto(){
    
        Registrar_Producto p;
        for(int i=0; i<RegistrarProducto.contenedor.size(); i++){
        
            p = (Registrar_Producto) RegistrarProducto.contenedor.get(i);
            model.insertRow(con, new Object[]{});
            model.setValueAt(p.getCodigoEAN(), con, 0);
            model.setValueAt(p.getNombre_corto(), con, 1);
            model.setValueAt(p.getNombre_largo(), con, 2);
            model.setValueAt(p.getDescrpcion(), con, 3);
            model.setValueAt(p.getPrecio_venta(), con, 4);
            model.setValueAt(p.getPrecio_compra(), con, 5);
            model.setValueAt(p.getLargo(), con, 6);
            model.setValueAt(p.getAncho(), con, 7);
            model.setValueAt(p.getAlto(), con, 8);
            model.setValueAt(p.getStock(), con, 9);
            model.setValueAt(p.getCategoria(), con, 10);
            model.setValueAt(p.getFecha_de_vencimiento(), con, 11);
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Producto_Registrados_Tabla_Registrarproducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabla_Productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Producto_Registrados_Tabla_Registrarproducto.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_Producto_Registrados_Tabla_Registrarproducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Producto_Registrados_Tabla_Registrarproducto.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Producto_Registrados_Tabla_Registrarproducto.setText("Productos registrados");
        getContentPane().add(jLabel_Producto_Registrados_Tabla_Registrarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jTable_Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Tabla_Productos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1300, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Producto_Registrados_Tabla_Registrarproducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Tabla_Productos;
    // End of variables declaration//GEN-END:variables
}
