package clases;
/**
 * Esta clase tiene un metodo de preguntar al estudiante por el color y contiene un constructor
 * @author Jose
 * @version 2.0
 * @since 1.5
 */
public class Profesor  extends Persona{
        /**
         * Este es el constructor de la clase profesor y esta vacio
         */
    	public Profesor() {}			
        /**
         * Este metodo hace la pregunta al estudiante sobre el color
         * @return retorna un color
         */
    	public String preguntacolor(){
		Estudiante alumno = new Estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}
