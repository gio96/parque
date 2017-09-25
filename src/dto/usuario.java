/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author giovanny
 */
public class usuario 
{   

    public usuario() {
    }

    public usuario(Integer id, String nombre, Integer permiso) {
        this.id = id;
        this.nombre = nombre;
        this.permiso = permiso;
    }
    
    static private Integer id;
    static private String nombre;
    private String contrasena;
    private Integer permiso;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        usuario.id = id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        usuario.nombre = nombre;
    }


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getPermiso() {
        return permiso;
    }

    public void setPermiso(Integer permiso) {
        this.permiso = permiso;
    }
    
}
