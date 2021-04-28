package clases;
    /**
     * Incluye un metodo de clase que se une a los heredados
     * @author Jose
     * @version 2.0
     * @since 1.5
     */
public class Estudiante extends Persona{

	
	int i_Curso;
        /**
         * Constructor de la clase con los metodos edad, nombre y curso
         */
    	public Estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
        /**
         * Metodo que se encarga de sacar por pantalla una cadena de texto con los parametros del estudiante
         */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
        /**
         * Metodo que se encarga de preguntar un color
         * @return Devuelve un color
         */
	public String preguntacolor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
}
