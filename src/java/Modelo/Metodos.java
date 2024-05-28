package Modelo;
import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Metodos {
    public static final int USUARIO_EXISTENTE = 1;
    public static final int CORREO_EXISTENTE = 2;
    public static final int ERROR_DESCONOCIDO = 3;
    
    public static int InsertarUsuario(usuarios x) {
        if (correoExistente(x.getEmail_usuario())) {
            return CORREO_EXISTENTE;
        }

        if (usuarioExistente(x.getNickname_usuario())) {
            return USUARIO_EXISTENTE;
        }

        Connection cn = conexion.Conectar();
        PreparedStatement ps = null;

        String sql = "insert into usuario (dni_usuario, nickname_usuario, nombres_usuario, ape_paterno_usuario, ape_materno_usuario, email_usuario, contrasena_usuario, telefono_usuario) VALUES (?,?,?,?,?)";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, x.getDni_usuario());
            ps.setString(2, x.getNickname_usuario());
            ps.setString(3, x.getNombres_usuario());
            ps.setString(4, x.getApe_paterno_usuario());
            ps.setString(5, x.getApe_materno_usuario());
            ps.setString(6, x.getEmail_usuario());
            ps.setString(7, x.getContrasena_usuario());
            ps.setString(8, x.getTelefono_usuario());
            ps.execute();
            cn.close();

            return 0; // Indica éxito
        } catch (Exception e) {
            System.out.println(e);
        }
        return ERROR_DESCONOCIDO;
    }
    
     public boolean actualizarContraseña(String email_usuario, String nuevaContraseña) {
        Connection cn = conexion.Conectar();
        PreparedStatement ps = null;

        String sql = "UPDATE usuarios SET contrasena_usuario = ? WHERE email_usuario = ?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, nuevaContraseña);
            ps.setString(2, email_usuario);
            int resultado = ps.executeUpdate();
            cn.close();

            return resultado > 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean Autenticacion(String Puser, String Ppsw) {

        Connection cn = conexion.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select nickname_usuario, contrasena_usuario from usuarios where nickname_usuario=? and contrasena_usuario=? ";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, Puser);
            ps.setString(2, Ppsw);
            rs = ps.executeQuery();

            while (rs.next()) {
                cn.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
     public static boolean correoExistente(String email_usuario) {
        Connection cn = conexion.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select email_usuario from usuarios where email_usuario=?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, email_usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                cn.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean usuarioExistente(String nickname_usuario) {
        Connection cn = conexion.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select nickname_usuario from usuarios where nickname_usuario=?";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, nickname_usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                cn.close();
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}