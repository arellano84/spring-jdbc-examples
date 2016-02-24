package app.persistencia;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import app.modelo.Personas;

public class PersonasDao {

	 private NamedParameterJdbcTemplate plantilla;
	 private RowMapper<Personas> mapapersonas;
	 
	 public List<Personas> selectPersonas(){
		 String querysql="Select * from PERSONAS";
		 return plantilla.query(querysql, (Map<String,Object>)null, mapapersonas);
	 }
	 
	 public Personas buscaPersonas(String dni){
		 
		 String querysql="Select * from PERSONAS where dni= :dni";
		 
		 Map<String,Object> parametros = new HashMap<String, Object>();
		 parametros.put("dni", dni);
		 
		 return plantilla.queryForObject(querysql, parametros, mapapersonas);
	 }
	 
	 public void insertaPersonas(Personas personas){
		 
		 String querysql="insert into PERSONAS values(:dni,:nombre,:fecnac,:dir,:tfno)";
		 
		 Map<String,Object> parametros = new HashMap<String, Object>();
		 parametros.put("dni", personas.getDni());
		 parametros.put("nombre", personas.getNombre());
		 parametros.put("fecnac", personas.getFecnac());
		 parametros.put("dir", personas.getDir());
		 parametros.put("tfno", personas.getTfno());
		  
		 plantilla.update(querysql, parametros);
	 }
	 
	public NamedParameterJdbcTemplate getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(NamedParameterJdbcTemplate plantilla) {
		this.plantilla = plantilla;
	}
	public RowMapper<Personas> getMapapersonas() {
		return mapapersonas;
	}
	public void setMapapersonas(RowMapper<Personas> mapapersonas) {
		this.mapapersonas = mapapersonas;
	} 
}
