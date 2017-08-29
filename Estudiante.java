public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(String nombreIni, int claveIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    public int dimeLaClave()
    {
        return clave;
    }
    
    public String dimeDetalles()
    {
        return "Clave: " +clave+ ", Nombre: " +nombre;
    }
}