package app.persistencia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import app.modelo.Personas;

public class PersonasDao {

	 private JdbcTemplate plantilla;
	 private RowMapper<Personas> mapapersonas;
	 
	 public List<Personas> selectPersonas(){
		 
		 String querysql="Select * from PERSONAS";
		 return plantilla.query(querysql,  mapapersonas);
	 }
	 
	 public Personas buscaPersonas(String dni){
		 
		 String querysql="Select * from PERSONAS where dni= ?";
		 return plantilla.queryForObject(querysql, new Object[] {dni}, mapapersonas);
	 }
	 
	 public void insertaPersonas(Personas personas){
		 
		 String querysql="insert into PERSONAS values(?,?,?,?,?)";
		 plantilla.update(querysql, personas.getDni(), personas.getNombre(), personas.getFecnac(), personas.getDir(), personas.getTfno());
	 }

	public JdbcTemplate getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(JdbcTemplate plantilla) {
		this.plantilla = plantilla;
	}
	public RowMapper<Personas> getMapapersonas() {
		return mapapersonas;
	}
	public void setMapapersonas(RowMapper<Personas> mapapersonas) {
		this.mapapersonas = mapapersonas;
	} 
}
