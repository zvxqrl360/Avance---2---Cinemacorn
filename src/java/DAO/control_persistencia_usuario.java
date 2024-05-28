/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.usuarios;

/**
 *
 * @author USER
 */
public class control_persistencia_usuario {
    
    usuariosJpaController registrojpa = new usuariosJpaController();
    
    public void crear_registro(usuarios usu) {
        registrojpa.create(usu);
    }
    
}
