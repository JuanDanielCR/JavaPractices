package sources;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Marcador extends javax.swing.JFrame implements ActionListener{
    public Marcador() {
        initComponents();
        System.out.println("Yeah!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAmerica = new javax.swing.JTextField();
        jTextFieldChivas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Mostrar Ganador");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Marcador");

        jLabel2.setText("América");

        jLabel3.setText("Chivas");

        jTextFieldAmerica.setText("0");
        jTextFieldAmerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmericaActionPerformed(evt);
            }
        });

        jTextFieldChivas.setText("0");
        jTextFieldChivas.setToolTipText("");
        jTextFieldChivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChivasActionPerformed(evt);
            }
        });

        jLabel4.setText("Ganador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAmerica)
                            .addComponent(jTextFieldChivas, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAmerica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldChivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int golesAmerica = 0;
        int golesChivas = 0;
        Border b = new LineBorder(Color.red);
      try{
         golesAmerica = Integer.parseInt(jTextFieldAmerica.getText());
      }catch(Exception E){
           JOptionPane.showMessageDialog(rootPane, "Error en America");
          jTextFieldAmerica.setBorder(b);
          jTextFieldAmerica.setText("0");
      }
          try{
         golesChivas = Integer.parseInt(jTextFieldChivas.getText());
        }catch(Exception e){
          JOptionPane.showMessageDialog(rootPane, "Error en Chivas");
            jTextFieldChivas.setBorder(b);
            jTextFieldChivas.setText("0");
      }
        if(golesAmerica > golesChivas){
            jLabel4.setText("Ganador: America");
            JOptionPane.showMessageDialog(null, "America", "Ganador", JOptionPane.QUESTION_MESSAGE);
        }else if(golesAmerica < golesChivas){
            jLabel4.setText("Ganador: Chivas");
            JOptionPane.showMessageDialog(null, "Chivas", "Ganador", JOptionPane.QUESTION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Empate", "Ganador", JOptionPane.YES_OPTION);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldAmericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmericaActionPerformed
        System.out.println("Texto");
    }//GEN-LAST:event_jTextFieldAmericaActionPerformed

    private void jTextFieldChivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChivasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChivasActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Marcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marcador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marcador().setVisible(true); //El objeto marcador extiende de JFrame, por eso podemos aplicar setVisible()
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldAmerica;
    private javax.swing.JTextField jTextFieldChivas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
