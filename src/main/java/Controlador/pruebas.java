/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.HibernateUtil;
import Modelo.Direccion;
import Modelo.Persona;
import Modelo.Cliente;
import org.hibernate.Session;

/**
 *
 * @author pagua
 */
public class pruebas {
    public static void main(String[] args) {
        Direccion dir1 = new Direccion("Argentina", "Corrientes", "Localidad", "B Pirayini N, MZ E Cs 13");
        Persona p1 = new Persona(38235397, dir1, "Paniagua Mauricio", null, "20-38235397-9", null, null);
        Persona c1 = new Persona(26343234, dir1, "Fulana Conyuge", null, "20-23333397-9", null, null);
        Cliente cli1 = new Cliente(p1, null, null);
        cli1.setConyuge(26343234);
        p1.setCliente(cli1);
        
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.getTransaction().begin();
        sesion.saveOrUpdate(c1);
        sesion.saveOrUpdate(cli1);
        sesion.getTransaction().commit();
        sesion.close();
        
    }
}
