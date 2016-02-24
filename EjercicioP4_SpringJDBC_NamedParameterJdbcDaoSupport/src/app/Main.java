package app;

import java.text.SimpleDateFormat;
import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.negocio.NegocioPersonas;

public class Main {

	public static void main(String[] args) throws Exception{
		
		System.out.println("EjercicioP4_SpringJDBC_NamedParameterJdbcDaoSupport");
		
		ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");
		
		NegocioPersonas negociopersonas = (NegocioPersonas) contenedor.getBean("negocioPersonas");
		negociopersonas.damePersonas();
		System.out.println("-----------------------------------------");
		negociopersonas.buscaPersonas("1");
		System.out.println("-----------------------------------------");
		 String source="11/11/2014";              
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date d= new java.sql.Date(format.parse(source).getTime());
		negociopersonas.agregaPersonas("18", "Luis", d, "Canal", 6666);
		System.out.println("-----------------------------------------");
	}

}
