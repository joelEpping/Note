package com.jdenner.gui;

import com.jdenner.dao.UsuarioDAO;
import com.jdenner.gui.tm.UsuarioTableModel;
import com.jdenner.to.Fornecedor;
import com.jdenner.to.Usuario;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * Janela de cadastro de fornecedor
 *
 * @author Juliano
 */
public class RegistroUsuario extends javax.swing.JInternalFrame {

    private Usuario usuario = null;
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public RegistroUsuario() {
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
        lbCnpj = new javax.swing.JLabel();
        ftfNombre = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ftfusuario = new javax.swing.JTextField();
        ftfcontra1 = new javax.swing.JPasswordField();
        ftfcontra2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        JcNivelAcceso = new javax.swing.JComboBox<>();
        ftfci = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registar usuarios");

        pnBarraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnBarraFerramentas.setOpaque(false);
        pnBarraFerramentas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        barraFerramentas.setFloatable(false);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/novo-foco.png"))); // NOI18N
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/salvar-foco.png"))); // NOI18N
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btSalvar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setFocusable(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/excluir-foco.png"))); // NOI18N
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btExcluir);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jdenner/gui/img/cancelar-foco.png"))); // NOI18N
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

        lbNome.setText("Nombre");

        lbCnpj.setText("Ci");

        ftfNombre.setColumns(25);

        jLabel1.setText("nivel de acceso");

        jLabel2.setText("usuario");

        jLabel3.setText("contraseña");

        ftfusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfusuarioActionPerformed(evt);
            }
        });

        ftfcontra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfcontra2ActionPerformed(evt);
            }
        });

        jLabel4.setText("repita contraseña");

        JcNivelAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vendedor", "administrador" }));
        JcNivelAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcNivelAccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lbNome)
                        .addGap(2, 2, 2)
                        .addComponent(ftfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnFormLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ftfcontra2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                                        .addComponent(lbCnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)))
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ftfci, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(ftfusuario)))
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(ftfcontra1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnFormLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(49, 49, 49)
                                        .addComponent(JcNivelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))))))
                .addGap(33, 33, 33))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbNome))
                    .addComponent(ftfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCnpj))
                    .addComponent(ftfci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(ftfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(ftfcontra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(ftfcontra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JcNivelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnConteudo.add(pnForm, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new com.jdenner.gui.tm.UsuarioTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        pnConteudo.add(spGrade, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnConteudo, java.awt.BorderLayout.CENTER);

        setBounds(10, 10, 405, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        usuario = new Usuario();
        habilitarFormulario(true);
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validarFormulario()) {
            usuario.setNombre(ftfNombre.getText().trim());
           usuario.setCi(Integer.valueOf(ftfci.getText().trim()));
           usuario.setPassword(ftfcontra1.getText());
           usuario.setUsername(ftfusuario.getText());
           if(JcNivelAcceso.getSelectedItem().toString().equals("vendedor")){
               usuario.setNivel_acceso(0);
           }else{usuario.setNivel_acceso(1);}
           

            if (usuario.getCodigo() == 0) {
                try {
                    usuarioDAO.insertar(usuario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao inserir o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    usuarioDAO.Modificar(usuario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
         btSalvar.setText("Guardar");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o fornecedor " + usuario + "?");
        if (opcao == 0) {
            try {
                usuarioDAO.eliminar(usuario);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o fornecedor.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            btSalvar.setText("Modificar");
            UsuarioTableModel tm = (UsuarioTableModel) tbGrade.getModel();
            usuario = tm.getRowValue(tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow()));

            ftfNombre.setValue(usuario.getNombre());
           ftfci.setText(String.valueOf(usuario.getCi()));
           ftfusuario.setText(usuario.getUsername());
           if(usuario.getNivel_acceso()==0){
               JcNivelAcceso.setSelectedItem("vendedor");
           }else if(usuario.getNivel_acceso()==1){
                JcNivelAcceso.setSelectedItem("administrador");
           }
           ftfcontra1.setText(usuario.getPassword());
           ftfcontra2.setText(usuario.getPassword());

            habilitarFormulario(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void JcNivelAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcNivelAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcNivelAccesoActionPerformed

    private void ftfcontra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfcontra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfcontra2ActionPerformed

    private void ftfusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfusuarioActionPerformed

    private void habilitarFormulario(boolean ativo) {
        btNovo.setEnabled(!ativo);
        btSalvar.setEnabled(ativo);
        btExcluir.setEnabled(ativo);
        btCancelar.setEnabled(ativo);
        ftfNombre.setEnabled(ativo);
        ftfcontra1.setEnabled(ativo);
        ftfcontra2.setEnabled(ativo);
        ftfusuario.setEnabled(ativo);
       JcNivelAcceso.setEnabled(ativo);
        ftfci.setEnabled(ativo);
        tbGrade.setEnabled(!ativo);

        if (!ativo) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        usuario = null;
        ftfNombre.setValue("");
        ftfci.setText("");
       ftfcontra1.setText("");
       ftfcontra2.setText("");
       ftfusuario.setText("");
   
       
    }

    private boolean validarFormulario() {
        if (ftfNombre.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nombre inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfNombre.requestFocus();
            return false;
        }
        if (ftfci.getText().trim().length() != 7) {
            JOptionPane.showMessageDialog(this, "ci inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfci.requestFocus();
            return false;
        }
        
        if(!Arrays.equals(ftfcontra1.getPassword(), ftfcontra2.getPassword())){
            JOptionPane.showMessageDialog(this, "las contraseñas no coinciden.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfcontra1.requestFocus();
            return false;
        }
        
        if(ftfusuario.getText().trim().length()<4 ){
            JOptionPane.showMessageDialog(this, "usuario minimo debe tener 8 caracteres.", "Alerta", JOptionPane.WARNING_MESSAGE);
            ftfusuario.requestFocus();
            return false;
        }
        return true;
    }

    private void carregarGrade() {
        UsuarioTableModel tm = (UsuarioTableModel) tbGrade.getModel();
        try {
            tm.setDados(usuarioDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcNivelAcceso;
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfNombre;
    private javax.swing.JTextField ftfci;
    private javax.swing.JPasswordField ftfcontra1;
    private javax.swing.JPasswordField ftfcontra2;
    private javax.swing.JTextField ftfusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnBarraFerramentas;
    private javax.swing.JPanel pnConteudo;
    private javax.swing.JPanel pnForm;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    // End of variables declaration//GEN-END:variables
}
