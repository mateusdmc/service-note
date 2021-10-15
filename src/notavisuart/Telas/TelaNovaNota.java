package notavisuart.Telas;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import notavisuart.Nota;
import notavisuart.Servico;
//import notavisuart.ValidacaoCampo.SoNumero;

public class TelaNovaNota extends javax.swing.JFrame {

    public TelaNovaNota() {
        initComponents();
        txtNomedoClienta.setEditable(false);
        txtValorTotalDaNota.setEditable(false);
        txtEnd.setEditable(false);
        txtTel.setEditable(false);
        txtCpf.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lstSevico = new LinkedList<Servico>();
        btnAddServico = new javax.swing.JButton();
        btnRemoverervico = new javax.swing.JButton();
        lblDescricaoServico = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtNomeServico = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValorUnitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNomedoClienta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtValorTotalDaNota = new javax.swing.JTextField();
        btnLiparCadServico = new javax.swing.JButton();
        btnGerarNotaPDF = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtCPF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        lstSevico = org.jdesktop.observablecollections.ObservableCollections.observableList(lstSevico);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerardor de Nota");
        setName(""); // NOI18N

        btnAddServico.setText("Adicionar Serviço");
        btnAddServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddServicoMouseClicked(evt);
            }
        });
        btnAddServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServicoActionPerformed(evt);
            }
        });

        btnRemoverervico.setText("Excluir Serviço");
        btnRemoverervico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverervicoMouseClicked(evt);
            }
        });
        btnRemoverervico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverervicoActionPerformed(evt);
            }
        });

        lblDescricaoServico.setText("Nome do Serviço:");

        lblValorUnitario.setText("Valor Unitário:");

        lblQuantidade.setText("Quantidade:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeServico}"), txtNomeServico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtNomeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeServicoActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantiServico}"), txtQuantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorServico}"), txtValorUnitario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, lstSevico, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeServico}"));
        columnBinding.setColumnName("Nome Servico");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantiServico}"));
        columnBinding.setColumnName("Quanti Servico");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorServico}"));
        columnBinding.setColumnName("Valor Servico");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Float.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        txtNomedoClienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomedoClientaActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar Cliente da Nota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("VALOR TOTAL DA NOTA:");

        txtValorTotalDaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalDaNotaActionPerformed(evt);
            }
        });

        btnLiparCadServico.setText("Limpar ");
        btnLiparCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiparCadServicoActionPerformed(evt);
            }
        });

        btnGerarNotaPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notavisuart/img/pdf.png"))); // NOI18N
        btnGerarNotaPDF.setText("Gerar Nota em PDF");
        btnGerarNotaPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarNotaPDFActionPerformed(evt);
            }
        });

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF:");

        jLabel4.setText("Tel.:");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        txtEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel6.setText("Cliente:");

        jLabel7.setText("Endereço:");

        jLabel8.setText("Tel.:");

        jLabel9.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorTotalDaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnAddServico)
                                .addGap(77, 77, 77)
                                .addComponent(btnLiparCadServico)
                                .addGap(78, 78, 78)
                                .addComponent(btnRemoverervico)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomedoClienta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricaoServico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeServico)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(lblValorUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnGerarNotaPDF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomedoClienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoServico)
                    .addComponent(txtNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(lblValorUnitario)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverervico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLiparCadServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValorTotalDaNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerarNotaPDF)
                .addGap(32, 32, 32))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServicoActionPerformed
        float valorUni =  Float.parseFloat(txtValorUnitario.getText());
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        float valortotal = (quantidade * valorUni);
                
        Servico s = new Servico(txtNomeServico.getText(), valorUni, quantidade, valortotal);
        lstSevico.add(s);
        txtNomeServico.setText("");
        txtValorUnitario.setText("");
        txtQuantidade.setText("");
        
    }//GEN-LAST:event_btnAddServicoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioActionPerformed

    private void txtNomeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeServicoActionPerformed

    private void btnRemoverervicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverervicoActionPerformed
        int selecionado = jTable1.getSelectedRow();
        lstSevico.remove(selecionado);
        txtNomeServico.setText("");
        txtValorUnitario.setText("");
        txtQuantidade.setText("");
    }//GEN-LAST:event_btnRemoverervicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtNomedoClienta.setText(txtCliente.getText());
        txtEnd.setText(txtEndereco.getText());
        txtTel.setText(txtTelefone.getText());
        txtCpf.setText(txtCPF.getText());
        txtCliente.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtCPF.setText("");        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomedoClientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomedoClientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomedoClientaActionPerformed

    private void txtValorTotalDaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalDaNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalDaNotaActionPerformed

    private void btnAddServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddServicoMouseClicked
        double soma = 0;
        for (int i=0; i<jTable1.getRowCount(); i++){
            float valor = (float)jTable1.getValueAt(i, 3);
            soma = (soma + valor);
           txtValorTotalDaNota.setText(String.valueOf(soma));
        }
    }//GEN-LAST:event_btnAddServicoMouseClicked

    private void btnLiparCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiparCadServicoActionPerformed
        txtNomeServico.setText("");
        txtValorUnitario.setText("");
        txtQuantidade.setText("");
    }//GEN-LAST:event_btnLiparCadServicoActionPerformed
    
    private void btnGerarNotaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarNotaPDFActionPerformed
        
        Font font12Preto = new Font(Font.FontFamily.UNDEFINED , 12, Font.UNDERLINE, BaseColor.BLACK);
        Font fontNegrito = new Font(Font.FontFamily.UNDEFINED , 12, Font.BOLD, BaseColor.BLACK);
        Font fontNegritoRed = new Font(Font.FontFamily.UNDEFINED , 12, Font.BOLD, BaseColor.RED);
        Font font12Branco = new Font(Font.FontFamily.UNDEFINED , 12, Font.BOLD, BaseColor.WHITE);
        Font font7 = new Font(Font.FontFamily.UNDEFINED , 7, Font.ITALIC, BaseColor.BLACK);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(txtNomedoClienta.getText() + ".pdf"));
            //document.setPageSize(PageSize.A4.rotate());
            
            document.open();
            PdfPTable tabela = new PdfPTable(12);
            tabela.setTotalWidth(document.getPageSize().getWidth() - 140);
            tabela.setLockedWidth(true);
            
            //Logo da Loja
            PdfPCell logoVisuart = new PdfPCell();
            logoVisuart.setHorizontalAlignment(Element.ALIGN_CENTER);
            logoVisuart.setColspan(6);
            Image logoV = Image.getInstance("inc_visuart.png");
            //logoV.setWidthPercentage(100.100f);
            logoVisuart.addElement(logoV);
            
            //Ordem Nº e Data:
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            PdfPCell tbNumData = new PdfPCell();
            tbNumData.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbNumData.setColspan(3);
            Paragraph p1 = new Paragraph();
            tbNumData.addElement(new Paragraph("               Ordem Nº: ", font12Preto));

            tbNumData.addElement(new Paragraph("                        Data: "));
            
            PdfPCell tbInfoNumData = new PdfPCell();
            tbInfoNumData.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbInfoNumData.setColspan(3);
            tbInfoNumData.addElement(new Paragraph("           ######        .", font12Preto));
            tbInfoNumData.addElement(new Paragraph( "        " + formatador.format( data )));
            
            //Nome da Loja e Cliente
            PdfPCell nomeLoja = new PdfPCell();
            nomeLoja.setHorizontalAlignment(Element.ALIGN_CENTER);
            nomeLoja.setColspan(6);
            nomeLoja.addElement(new Paragraph("  VISUART"));
            
            PdfPCell clientBlack = new PdfPCell();
            clientBlack.setHorizontalAlignment(Element.ALIGN_CENTER);
            clientBlack.setBackgroundColor(BaseColor.BLACK);
            clientBlack.setColspan(6);
            clientBlack.addElement(new Paragraph("                           CLIENTE", font12Branco));
            
            //CNPJ e Nome do Cliente
            PdfPCell cnpjLoja = new PdfPCell();
            cnpjLoja.setHorizontalAlignment(Element.ALIGN_CENTER);
            cnpjLoja.setColspan(6);
            cnpjLoja.addElement(new Paragraph("  CNPJ: 23.526.044/0001-55"));
            
            PdfPCell nomeCliente = new PdfPCell();
            nomeCliente.setVerticalAlignment(Element.ALIGN_CENTER);
            nomeCliente.setColspan(6);
            nomeCliente.addElement(new Paragraph("Nome: " + txtNomedoClienta.getText()));
            
            //Endereço da Loja e CPF do Cliente
            PdfPCell endLoja = new PdfPCell();
            endLoja.setHorizontalAlignment(Element.ALIGN_CENTER);
            endLoja.setColspan(6);
            endLoja.addElement(new Paragraph("  RUA LIBERATO JOSÉ, Nº 389"));
            
            PdfPCell cpfCliente = new PdfPCell();
            cpfCliente.setVerticalAlignment(Element.ALIGN_CENTER);
            cpfCliente.setColspan(6);
            cpfCliente.addElement(new Paragraph("CPF: " + txtCpf.getText()));
            
            //Cidade Loja e Endereço do Cliente
            PdfPCell cidadeLoja = new PdfPCell();
            cidadeLoja.setHorizontalAlignment(Element.ALIGN_CENTER);
            cidadeLoja.setColspan(6);
            cidadeLoja.addElement(new Paragraph("  SIMÕES - PI"));
            
            PdfPCell endCliente = new PdfPCell();
            endCliente.setVerticalAlignment(Element.ALIGN_CENTER);
            endCliente.setColspan(6);
            endCliente.addElement(new Paragraph("End.: " + txtEnd.getText()));
            
            //Telefone Loja e Telefone do Cliente
            PdfPCell telLoja = new PdfPCell();
            telLoja.setHorizontalAlignment(Element.ALIGN_CENTER);
            telLoja.setColspan(6);
            telLoja.addElement(new Paragraph("  Tel:. (89) 9.9930-4138"));
            
            PdfPCell telCliente = new PdfPCell();
            telCliente.setVerticalAlignment(Element.ALIGN_CENTER);
            telCliente.setColspan(6);
            telCliente.addElement(new Paragraph("Tel.: " + txtTel.getText()));
            
            //LINHA E AREA PARA DESCRIÇÃO DO SERVIÇO
            PdfPCell descServico = new PdfPCell();
            descServico.setHorizontalAlignment(Element.ALIGN_CENTER);
            descServico.setBackgroundColor(BaseColor.BLACK);
            descServico.setColspan(12);
            descServico.addElement(new Paragraph("                                            DESCRIÇÃO DO SERVIÇO", font12Branco));
            
            String descricaoFinal = "";
            for (int i = 0; i < jTable1.getRowCount(); i++){
            String desc = (String)jTable1.getValueAt(i, 0);
            descricaoFinal = (descricaoFinal + desc + ", ");
            }
        
            PdfPCell areaDescServico = new PdfPCell();
            areaDescServico.setHorizontalAlignment(Element.ALIGN_CENTER);
            areaDescServico.setColspan(12);
            areaDescServico.addElement(new Paragraph("  "));
            areaDescServico.addElement(new Paragraph(descricaoFinal));
            areaDescServico.addElement(new Paragraph("  "));
            
            //Quantidade, Seviço, preço unitario, preço total do serviço
            PdfPCell quantServ = new PdfPCell();
            quantServ.setHorizontalAlignment(Element.ALIGN_CENTER);
            quantServ.setBackgroundColor(BaseColor.BLACK);
            quantServ.setColspan(2);
            quantServ.addElement(new Paragraph("    Unidade", font12Branco));
            
            PdfPCell servico = new PdfPCell();
            servico.setVerticalAlignment(Element.ALIGN_CENTER);
            servico.setBackgroundColor(BaseColor.BLACK);
            servico.setColspan(6);
            servico.addElement(new Paragraph("                            Serviço", font12Branco));
            
            PdfPCell valorUnitario = new PdfPCell();
            valorUnitario.setVerticalAlignment(Element.ALIGN_CENTER);
            valorUnitario.setBackgroundColor(BaseColor.BLACK);
            valorUnitario.setColspan(2);
            valorUnitario.addElement(new Paragraph("   Valor Uni.", font12Branco));
            
            PdfPCell valorTotal = new PdfPCell();
            valorTotal.setVerticalAlignment(Element.ALIGN_CENTER);
            valorTotal.setBackgroundColor(BaseColor.BLACK);
            valorTotal .setColspan(2);
            valorTotal.addElement(new Paragraph("       Total", font12Branco));
            
            
            tabela.addCell(logoVisuart);
            tabela.addCell(tbNumData);
            tabela.addCell(tbInfoNumData);
            tabela.addCell(nomeLoja);
            tabela.addCell(clientBlack);
            tabela.addCell(cnpjLoja);
            tabela.addCell(nomeCliente);
            tabela.addCell(endLoja);
            tabela.addCell(cpfCliente);
            tabela.addCell(cidadeLoja);
            tabela.addCell(endCliente);
            tabela.addCell(telLoja);
            tabela.addCell(telCliente);
            tabela.addCell(descServico);
            tabela.addCell(areaDescServico);
            tabela.addCell(quantServ);
            tabela.addCell(servico);
            tabela.addCell(valorUnitario);
            tabela.addCell(valorTotal);
            
            //---------------------------------- CELULA DOS SERVIÇOS ------------------------------
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
            PdfPCell c1quantServ = new PdfPCell();
            c1quantServ.setHorizontalAlignment(Element.ALIGN_CENTER);
            c1quantServ.setColspan(2);
            c1quantServ.addElement(new Paragraph("" + jTable1.getValueAt(i, 1)));
            tabela.addCell(c1quantServ);
            
            PdfPCell c1servico = new PdfPCell();
            c1servico.setVerticalAlignment(Element.ALIGN_CENTER);
            c1servico.setColspan(6);
            c1servico.addElement(new Paragraph("" + jTable1.getValueAt(i, 0)));
            tabela.addCell(c1servico);
            
            PdfPCell c1valorUnitario = new PdfPCell();
            c1valorUnitario.setVerticalAlignment(Element.ALIGN_CENTER);
            c1valorUnitario.setColspan(2);
            c1valorUnitario.addElement(new Paragraph("" + jTable1.getValueAt(i, 2)));
            tabela.addCell(c1valorUnitario);
            
            PdfPCell c1valorTotal = new PdfPCell();
            c1valorTotal.setVerticalAlignment(Element.ALIGN_CENTER);
            c1valorTotal.setColspan(2);
            c1valorTotal.addElement(new Paragraph("" + jTable1.getValueAt(i, 3)));
            tabela.addCell(c1valorTotal);
        }
            
            //TERMO DE COMPROMISSO E SUB-TOTAL
            PdfPCell terAprovacao = new PdfPCell();
            terAprovacao.setVerticalAlignment(Element.ALIGN_CENTER);
            terAprovacao.setBackgroundColor(BaseColor.BLACK);
            terAprovacao.setColspan(8);
            terAprovacao.addElement(new Paragraph("                       TERMO DE APROVAÇÃO", font12Branco));
            
            PdfPCell subTotal = new PdfPCell();
            subTotal.setVerticalAlignment(Element.ALIGN_CENTER);
            subTotal.setColspan(2);
            subTotal.addElement(new Paragraph("     Desconto:"));
            
            PdfPCell valSubTotal = new PdfPCell();
            valSubTotal.setVerticalAlignment(Element.ALIGN_CENTER);
            valSubTotal.setColspan(2);
            valSubTotal.addElement(new Paragraph("######"));
            
            //texto do TERMO DE COMPROMISSO DesTOTAL
            PdfPCell texTerAprovacao = new PdfPCell();
            texTerAprovacao.setVerticalAlignment(Element.ALIGN_CENTER);
            texTerAprovacao.setColspan(8);
            texTerAprovacao.addElement(new Paragraph("     Afirmo neste termo que o serviço encomendado está corrigido e aprovado para confecção.\n" +
"   Estou consciente que qualquer erro encontrado após a confecção do material será de minha\n" +
"             inteira responsabilidade, assumindo assim a perda do material confeccionado e\n" +
"                                     conseqüentemente o valor combinado do serviço.", font7));
            
            PdfPCell desconto = new PdfPCell();
            desconto.setVerticalAlignment(Element.ALIGN_CENTER);
            desconto.setColspan(2);
            desconto.addElement(new Paragraph("     TOTAL:", fontNegrito));
            
            PdfPCell totalFinal = new PdfPCell();
            totalFinal.setVerticalAlignment(Element.ALIGN_CENTER);
            totalFinal.setColspan(2);
            totalFinal.addElement(new Paragraph("" + txtValorTotalDaNota.getText(),fontNegritoRed));
            
            //Assinatura do TERMO DE COMPROMISSO e data de entrega
            PdfPCell assTerAprovacao = new PdfPCell();
            assTerAprovacao.setVerticalAlignment(Element.ALIGN_CENTER);
            assTerAprovacao.setColspan(8);
            assTerAprovacao.addElement(new Paragraph(" "));
            assTerAprovacao.addElement(new Paragraph(" "));
            assTerAprovacao.addElement(new Paragraph("  ____________________    ____________________"));
            assTerAprovacao.addElement(new Paragraph(" *Li e concordo com os Termos de Aprovação                                 Ass. Eminente", font7));
            
            PdfPCell dataEntrega = new PdfPCell();
            dataEntrega.setVerticalAlignment(Element.ALIGN_CENTER);
            dataEntrega.setColspan(4);
            dataEntrega.addElement(new Paragraph(""));
            dataEntrega.addElement(new Paragraph("      DATA DE ENTREGA   .", font12Preto));
            dataEntrega.addElement(new Paragraph("\n"));
            dataEntrega.addElement(new Paragraph("   ______/______/______"));
            
            PdfPCell vTest = new PdfPCell();
            vTest.setVerticalAlignment(Element.ALIGN_CENTER);
            vTest.setColspan(12);

            tabela.addCell(terAprovacao);
            tabela.addCell(subTotal);
            tabela.addCell(valSubTotal);
            tabela.addCell(texTerAprovacao);
            tabela.addCell(desconto);
            tabela.addCell(totalFinal);
            tabela.addCell(assTerAprovacao);
            tabela.addCell(dataEntrega);
            
            tabela.completeRow();
            document.add(tabela);
            document.close();
            
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro: " + ex);
        //} catch (BadElementException ex) {
            Logger.getLogger(TelaNovaNota.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaNovaNota.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
        
        try {
            Desktop.getDesktop().open(new File(txtNomedoClienta.getText() + ".pdf"));
        } catch (IOException ex) {
            Logger.getLogger(TelaNovaNota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarNotaPDFActionPerformed

    private void btnRemoverervicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverervicoMouseClicked
        double soma = 0;
        for (int i=0; i<jTable1.getRowCount(); i++){
            float valor = (float)jTable1.getValueAt(i, 3);
            soma = (soma + valor);
           txtValorTotalDaNota.setText(String.valueOf(soma));
        }if (soma == 0) {
           txtValorTotalDaNota.setText("0.0");
        }
    }//GEN-LAST:event_btnRemoverervicoMouseClicked

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddServico;
    private javax.swing.JButton btnGerarNotaPDF;
    private javax.swing.JButton btnLiparCadServico;
    private javax.swing.JButton btnRemoverervico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDescricaoServico;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorUnitario;
    private java.util.List<Servico> lstSevico;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeServico;
    private javax.swing.JTextField txtNomedoClienta;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValorTotalDaNota;
    private javax.swing.JTextField txtValorUnitario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}