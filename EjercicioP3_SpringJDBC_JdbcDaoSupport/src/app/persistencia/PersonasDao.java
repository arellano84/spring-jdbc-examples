package app.persistencia;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import app.modelo.Personas;

public class PersonasDao extends JdbcDaoSupport{
	
	 private RowMapper<Personas> mapapersonas;
	 
	 public List<Personas> selectPersonas(){
		 
		 String querysql="Select * from PERSONAS";
		 return getJdbcTemplate().query(querysql,  mapapersonas);
	 }
	 
	 public Personas buscaPersonas(String dni){
		 
		 String querysql="Select * from PERSONAS where dni= ?";
		 return getJdbcTemplate().queryForObject(querysql, new Object[] {dni}, mapapersonas);
	 }
	 
	 public void insertaPersonas(Personas personas){
		 
		 String querysql="insert into PERSONAS values(?,?,?,?,?)";
		 getJdbcTemplate().update(querysql, personas.getDni(), personas.getNombre(), personas.getFecnac(), personas.getDir(), personas.getTfno());
	 }
	 
	public RowMapper<Personas> getMapapersonas() {
		return mapapersonas;
	}
	public void setMapapersonas(RowMapper<Personas> mapapersonas) {
		this.mapapersonas = mapapersonas;
	} 
}
