/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pagua
 */
@Entity
@Table(name="cliente")
public class Cliente extends Persona implements Serializable{
    //RevisarESTO!!!!!!!!!!
    Persona conyuge;
    @Column(name="conyuge")
    private int conyuge_dni = this.getConyuge().getDni(); 
    @Id
    @Column(name="id_cliente")
    private int id_cliente;
    
    public Cliente(String nom, int p_dni, Date fecha_nacimiento, Persona conyuge){
        super(nom,  p_dni, fecha_nacimiento);
        this.setConyuge(conyuge);
    }

    public Persona getConyuge() {
        return conyuge;
    }

    private void setConyuge(Persona conyuge) {
        this.conyuge = conyuge;
    }
    
}
