# spring-jdbc-examples
Ejemplos de Spring JDBC.


EJERCICIO 1

Se pretende realizar una aplicación en Java capaz de gestionar la información de un censo de personas almacenadas en una tabla Personas de una base de datos Censo cuya estructura es la siguiente (entre paréntesis se representa el nombre de la columna):
	1. DNI: String (DNI).
	2. Nombre: String (NOMBRE).
	3. Fecha Nacimiento: Fecha (FECNAC).
	4. Dirección: String (DIR).
	5. Teléfono: int (TFNO)
La aplicación tiene que ser capaz de realizar las tareas de alta, baja, modificación y consulta de los datos de las personas del censo.
Realizarlo con Spring JDBC JdbcTemplate


EJERCICIO 2

Realizar el ejercicio anterior utilizando Spring JDBC NamedParametersJdbcTemplate


EJERCICIO 3

Rehacer el ejercicio 1 con JdbcDaoSupport


EJERCICIO 4

Rehacer el ejercicio 2 NamedParameterJdbcDaoSupport
