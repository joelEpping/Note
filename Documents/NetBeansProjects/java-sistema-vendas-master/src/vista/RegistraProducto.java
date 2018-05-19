package vista;

import datos.ProdutoDAO;
import tableModel.ProdutoTableModel;
import modelo.Produto;
import javax.swing.JOptionPane;

/**
 * Janela de cadastro de produto
 *
 * @author Juliano
 */
public class RegistraProducto extends javax.swing.JInternalFrame {

    private Produto produto = null;
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public RegistraProducto() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBarraFerramentas = new javax.swing.JPanel();
        barraFerramentas = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnConteudo = new javax.swing.JPanel();
        pnForm = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbPrecoCompra = new javax.swing.JLabel();
        lbPrecoVenda = new javax.swing.JLabel();
        ftfNome = new javax.swing.JFormattedTextField();
        ftfPrecoCompra = new javax.swing.JFormattedTextField();
        ftfPrecoVenda = new javax.swing.JFormattedTextField();
        lbCantidad = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de produtos");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setToolTipText("");
        pnBarraFerramentas.setOpaque(false);
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/novo.png"))); // NOI18N
        btNovo.setText("Nuevo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/novo-foco.png"))); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar.png"))); // NOI18N
        btSalvar.setText("Guardar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar-foco.png"))); // NOI18N
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btSalvar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excluir-foco.png"))); // NOI18N
        btExcluir.setText("Eliminar");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/excluir-foco.png"))); // NOI18N
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar-foco.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar-foco.png"))); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btCancelar);

        pnBarraFerramentas.add(barraFerramentas);

        getContentPane().add(pnBarraFerramentas, java.awt.BorderLayout.PAGE_START);

        pnConteudo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        pnConteudo.setLayout(new java.awt.BorderLayout());

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);

        lbNome.setText("Nombre:");

        lbPrecoCompra.setText("Precio de compra:");

        lbPrecoVenda.setText("Precio de venta");

        ftfNome.setColumns(25);

        ftfPrecoCompra.setColumns(10);
        ftfPrecoCompra.setValue(new Double(0));
        ftfPrecoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfPrecoCompraActionPerformed(evt);
            }
        });

        ftfPrecoVenda.setColumns(10);
        ftfPrecoVenda.setValue(new Double(0));

        lbCantidad.setText("Cantidad:");

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 0, 1000000, 1));

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lbNome)
                        .addGap(4, 4, 4)
                        .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lbCantidad)
                        .addGap(4, 4, 4)
                        .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbPrecoVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbPrecoCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNome))
                    .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbPrecoCompra))
                    .addComponent(ftfPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbPrecoVenda))
                    .addComponent(ftfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCantidad))
                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnConteudo.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ProdutoTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnConteudo.add(spGrade, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 410, 465);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        produto = new Produto();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            produto.setNome(ftfNome.getText().trim());
            produto.setPrecoCompra((Double) ftfPrecoCompra.getValue());
            produto.setPrecoVenda((Double) ftfPrecoVenda.getValue());
            produto.setQuantidade((int) spCantidad.getValue());
            JOptionPane.showMessageDialog(null, spCantidad.getValue());

            
            if (produto.getCodigo() == 0) {
                try {
                    produtoDAO.insertar(produto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al insertar el produto.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    produtoDAO.Modificar(produto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al modificar el  producto.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o produto " + produto + "?");
        if (opcao == 0) {
            try {
                produtoDAO.eliminar(produto);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o produto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            ProdutoTableModel tm = (ProdutoTableModel) tbGrade.getModel();
            produto = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNome.setValue(produto.getNome());
            ftfPrecoCompra.setValue(produto.getPrecoCompra());
            ftfPrecoVenda.setValue(produto.getPrecoVenda());
            spCantidad.setValue(produto.getQuantidade());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void ftfPrecoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfPrecoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfPrecoCompraActionPerformed

    private void habilitarFormulario(boolean ativo) {
       
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNome.setEnabled(ativo);
        ftfPrecoCompra.setEnabled(ativo);
        ftfPrecoVenda.setEnabled(ativo);
        spCantidad.setEnabled(ativo);
        tbGrade.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        produto = null;
        ftfNome.setValue("");
        ftfPrecoCompra.setValue(new Double(0));
        ftfPrecoVenda.setValue(new Double(0));
    }

    private boolean validarFormulario() {
        if (ftfNome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        if (((Double) ftfPrecoCompra.getValue()) <= 0) {
            JOptionPane.showMessageDialog(this, "Preço de compra inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecoCompra.requestFocus();
            return false;
        }
        if (((Double) ftfPrecoVenda.getValue()) <= 0) {
            JOptionPane.showMessageDialog(this, "Preço de venda inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecoVenda.requestFocus();
            return false;
        }
        if (((Double) ftfPrecoVenda.getValue()) <= ((Double) ftfPrecoCompra.getValue())) {
            JOptionPane.showMessageDialog(this, "Preço de venda menor que preço de compra.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfPrecoVenda.requestFocus();
            return false;
        }
        
        return true;
    }

    private void carregarGrade() {
        ProdutoTableModel tm = (ProdutoTableModel) tbGrade.getModel();
        try {
            tm.setDados(produtoDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfNome;
    private javax.swing.JFormattedTextField ftfPrecoCompra;
    private javax.swing.JFormattedTextField ftfPrecoVenda;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPrecoCompra;
    private javax.swing.JLabel lbPrecoVenda;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    // End of variables declaration//GEN-END:variables
}
