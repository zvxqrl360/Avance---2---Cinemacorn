package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String dni_usuario;
    private String nickname_usuario;
    private String nombres_usuario;
    private String ape_paterno_usuario;
    private String ape_materno_usuario;
    private String email_usuario;
    private String contrasena_usuario;
    private String telefono_usuario;
    
    
    
    

    public String getNickname_usuario() {
        return nickname_usuario;
    }

    public void setNickname_usuario(String nickname_usuario) {
        this.nickname_usuario = nickname_usuario;
    }

    public String getNombres_usuario() {
        return nombres_usuario;
    }

    public void setNombres_usuario(String nombres_usuario) {
        this.nombres_usuario = nombres_usuario;
    }

    public String getApe_paterno_usuario() {
        return ape_paterno_usuario;
    }

    public void setApe_paterno_usuario(String ape_paterno_usuario) {
        this.ape_paterno_usuario = ape_paterno_usuario;
    }

    public String getApe_materno_usuario() {
        return ape_materno_usuario;
    }

    public void setApe_materno_usuario(String ape_materno_usuario) {
        this.ape_materno_usuario = ape_materno_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }
    

    
       
       
    
}
