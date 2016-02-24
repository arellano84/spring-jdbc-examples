package app.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.modelo.Personas;

public class MapPersonas  implements RowMapper<Personas>{

    public Personas mapRow(ResultSet rs, int i) throws SQLException {
    	Personas p = new Personas();
        p.setDni(rs.getString("DNI"));
        p.setNombre(rs.getString("NOMBRE"));
        p.setFecnac(rs.getDate("FECNAC"));
        p.setDir(rs.getString("DIR"));
        p.setTfno(rs.getInt("TFNO"));
    	
        return p;
    }

}
