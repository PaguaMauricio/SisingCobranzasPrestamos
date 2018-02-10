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
@Table(name="persona")
public class Persona implements Serializable{
    @Column(name="nombre")
    String nombre;
    
    @Id
    @Column(name="dni")
    int dni;
    
    @Column(name="fecha_nacimiento")
    Date fecha_nacimiento;
    
    public Persona(String nom, int p_dni, Date fecha_nacimiento){
        this.setNombre(nom);
        this.setDni(p_dni);
        this.setFecha_nacimiento(fecha_nacimiento);
    }
    
    //ACCESSORS
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    private void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    private void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
