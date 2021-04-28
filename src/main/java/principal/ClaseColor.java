package principal;
import clases.Profesor;
/**
 * Clase color, el profesor pregunta a un alumno por un color entre (rojo, amarillo y verde)
 * @author Jose
 * @version 2.0
 * @since 1.5
 */
public class ClaseColor {
    /**
     * Metodo main que se encarga crear objetos, llamar a metodos etc.
     * @param args es el encargado de recoger y almacenar estos valores 
     */
    public static void main(String[] args) {
	Profesor teacher = new Profesor();
	String color = teacher.preguntacolor();
	System.out.println("La respuesta recibida es:" + color);
	} 
}
