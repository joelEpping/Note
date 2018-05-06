package com.jdenner.gui.tm;

import com.jdenner.to.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * Clase que define el modelo para la tabla conteniendo datos del cliente
 *
 * @author Joel
 */
public class ClienteTableModel extends AbstractTableModel {

    private String colunas[] = {"Nombre", "Ci"};
    private List<Cliente> dados;

    @Override
    public int getRowCount() {
        if(dados == null){
            return 0;
        }
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
        Cliente cliente = dados.get(l);
        switch (c) {
            case 0:
                return cliente.getNombre();
            case 1:
                return cliente.getCi();
            default:
                throw new IndexOutOfBoundsException("Columna inexistente!");
        }
    }

    @Override
    public String getColumnName(int c) {
        return colunas[c];
    }

    @Override
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Cliente> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Cliente getRowValue(int l) {
        return dados.get(l);
    }
}
