package app.persistencia;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import app.modelo.Personas;

public class PersonasDAO {
	
    private JdbcTemplate template;
    private RowMapper<Personas> map;

    public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public RowMapper<Personas> getMap() {
		return map;
	}

	public void setMap(RowMapper<Personas> map) {
		this.map = map;
	}

	public List<Personas> mostrarTodos(){
        return template.query("select * from PERSONAS", map);
    }

    public Personas consultarPersonas(String dni){
        String sql = "select * from PERSONAS where DNI=?";
        return template.queryForObject(sql, new Object[] {dni}, map);
    }
    
    public void altaPersonas(Personas p){
        String sql = "insert into PERSONAS values (?,?,?,?,?)";
        template.update(sql,
                new Object[] {p.getDni(), p.getNombre(), p.getFecnac(), p.getDir(), p.getTfno()});

        // A partir de java 5 soporta el numero variable de argumentos
//        template.update(sql, p.getDni(), p.getNombre(), p.getFecnac(), p.getDir(), p.getTfno());
    }

}
