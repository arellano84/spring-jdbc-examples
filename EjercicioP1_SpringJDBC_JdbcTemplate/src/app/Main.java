package app;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.negocio.NegocioPersonas;

public class Main {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");

		NegocioPersonas beanPersonas = (NegocioPersonas)
                                       contenedor.getBean("negocio");

		beanPersonas.consultarPersonas();
        System.out.println("-----------------------------");

        beanPersonas.buscarPersonas("1");
        System.out.println("-----------------------------");
        
        String source="10/11/2014";              
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date d= new java.sql.Date(format.parse(source).getTime());
        
        beanPersonas.insertarPersonas("5", "Jesus", d, "calle", 000000);
		
	}

}
