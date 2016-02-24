package app;

import java.text.SimpleDateFormat;
import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.negocio.NegocioPersonas;

public class Main {

	public static void main(String[] args) throws Exception{
		
		System.out.println("EjercicioP2_SpringJDBC_NameParameterJdbcTemplate");
		
		ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");
		
		NegocioPersonas negociopersonas = (NegocioPersonas) contenedor.getBean("negocioPersonas");
		negociopersonas.damePersonas();
		System.out.println("-----------------------------------------");
		negociopersonas.buscaPersonas("1");
		System.out.println("-----------------------------------------");
		 String source="10/11/2014";              
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date d= new java.sql.Date(format.parse(source).getTime());
		negociopersonas.agregaPersonas("23", "Luis", d, "Paseo", 999);
		System.out.println("-----------------------------------------");
	}

}
