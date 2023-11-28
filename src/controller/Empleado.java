
package controller;

public class Empleado {
    private String run, nombre, apellidoPaterno, apellidoMaterno,tipoEmpleado;
    private int telefono, tipoContrato;

    public Empleado() {
    }

    public Empleado(String run, String nombre, String apellidoPaterno, String apellidoMaterno, String tipoEmpleado, int telefono, int tipoContrato) {
        this.run = run;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoEmpleado = tipoEmpleado;
        this.telefono = telefono;
        this.tipoContrato = tipoContrato;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "\nEmpleado: " + "Run del Empleado: " + run + 
               "\nNombres del empleado: " + nombre + 
               "\nApellido Paterno del Empleado: " + apellidoPaterno + 
               "\nApellido Materno del Empleado: " + apellidoMaterno + 
               "\nTipo de Empleado: " + tipoEmpleado +
               "\nTelefono del Empleado: " + telefono +
	       "\ntipoContrato=" + tipoContrato;
    }

} 