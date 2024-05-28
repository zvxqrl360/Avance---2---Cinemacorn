/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.control_persistencia_usuario;
import Modelo.usuarios;

/**
 *
 * @author USER
 */
public class controlador_registro {
    
    control_persistencia_usuario ctrlregistro = new control_persistencia_usuario();
    
    void crear_registro(usuarios usu) {
        ctrlregistro.crear_registro(usu);
    }
    
}
