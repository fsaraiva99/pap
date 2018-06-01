/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano_treino;

import javax.swing.JComboBox;

/**
 *
 * @author David Nunes
 */
public class Planos extends javax.swing.JFrame {

    /**
     * Creates new form Planos
     */
    public Planos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selecao = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dumbbell.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Plano de Treino");

        selecao.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        selecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Emagrecer", "Massa Muscular", "Definição", "Saudável" }));
        selecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecaoMouseClicked(evt);
            }
        });
        selecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoActionPerformed
       
        if(evt.getSource()== selecao){
            String msg = (String)selecao.getSelectedItem();
     switch(msg){
         case "Emagrecer": area.setText("SEGUNDA --------------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n\n - 1 MINUTO DE AGACHAMENTOS COM BARRA"
                                       +"\n\n - 2 MINUTOS DE HANG CLEAN SEFUIDO DE THRUSTER : 2 MINUTOS DE REMADA INCLINADA"
                                       +"\n\n - 20 FLEXÕES : 2 MINUTOS DE LUNGES COM KETTBELL"
                                       +"\n\n\nTERÇA -------------------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n\n - 1 MINUTO DE PÉS À BARRA : 1 MINUTO DE ABDOMINAIS : 2 MINUTOS DE BURPEES"
                                       +"\n\n - 2 MINUTOS DE SALTOS PARA A CAIXA : 20 ELEVAÇÕES"
                                       +"\n\n\nQUARTA -----------------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n\n - 1 MINUTO DE AGACHAMENTO COM BARRA : 10 SPRINTS DE 5 SEGUNDOS"
                                       +"\n\n - 2 MINUTOS DE REMADA INCLINADA"
                                       +"\n\n - 20 FLEXÕES : 10 SPRINTS DE 5 SEGUNDOS"
                                       +"\n\n\nQUINTA ------------------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n\n - 1 MINUTO DE ABDOMINAIS : 2 MINUTOS DE THRUSTERS : 2 MINUTOS DE AGACHAMENTOS"
                                       +"\n\n - 2 MINUTOS DE REMADA INCLINADA : 20 FLEXÕES"
                                       +"\n\n\nSEXTA --------------------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n\n - 2 MINUTOS DE LUNGES COM KETTBELL : 2 MINUTO DE PÉS À BARRA : 2 MINUTOS DE ABDOMINAIS"
                                       +"\n\n - 2 MINUTOS DE PRESS DE OMBROS : 20 FLEXÕES");
           break;
         case "Massa Muscular": area.setText("SEGUNDA (PEITO)---------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n                                                         - 1 SÉRIE DE AQUECIMENTO - 4 DE TREINO -"
                                       +"\n                                                   1ª- 15 REPS : 2ª- 12 REPS : 3ª- 10 REPS : 4ª- 8 REPS"                       
                                       +"\n\n\n - SUPINO DEITADO COM BARRA"
                                       +"\n\n - SUPINO INCLINADO COM HALTERES"
                                       +"\n\n - ABERTURAS COM HALTERES"
                                       +"\n\n - CROSSOVER EM POLIA"
                                       +"\n\n\nTERÇA (PERNAS)-----------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n                                                         - 1 SÉRIE DE AQUECIMENTO - 4 DE TREINO -"
                                       +"\n                                                   1ª- 15 REPS : 2ª- 12 REPS : 3ª- 10 REPS : 4ª- 8 REPS" 
                                       +"\n\n\n - AGACHAMENTO TOTAL COM BARRA"
                                       +"\n\n - PRENSA DE PERNAS"
                                       +"\n\n - LUNGES COM HALTERES"
                                       +"\n\n - ELEVAÇÕES DE GÉMEOS EM PÉ"
                                       +"\n\n\nQUINTA (COSTAS E OMBROS)------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n                                                         - 1 SÉRIE DE AQUECIMENTO - 4 DE TREINO -"
                                       +"\n                                                   1ª- 15 REPS : 2ª- 12 REPS : 3ª- 10 REPS : 4ª- 8 REPS"
                                       +"\n\n\n - PRENSA DE OMBROS COM BARRA"
                                       +"\n\n - REMADA ALTA COM BARRA"
                                       +"\n\n - REMADA INCLINADA COM BARRA"
                                       +"\n\n - REMADA COM HALTER"
                                       +"\n\n - PUXADA À FRENTE COM POLIA ALTA E AGARRE AFASTADO"
                                       +"\n\n - PESO MORTO"
                                       +"\n\n\nSEXTA (BRAÇOS)------------------------------------------------------------------------Repetir sequência ate concluir 25 min"
                                       +"\n\n                                                         - 1 SÉRIE DE AQUECIMENTO - 4 DE TREINO -"
                                       +"\n                                                   1ª- 15 REPS : 2ª- 12 REPS : 3ª- 10 REPS : 4ª- 8 REPS"
                                       +"\n\n\n - CURL COM BARRA"
                                       +"\n\n - SUPINO COM BARRA E AGARRE JUNTO"
                                       +"\n\n - CURL ALTERNADO COM HALTERES EM BANCO INCLINADO"
                                       +"\n\n - EXTENSÕES DE TRICEPS SENTADO COM HALTER"
                                       +"\n\n - CURL SCOTT COM BARRA EZ"
                                       +"\n\n - PUXADA DE TRÍCEPS");
            break;
         case "Definição": area.setText("KYS");
             break;
        case "Saudável": area.setText("KYSxcz<acscdc");
             break;
            
     }
        }
    }//GEN-LAST:event_selecaoActionPerformed

    private void selecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecaoMouseClicked
      
       
// TODO add your handling code here:
    }//GEN-LAST:event_selecaoMouseClicked

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
            java.util.logging.Logger.getLogger(Planos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox selecao;
    // End of variables declaration//GEN-END:variables
}
