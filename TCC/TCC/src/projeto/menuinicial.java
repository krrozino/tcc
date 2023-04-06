/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.TableModel;
import java.util.List;
import java.util.ArrayList;
import projeto.SquareButton;

/**
 *
 * @author faetec
 */
public class menuinicial extends javax.swing.JFrame {

    
    /**
     * Creates new form menuinicial
     */
    public menuinicial() {
        initComponents();
        BTcriar.setMinimumSize(new Dimension(50, 50));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBtitulo = new javax.swing.JLabel();
        BTcriar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBtitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LBtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBtitulo.setText("GERADOR DE PLANILHA ESCOLAR");
        LBtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BTcriar.setText("Criar Planilha");
        BTcriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcriarActionPerformed(evt);
            }
        });

        jLabel1.setText("Criado por: Marvyn, Sérgio, Vitor e João.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(LBtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(BTcriar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LBtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(BTcriar)
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTcriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcriarActionPerformed
        //abre a janela de criação de planilha, ao apertar no botão "criar planilha"
        criarplanilha criarplanilha = new criarplanilha();
        criarplanilha.setVisible(true);
        
    }//GEN-LAST:event_BTcriarActionPerformed

    
    public void abrirArquivoCSV(File arquivo) {
    try {
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha = leitor.readLine();
        String[] colunas = linha.split(",");
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");
            modelo.addRow(dados);
        }

        leitor.close();

        // Criar uma nova tabela com o modelo preenchido
        JTable tabela = new JTable(modelo);

        // Exibir a tabela no JFrame "criarplanilhas"
        JFrame criarplanilhas = new JFrame();
        criarplanilhas.add(new JScrollPane(tabela));
        criarplanilhas.pack();
        criarplanilhas.setVisible(true);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcriar;
    private javax.swing.JLabel LBtitulo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
