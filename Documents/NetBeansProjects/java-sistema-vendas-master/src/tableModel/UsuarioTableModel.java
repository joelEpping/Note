package tableModel;
import modelo.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do fornecedor
 *
 * @author Juliano
 */
public class UsuarioTableModel extends AbstractTableModel {

    private String colunas[] = {"nombre", "ci"};
    private List<Usuario> datos;

    @Override
    public int getRowCount() {
        if(datos == null){
            return 0;
        }
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int l, int c) {
       Usuario usuario = datos.get(l);
        switch (c) {
            case 0:
                return usuario.getNombre();
            case 1:
                return usuario.getCi();
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

    public void setDados(List<Usuario> dados) {
        this.datos = dados;
        fireTableDataChanged();
    }

    public Usuario getRowValue(int l) {
        return datos.get(l);
    }
}
