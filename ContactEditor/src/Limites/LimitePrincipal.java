package Limites;

import Controladores.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LimitePrincipal extends javax.swing.JFrame {

    private ControlePrincipal objCtr;

    public LimitePrincipal(ControlePrincipal pCtr) {
        objCtr = pCtr;
        initComponents();
        this.setTitle("Bem vindo!");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Pessoas = new javax.swing.JMenu();
        Vendedores = new javax.swing.JMenu();
        CadVend = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        corretores = new javax.swing.JMenu();
        CadCorretor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MostrarPessoas = new javax.swing.JMenuItem();
        Imoveis = new javax.swing.JMenu();
        CadImovel = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        visualizarImoveis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("Salvar Alterações");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pessoas.setText("Pessoas");

        Vendedores.setText("Vendedores");

        CadVend.setText("Cadastrar");
        CadVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadVendActionPerformed(evt);
            }
        });
        Vendedores.add(CadVend);

        Pessoas.add(Vendedores);
        Pessoas.add(jSeparator1);

        corretores.setText("Corretores");

        CadCorretor.setText("Cadastrar");
        CadCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCorretorActionPerformed(evt);
            }
        });
        corretores.add(CadCorretor);

        Pessoas.add(corretores);
        Pessoas.add(jSeparator2);

        MostrarPessoas.setText("Mostrar Pessoas");
        MostrarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPessoasActionPerformed(evt);
            }
        });
        Pessoas.add(MostrarPessoas);

        jMenuBar1.add(Pessoas);

        Imoveis.setText("Imóveis");

        CadImovel.setText("Cadastrar Imóvel");
        CadImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadImovelActionPerformed(evt);
            }
        });
        Imoveis.add(CadImovel);
        Imoveis.add(jSeparator3);

        visualizarImoveis.setText("Visualizar Imóveis");
        visualizarImoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarImoveisActionPerformed(evt);
            }
        });
        Imoveis.add(visualizarImoveis);

        jMenuBar1.add(Imoveis);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 529, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadVendActionPerformed
        objCtr.cadVendedor();
    }//GEN-LAST:event_CadVendActionPerformed

    private void CadImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadImovelActionPerformed
        objCtr.cadImovel();
    }//GEN-LAST:event_CadImovelActionPerformed

    private void MostrarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPessoasActionPerformed
        objCtr.showPessoas();
    }//GEN-LAST:event_MostrarPessoasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            objCtr.salvaSessao();
            JOptionPane.showMessageDialog(null, "sessão salva com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar sessão!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CadCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCorretorActionPerformed
        objCtr.cadCorretor();
    }//GEN-LAST:event_CadCorretorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objCtr.saida();
    }//GEN-LAST:event_formWindowClosing

    private void visualizarImoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarImoveisActionPerformed
        objCtr.showImoveis();
    }//GEN-LAST:event_visualizarImoveisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCorretor;
    private javax.swing.JMenuItem CadImovel;
    private javax.swing.JMenuItem CadVend;
    private javax.swing.JMenu Imoveis;
    private javax.swing.JMenuItem MostrarPessoas;
    private javax.swing.JMenu Pessoas;
    private javax.swing.JMenu Vendedores;
    private javax.swing.JMenu corretores;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem visualizarImoveis;
    // End of variables declaration//GEN-END:variables
}
