/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio04;

import javax.swing.JTextField;


public class Convertidor extends javax.swing.JFrame {

   Logica log;
    public Convertidor() {
        initComponents();
        log =new Logica(txtValor);
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        radInversa = new javax.swing.JRadioButton();
        btnKilos = new javax.swing.JButton();
        btnCelsius = new javax.swing.JButton();
        btnSoles = new javax.swing.JButton();
        btnPies = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor");

        jLabel2.setText("Resultado");

        lblResultado.setText("0.00");

        radInversa.setText("Inversa");

        btnKilos.setText("de Kg a Lb");
        btnKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKilosActionPerformed(evt);
            }
        });

        btnCelsius.setText("de C° a F°");
        btnCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelsiusActionPerformed(evt);
            }
        });

        btnSoles.setText("de sol a dolar");
        btnSoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolesActionPerformed(evt);
            }
        });

        btnPies.setText("de Pies a Metros");
        btnPies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiesActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSoles, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPies, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radInversa)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblResultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKilos)
                    .addComponent(btnSoles)
                    .addComponent(btnCelsius))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPies)
                    .addComponent(btnLimpiar)
                    .addComponent(radInversa))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
  
    
    private void btnCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelsiusActionPerformed

         if(radInversa.isSelected()){ lblResultado.setText(log.fahrenheitACelsius() +"");
         }else{lblResultado.setText(log.celsiusAFahrenheit() + "" ); }
    }//GEN-LAST:event_btnCelsiusActionPerformed

    private void btnKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKilosActionPerformed

         if(radInversa.isSelected()){ lblResultado.setText(log.librasAKilos() +"");
         }else{  lblResultado.setText(log.kilosALibras() + "" ); }      
    }//GEN-LAST:event_btnKilosActionPerformed

    private void btnSolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolesActionPerformed
      
         if(radInversa.isSelected()){lblResultado.setText(log.dolaresASoles() +"");
         }else{ lblResultado.setText(log.solesADolares() + "" );}
    }//GEN-LAST:event_btnSolesActionPerformed

    private void btnPiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiesActionPerformed
       
         if(radInversa.isSelected()){lblResultado.setText(log.MetrosAPies() +"");
         }else{lblResultado.setText(log.piesAMetros() + "" );}
    }//GEN-LAST:event_btnPiesActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      txtValor.setText("");
      lblResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelsius;
    private javax.swing.JButton btnKilos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPies;
    private javax.swing.JButton btnSoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton radInversa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
