package vista;

import datos.ClienteDAO;
import tableModel.ClienteTableModel;
import modelo.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Janela de cadastro de cliente
 *
 * @author Juliano
 */
public class RegistroCliente extends javax.swing.JInternalFrame {

    private Cliente cliente = null;
    private ClienteDAO clienteDAO = new ClienteDAO();

    public RegistroCliente() {
        initComponents();
        habilitarFormulario(false);
        cargarTabla();
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
        lbCpf = new javax.swing.JLabel();
        lbDataNascimento = new javax.swing.JLabel();
        ftfNome = new javax.swing.JFormattedTextField();
        ftfDataNascimento = new javax.swing.JFormattedTextField();
        ftfci = new javax.swing.JFormattedTextField();
        lbCpf1 = new javax.swing.JLabel();
        ftftelefono = new javax.swing.JFormattedTextField();
        lbCpf2 = new javax.swing.JLabel();
        ftfcorreo = new javax.swing.JFormattedTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de clientes");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setOpaque(false);
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/novo-foco.png"))); // NOI18N
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

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar-foco.png"))); // NOI18N
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

        pnForm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0), javax.swing.BorderFactory.createTitledBorder(null, "Formulário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 153, 255)))); // NOI18N
        pnForm.setOpaque(false);

        lbNome.setText("nombre");

        lbCpf.setText("C.i");

        lbDataNascimento.setText("Feccha nac.");

        ftfNome.setColumns(25);

        ftfDataNascimento.setColumns(10);
        ftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfDataNascimento.setValue(new Date());

        ftfci.setColumns(25);

        lbCpf1.setText("Telefono");

        ftftelefono.setColumns(25);
        ftftelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftftelefonoActionPerformed(evt);
            }
        });

        lbCpf2.setText("Correo");

        ftfcorreo.setColumns(25);
        ftfcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfcorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpf)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addGap(18, 18, 18)
                                .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addComponent(lbCpf2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ftfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCpf1)
                                    .addComponent(lbDataNascimento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftfci, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(ftfci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpf2)))
        );

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ClienteTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addComponent(spGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConteudoLayout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 405, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        cliente = new Cliente();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            cliente.setNombre(ftfNome.getText().trim());
            cliente.setCi(ftfci.getText().trim());
            cliente.setNacimiento((Date) ftfDataNascimento.getValue());
            cliente.setTelefono(ftftelefono.getText());
            cliente.setCorreo(ftfcorreo.getText());

            if (cliente.getCodigo() == 0) {
                try {
                    clienteDAO.insertar(cliente);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    clienteDAO.Modificar(cliente);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            cargarTabla();
        }
        btSalvar.setText("Guardar");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o cliente " + cliente + "?");
        if (opcao == 0) {
            try {
                clienteDAO.eliminar(cliente);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            cargarTabla();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            btSalvar.setText("modificar");
            ClienteTableModel tm = (ClienteTableModel) tbGrade.getModel();
            cliente = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNome.setValue(cliente.getNombre());
            ftfci.setValue(cliente.getCi());
            ftfDataNascimento.setValue(cliente.getNacimiento());
            ftfcorreo.setText(cliente.getCorreo());
            ftftelefono.setText(cliente.getTelefono());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void ftftelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftftelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftftelefonoActionPerformed

    private void ftfcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfcorreoActionPerformed

    private void habilitarFormulario(boolean ativo) {
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNome.setEnabled(ativo);
        ftfci.setEnabled(ativo);
        ftfDataNascimento.setEnabled(ativo);
        tbGrade.setEnabled(!ativo);
        ftftelefono.setEnabled(ativo);
        ftfcorreo.setEnabled(ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        cliente = null;
        ftfNome.setValue("");
        ftfci.setValue("");
        ftfDataNascimento.setValue(new Date());
        ftfcorreo.setText("");
        ftftelefono.setText("");
    }

    private boolean validarFormulario() {
        if (ftfNome.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nombre inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNome.requestFocus();
            return false;
        }
        if (ftfci.getText().trim().length() < 7) {
            JOptionPane.showMessageDialog(this, "Cedula inválida.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfci.requestFocus();
            return false;
        }
        if (((Date) ftfDataNascimento.getValue()).after(new Date())) {
            JOptionPane.showMessageDialog(this, "Fecha de nacimiento inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfDataNascimento.requestFocus();
            return false;
        }
        return true;
    }

    private void cargarTabla() {
        ClienteTableModel tm = (ClienteTableModel) tbGrade.getModel();
        try {
            tm.setDados(clienteDAO.listarTodos());
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
    private javax.swing.JFormattedTextField ftfDataNascimento;
    private javax.swing.JFormattedTextField ftfNome;
    private javax.swing.JFormattedTextField ftfci;
    private javax.swing.JFormattedTextField ftfcorreo;
    private javax.swing.JFormattedTextField ftftelefono;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbCpf1;
    private javax.swing.JLabel lbCpf2;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    // End of variables declaration//GEN-END:variables
}
