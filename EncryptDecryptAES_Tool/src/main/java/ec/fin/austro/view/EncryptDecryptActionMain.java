/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.fin.austro.view;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ba0100068f
 */
public class EncryptDecryptActionMain extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public EncryptDecryptActionMain() {
        initComponents();
        Icon icon = new ImageIcon("copy_120015.png");
        this.btnCopia.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnProcesa = new javax.swing.JButton();
        btnCopia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtValor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbtEncrypt = new javax.swing.JRadioButton();
        rbtDecrypt = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Texto:");

        jLabel5.setText("Resultado:");

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnProcesa.setText("PROCESAR");
        btnProcesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesaActionPerformed(evt);
            }
        });

        btnCopia.setText("Copiar");
        btnCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiaActionPerformed(evt);
            }
        });

        txtValor.setColumns(20);
        txtValor.setRows(5);
        jScrollPane1.setViewportView(txtValor);

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane2.setViewportView(txtRespuesta);

        jLabel6.setText("ENCRIPTA - DESENCRIPTA (AES256)");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Proceso:");

        rbtEncrypt.setSelected(true);
        rbtEncrypt.setText("Encripta");
        rbtEncrypt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtEncryptStateChanged(evt);
            }
        });

        rbtDecrypt.setText("Desencripta");
        rbtDecrypt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtDecryptStateChanged(evt);
            }
        });

        jLabel2.setText("Tipo:");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Clave", "Propertie" }));
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        cbTipo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbTipoPropertyChange(evt);
            }
        });

        jLabel3.setText("Separador:");

        txtSep.setEnabled(false);

        jLabel7.setText("CLAVE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbtEncrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtDecrypt)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSep, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbtEncrypt)
                    .addComponent(rbtDecrypt)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(btnCopia))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcesa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnProcesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnCopia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEncryptStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtEncryptStateChanged
        if (this.rbtEncrypt.isSelected()) {
            this.rbtDecrypt.setSelected(false);
        }
    }//GEN-LAST:event_rbtEncryptStateChanged

    private void rbtDecryptStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtDecryptStateChanged
        if (this.rbtDecrypt.isSelected()) {
            this.rbtEncrypt.setSelected(false);
        }
    }//GEN-LAST:event_rbtDecryptStateChanged

    public void escribeResultado(List<EncryptDecryptAction.Propiedad> lista) {
        this.txtRespuesta.setText("");
        for (EncryptDecryptAction.Propiedad propiedad : lista) {
            this.txtRespuesta.append(propiedad.toString() + "\n");
        }
    }

    public void copyClipboard(String copyText) {
        StringSelection ss = new StringSelection(copyText);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }
    private void btnProcesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesaActionPerformed
        List<EncryptDecryptAction.Propiedad> listOriginal, re;
        EncryptDecryptAction edu = new EncryptDecryptAction();
        String res = "";
        String clave = this.txtClave.getText();
        String valor = this.txtValor.getText();
        if (this.txtClave.isEnabled() && (clave == null || clave.equals(""))) {
            JOptionPane.showMessageDialog(this.rootPane, "Clave de Encriptacion vac");
            return;
        }
        if (valor == null) {
            JOptionPane.showMessageDialog(this.rootPane, "Texto de Entrada vac");
            return;
        }
        if (this.txtSep.isEnabled() && (this.txtSep.getText().trim() == null || this.txtSep.getText().trim().equals(""))) {
            this.txtSep.setFocusable(true);
            JOptionPane.showMessageDialog(this.rootPane, "Separador de properties vac");
            return;
        }
        int item = this.cbTipo.getSelectedIndex();
        switch (item) {
            case 0:
                if (this.rbtEncrypt.isSelected()) {
                    res = edu.encripta(clave, valor);
                } else {
                    res = edu.desencripta(clave, valor);
                }
                this.txtRespuesta.setText(res);
                break;
            case 1:
                if (this.rbtEncrypt.isSelected()) {
                    res = edu.encripta(valor);
                } else {
                    res = edu.desencripta(valor);
                }
                this.txtRespuesta.setText(res);
                break;
            case 2:
                listOriginal = edu.listarTexto(valor, this.txtSep.getText().trim());
                re = null;
                if (this.rbtEncrypt.isSelected()) {
                    re = edu.encriptaLista(clave, listOriginal);
                } else {
                    re = edu.desencriptaLista(clave, listOriginal);
                }
                escribeResultado(re);
                break;
            default:
                throw new AssertionError();
        }
        if (!res.equals("")
                && res.contains("*Error")) {
            this.txtRespuesta.setText("");
            JOptionPane.showMessageDialog(this.rootPane, res);
        }
    }//GEN-LAST:event_btnProcesaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtRespuesta.setText("");
        this.txtValor.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiaActionPerformed
        copyClipboard(this.txtRespuesta.getText());
    }//GEN-LAST:event_btnCopiaActionPerformed

    private void cbTipoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbTipoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoPropertyChange

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        if (this.cbTipo.getSelectedIndex() == 2) {
            this.txtSep.setEnabled(true);
        } else {
            this.txtSep.setEnabled(false);
        }
        if (this.cbTipo.getSelectedIndex() == 1) {
            this.txtClave.setEnabled(false);
        } else {
            this.txtClave.setEnabled(true);
        }
    }//GEN-LAST:event_cbTipoItemStateChanged

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
            java.util.logging.Logger.getLogger(EncryptDecryptActionMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptDecryptActionMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptDecryptActionMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptDecryptActionMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptDecryptActionMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopia;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesa;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbtDecrypt;
    private javax.swing.JRadioButton rbtEncrypt;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextArea txtRespuesta;
    private javax.swing.JTextField txtSep;
    private javax.swing.JTextArea txtValor;
    // End of variables declaration//GEN-END:variables
}