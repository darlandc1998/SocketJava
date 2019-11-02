package com.socketchat;

import cliente.Cliente;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import servidor.Servidor;

public class Chat extends javax.swing.JFrame {

    private final Cliente cliente;
    private final Servidor servidor;

    private final DefaultListModel modelCliente;
    private final DefaultListModel modelServidor;

    public Chat() {
        initComponents();

        //Iniciar servidor
        servidor = new Servidor();
        cliente = new Cliente();

        modelCliente = new DefaultListModel();
        jListCliente.setModel(modelCliente);

        modelServidor = new DefaultListModel();
        jListServidor.setModel(modelServidor);
        
        setInformacoes();
        
    }

    private void limparCampos() {
        jTxtMensagem.setText(null);
    }

    private void setInformacoes() {
        //Cliente
        jLblStatusClienteValor.setText("Rodando...");
        jLblEnderecoClienteValor.setText(cliente.serverName + ":" + cliente.serverPort);

        //Servidor
        jLblStatusServidorValor.setText("Rodando...");
        jLblEnderecoServidorValor.setText("localhost:" + servidor.port);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtMensagem = new javax.swing.JTextField();
        jBtnEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCliente = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListServidor = new javax.swing.JList<>();
        jLblCliente = new javax.swing.JLabel();
        jLblStatusCliente = new javax.swing.JLabel();
        jLblEnderecoCliente = new javax.swing.JLabel();
        jLblServidor = new javax.swing.JLabel();
        jLblStatusServidor = new javax.swing.JLabel();
        jLblEnderecoServidor = new javax.swing.JLabel();
        jLblStatusClienteValor = new javax.swing.JLabel();
        jLblEnderecoClienteValor = new javax.swing.JLabel();
        jLblStatusServidorValor = new javax.swing.JLabel();
        jLblEnderecoServidorValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Socket");
        setResizable(false);

        jBtnEnviar.setText("Enviar");
        jBtnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEnviarMouseClicked(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 250));

        jScrollPane2.setViewportView(jListCliente);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 250));

        jScrollPane1.setViewportView(jListServidor);

        jLblCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblCliente.setText("Cliente");

        jLblStatusCliente.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblStatusCliente.setText("Status:");

        jLblEnderecoCliente.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblEnderecoCliente.setText("Endereço:");

        jLblServidor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLblServidor.setText("Servidor");

        jLblStatusServidor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblStatusServidor.setText("Status:");

        jLblEnderecoServidor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblEnderecoServidor.setText("Endereço:");

        jLblStatusClienteValor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblStatusClienteValor.setText("Rodando...");

        jLblEnderecoClienteValor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblEnderecoClienteValor.setText("localhost:8081");

        jLblStatusServidorValor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblStatusServidorValor.setText("Rodando");

        jLblEnderecoServidorValor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLblEnderecoServidorValor.setText("localhost:8081");

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
                                .addComponent(jTxtMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLblServidor)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblStatusServidor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLblStatusServidorValor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLblEnderecoServidor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLblEnderecoServidorValor)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblStatusCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblStatusClienteValor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblEnderecoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblEnderecoClienteValor)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCliente)
                    .addComponent(jLblServidor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblStatusCliente)
                    .addComponent(jLblStatusServidor)
                    .addComponent(jLblStatusClienteValor)
                    .addComponent(jLblStatusServidorValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEnderecoCliente)
                    .addComponent(jLblEnderecoServidor)
                    .addComponent(jLblEnderecoClienteValor)
                    .addComponent(jLblEnderecoServidorValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBtnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTxtMensagem))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEnviarMouseClicked
        String mensagem = jTxtMensagem.getText();

        if (mensagem.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe uma mensagem!");
            return;
        }

        cliente.enviar(modelCliente, mensagem);
        servidor.criarCanal();
        servidor.receber(modelServidor);

        limparCampos();
    }//GEN-LAST:event_jBtnEnviarMouseClicked

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEnviar;
    private javax.swing.JLabel jLblCliente;
    private javax.swing.JLabel jLblEnderecoCliente;
    private javax.swing.JLabel jLblEnderecoClienteValor;
    private javax.swing.JLabel jLblEnderecoServidor;
    private javax.swing.JLabel jLblEnderecoServidorValor;
    private javax.swing.JLabel jLblServidor;
    private javax.swing.JLabel jLblStatusCliente;
    private javax.swing.JLabel jLblStatusClienteValor;
    private javax.swing.JLabel jLblStatusServidor;
    private javax.swing.JLabel jLblStatusServidorValor;
    private javax.swing.JList<String> jListCliente;
    private javax.swing.JList<String> jListServidor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtMensagem;
    // End of variables declaration//GEN-END:variables
}
