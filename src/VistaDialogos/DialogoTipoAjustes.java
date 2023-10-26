/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaDialogos;

import Model.ModeloTablaTipoAjuste;
import Model.TipoAjusteModelo;
import Vista.VistaAjustesES;
import Vista.Vistaprincipal;
import java.awt.event.KeyEvent;

/**
 *
 * @author AranaV
 */
public class DialogoTipoAjustes extends javax.swing.JDialog {

    public static int COLUMN_TIPO = 1;
    public VistaAjustesES ajustesES;

    /**
     * Creates new form DialogoTipoAjustes
     */
    public DialogoTipoAjustes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatosTipo("",
                 "",
                 "",
                 "",
                 "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrupoOpcion = new javax.swing.ButtonGroup();
        btngrupoBusqueda = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableTipoAjuste = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rjcodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptarTAjuste = new javax.swing.JButton();
        btnCancelarTipoAjustes = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Asistida");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Buscar :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableTipoAjuste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableTipoAjuste);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 120));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoOpcion.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btngrupoOpcion.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        btngrupoOpcion.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btngrupoOpcion.add(jRexacta);
        jRexacta.setText("4)exacta");
        jRexacta.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jRInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btngrupoBusqueda.add(rjcodigo);
        rjcodigo.setSelected(true);
        rjcodigo.setText("Codigo");
        rjcodigo.setToolTipText("Codigo");

        btngrupoBusqueda.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rjcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(rjcodigo)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarTAjuste.setText("Aceptar");
        btnAceptarTAjuste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarTAjusteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptarTAjuste, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarTipoAjustes.setText("Cancelar");
        btnCancelarTipoAjustes.setToolTipText("Cancelar");
        btnCancelarTipoAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTipoAjustesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarTipoAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel15.setText("Total de Registros Encontrados");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarTAjusteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarTAjusteActionPerformed
        // TODO add your handling code here:
        int roowSeleccionada = jtableTipoAjuste.getSelectedRow();
        if (roowSeleccionada != -1) {
            String codTipoA =jtableTipoAjuste.getValueAt(roowSeleccionada,0).toString();
            System.out.println("valor Cod Tipo" + codTipoA);
            ajustesES.jtableAjusteES.setValueAt(codTipoA.toString(), ajustesES.FILA_jtableAjusteES, COLUMN_TIPO);
            dispose();
        }
    }//GEN-LAST:event_btnAceptarTAjusteActionPerformed

    private void btnCancelarTipoAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTipoAjustesActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarTipoAjustesActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             
                    String Opcion = "0", sfieldName = "";
                    if (jRInicio.isSelected()) {
                        Opcion = "0";
                    } else if (jRFinal.isSelected()) {
                        Opcion = "1";
                    } else if (jrCualquier.isSelected()) {
                        Opcion = "2";
                    } else if (jRexacta.isSelected()) {
                        Opcion = "3";
                    }
                    sfieldName = (rjcodigo.isSelected()) ? "co_tipo" : "des_tipo";
              jtableTipoAjuste.setModel(new ModeloTablaTipoAjuste(new TipoAjusteModelo().pObtenerListadoDatos(
                Vistaprincipal.lblNombreEmpresa.getText(),//sDatabase_Name
                "saTipoAjuste",
                sfieldName,//sField_Name
                txtBuscar.getText(),//Valor
                Opcion//@iOpcion
            )));
         }
        
                
                
    }//GEN-LAST:event_txtBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(DialogoTipoAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoTipoAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoTipoAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoTipoAjustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoTipoAjustes dialog = new DialogoTipoAjustes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void cargarDatosTipo(String sDatabase_Name, String table, String sField_Name, String Valor, String opcion) {
        jtableTipoAjuste.setModel(new ModeloTablaTipoAjuste(new Model.TipoAjusteModelo().pObtenerListadoDatos(
                "admin_a",//sDatabase_Name
                "saTipoAjuste",
                "co_tipo",//sField_Name
                "",//Valor
                "2"//@iOpcion
        )));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarTAjuste;
    public javax.swing.JButton btnCancelarTipoAjustes;
    private javax.swing.ButtonGroup btngrupoBusqueda;
    private javax.swing.ButtonGroup btngrupoOpcion;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRexacta;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JTable jtableTipoAjuste;
    public javax.swing.JRadioButton rjcodigo;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}