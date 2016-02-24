package app.negocio;

import java.sql.Date;

import app.modelo.Personas;
import app.persistencia.PersonasDAO;

public class NegocioPersonas {

	private PersonasDAO dao;

    public void consultarPersonas(){
        for(Personas p : dao.mostrarTodos())
            System.out.println(p);
    }

    public void buscarPersonas(String dni){
        System.out.println(dao.consultarPersonas(dni));
    }

    public void insertarPersonas(String dni, String nombre, Date fecnac, String dir, int tfno){
        dao.altaPersonas(new Personas(dni, nombre, fecnac, dir, tfno));
        System.out.println("Persona insertada");
    }
    
    public PersonasDAO getDao() {
        return dao;
    }

    public void setDao(PersonasDAO dao) {
        this.dao = dao;
    }

}
