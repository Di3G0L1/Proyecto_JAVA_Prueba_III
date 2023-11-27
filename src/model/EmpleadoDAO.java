
package model;

import controller.Empleado;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
    //crear metodos customer para gestionar los empleados
    
    /**
     * metodo encargado de agregar emleados a la bbdd
     * @author Diego - Seba
     * @params Empleado
     */
    public boolean insertar(Empleado empleado){
        //creamos variable booleana para controlar el retorno
        boolean resultado = false;
        //creamos variable para manipular la query
        String query = "INSERT INTO EMPLEADO (RUT, NOMBRES, APELLIDO_PATERNO," +
                "APELLIDO_MATERNO, TIPO EMPLEADO, TELEFONO)" +
                "VALUES (?, ?, ?, ?, ?, ?)";
        
        //preparar query para evitar inyecciones sql
        try {
            PreparedStatement ps = ConexionDAO.getConnection().prepareStatement(query);
            int i = 1;
            ps.setString(i++, empleado.getRun());
            ps.setString(i++, empleado.getNombre());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setString(i++, empleado.getTipoEmpleado());
            ps.setInt(i++, empleado.getTelefono());
            ps.execute();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return resultado;
    }
    
    /**
     * metodo encargado de actualizar un Empleado
     * @params Empleado
     * @author Diego - Seba
     */
    public boolean actualizar(Empleado empleado){
        boolean resultado = false;
        String query = "UPDATE EMPLEADO SET NOMBRES = ?, " +
        "APELLIDO_PATERNO = ?, APELLIDO_MATERNO = ?, " +
        "TIPO EMPLEADO = ?, TELEFONO = ?" + 
        "WHERE RUN = ?";
        
        try {
            PreparedStatement ps = ConexionDAO.getConnection().prepareStatement(query);
            int i = 1;
            
            ps.setString(i++, empleado.getNombre());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setString(i++, empleado.getTipoEmpleado());
            ps.setInt(i++, empleado.getTelefono());
            ps.execute();
            resultado = true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    
    /**
     * metodo encargado de buscar un empleado por su rut
     * @author Diego - Seba
     * @params String run
     */
    public Empleado buscarPorRut(String rut){
        Empleado emp = null;
        
        String query = "SELECT RUN, NOMBRES, APELLIDO_PATERNO, " +
            "APELLIDO_MATERNO, TIPO_EMPLEADO, TELEFONO" +
            "FROM EMPLEADO WHERE RUT = ?";
                
        try {
            PreparedStatement ps = ConexionDAO.getConnection().prepareStatement(query);
            int i = 1;
            ps.setString(i++, rut);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //crear paciente
                emp = new Empleado();
                emp.setRun(rs.getString("RUN"));
                emp.setNombre(rs.getString("NOMBRES"));
                emp.setApellidoPaterno(rs.getString("APELLIDO_PATERNO"));
                emp.setApellidoMaterno(rs.getString("APELLIDO_MATERNO"));
                emp.setTipoEmpleado(rs.getString("TIPO_EMPLEADO"));
                emp.setTelefono(rs.getInt("TELEFONO"));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return emp;
    }
}
