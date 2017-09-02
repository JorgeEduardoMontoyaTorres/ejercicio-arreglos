/**
 * Clase Estudiante donde podras consultar y modificar los datos del objeto estudiante
 */
public class Estudiante
{
    private String nombre;
    private int clave;
    
    /**
     * Constructor:
     * Se inicializa las variables de instancia del objeto estudiante.
     * @param nombreIni Nombre del estudiante.
     * @param claveIni Clave unica del estudiante,
     */
    public Estudiante(String nombreIni, int claveIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    /**
     * Metodo de acceso para obtener la clave del estudiante.
     * @return Regresa la clave del estudiante
     */
    public int dimeLaClave()
    {
        return clave;
    }
    
    /**
     * Metodo de acceso para obtener los datos del estudiante, como lo son la clave y su nombre.
     * @return Datos como clave y nombre.
     */
    public String dimeDetalles()
    {
        return "Clave: " +clave+ ", Nombre: " +nombre;
    }
}