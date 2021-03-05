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
public class EmpleadoDAO implements IDAO<Empleado> {

    private ConexionDB con;
    private ResultSet rs;
    private PreparedStatement sentencia;
    Empleado emple = new Empleado();

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean ingresar(Empleado pojo) {
        String insert = "INSERT INTO empleados (id,nombre,direccion,telefono) VALUES (?,?,?,?)";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, pojo.getId());
            sentencia.setString(2, pojo.getNombre());
            sentencia.setString(3, pojo.getDireccion());
            sentencia.setString(4, pojo.getTelefono());
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean actualizar(Empleado pojo) {
        String insert = "UPDATE empleados SET nombre=?, direccion=?, telefono=? WHERE id=?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, pojo.getNombre());
            sentencia.setString(2, pojo.getDireccion());
            sentencia.setString(3, pojo.getTelefono());
            sentencia.setString(4, pojo.getId());
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        String insert = "DELETE FROM empleados WHERE id=?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, id);
            sentencia.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Empleado mostrarById(String id) {
        String insert = "SELECT * FROM empleados WHERE id =?";
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            sentencia.setString(1, id);
            rs = sentencia.executeQuery();
            if (rs.next()) {
                Empleado p = new Empleado();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setDireccion(rs.getString(3));
                p.setTelefono(rs.getString(4));
                emple = p;
            } else {

                emple = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emple;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Empleado> mostrarAll() {
        String insert = "SELECT * FROM empleados ORDER BY id";
        List<Empleado> lista = new ArrayList<>();
        try {
            sentencia=con.getInstance().getConnection().prepareStatement(insert);
            rs = sentencia.executeQuery();
            while (rs.next()) {
                Empleado p = new Empleado();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setDireccion(rs.getString(3));
                p.setTelefono(rs.getString(4));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
