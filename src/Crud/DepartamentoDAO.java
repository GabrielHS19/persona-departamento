package Crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielhs
 */
public class DepartamentoDAO implements IDAO<Departamento> {

    private ConexionDB con;
    private ResultSet rs;
    private PreparedStatement sentencia;
    Departamento depa = new Departamento();

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean ingresar(Departamento pojo) {
        String insert = "INSERT INTO departamentos (id,nombre) VALUES (?,?)";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, pojo.getId());
            sentencia.setString(2, pojo.getNombre());
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean actualizar(Departamento pojo) {
        String insert = "UPDATE departamentos SET nombre=? WHERE id=?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, pojo.getNombre());
            sentencia.setString(2, pojo.getId());
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public boolean eliminar(String id) {
        String insert = "DELETE FROM departamentos WHERE id=?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, id);
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Departamento mostrarById(String id) {
        String insert = "SELECT * FROM departamentos WHERE id =?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, id);
            rs = sentencia.executeQuery();
            if (rs.next()) {
                Departamento p = new Departamento();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
                depa = p;
            } else {

                depa = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depa;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Departamento> mostrarAll() {
        String insert = "SELECT * FROM departamentos ORDER BY id";
        List<Departamento> lista = new ArrayList<>();
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            rs = sentencia.executeQuery();
            while (rs.next()) {
                Departamento p = new Departamento();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
  
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
