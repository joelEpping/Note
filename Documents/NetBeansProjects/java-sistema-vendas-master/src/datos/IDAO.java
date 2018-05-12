package datos;

import java.util.ArrayList;

/**
 * Interface para classes de acesso a dados
 *
 * @author Juliano
 */
public interface IDAO<Tipo> {

    public void insertar(Tipo objeto) throws Exception;

    public void Modificar(Tipo objeto) throws Exception;

    public void eliminar(Tipo objeto) throws Exception;

    public ArrayList<Tipo> listarTodos() throws Exception;

    public Tipo recuperar(int codigo) throws Exception;
}
