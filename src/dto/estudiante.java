/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Timestamp;

/**
 *
 * @author giovanny
 */
public class estudiante 
{
    private Integer documento;
    private String codigo;
    private String nombres;
    private String correo;
    private String universidad;
    private String carrera;
    private String semestre;
    private String facultad;
    private String carnet;
    private String telefono;
    private String promedio_año;
    private String estado;
    private String tipo_subsidio;
    private String ciudad;
    private String institucion_graduado;
    private String sisben;
    private String año_ingreso_programa;
    private Timestamp fecha;
    private Integer usuarios_id;
    private String modifico;

    public String getModifico() {
        return modifico;
    }

    public void setModifico(String modifico) {
        this.modifico = modifico;
    }

    public Integer getUsuarios_id() {
        return usuarios_id;
    }

    public void setUsuarios_id(Integer usuarios_id) {
        this.usuarios_id = usuarios_id;
    }

    public estudiante() 
    {
        
    }

    public estudiante(Integer documento, String codigo, String nombres, String correo, String universidad, String carrera, String semestre, String facultad, String carnet, String telefono, String promedio_año, String estado, String tipo_subsidio, String ciudad, String institucion_graduado, String sisben, String año_ingreso_programa, Timestamp fecha, Integer usuarios_id, String modifico) {
        this.documento = documento;
        this.codigo = codigo;
        this.nombres = nombres;
        this.correo = correo;
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
        this.facultad = facultad;
        this.carnet = carnet;
        this.telefono = telefono;
        this.promedio_año = promedio_año;
        this.estado = estado;
        this.tipo_subsidio = tipo_subsidio;
        this.ciudad = ciudad;
        this.institucion_graduado = institucion_graduado;
        this.sisben = sisben;
        this.año_ingreso_programa = año_ingreso_programa;
        this.fecha = fecha;
        this.usuarios_id = usuarios_id;
        this.modifico = modifico;
    }

    public estudiante(Integer documento) {
        this.documento = documento;
    }
    

    

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPromedio_año() {
        return promedio_año;
    }

    public void setPromedio_año(String promedio_año) {
        this.promedio_año = promedio_año;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_subsidio() {
        return tipo_subsidio;
    }

    public void setTipo_subsidio(String tipo_subsidio) {
        this.tipo_subsidio = tipo_subsidio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getInstitucion_graduado() {
        return institucion_graduado;
    }

    public void setInstitucion_graduado(String institucion_graduado) {
        this.institucion_graduado = institucion_graduado;
    }

    public String getSisben() {
        return sisben;
    }

    public void setSisben(String sisben) {
        this.sisben = sisben;
    }

    public String getAño_ingreso_programa() {
        return año_ingreso_programa;
    }

    public void setAño_ingreso_programa(String año_ingreso_programa) {
        this.año_ingreso_programa = año_ingreso_programa;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
}
