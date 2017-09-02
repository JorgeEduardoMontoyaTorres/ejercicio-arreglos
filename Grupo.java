/**
 * Clase Grupo, donde el objeto grupo almacenara los objetos estudiantes.
 */
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /**
     * Costructor:
     * Inicializa las variables de instancia.
     * @param totalEstudiantes Numero total de los estudiantes en el grupo.
     * @param nombMateria Nombre asignado a la materia.
     */
    public Grupo(int totalEstudiantes, String nombMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nombMateria; //this.  se refiere a la variable de instancia
    }
    
    /**
     * Busca un estudiante por medio de la clave.
     * @param claveEstudiante parametro que representa la clave del estudiante a buscar.
     * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if(estudiantes[i].dimeLaClave() == claveEstudiante)
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca un espacio disponible en el arreglo.
     * @return Regresa la primer posicion nula dentro del arreglo.
     */
    private int buscarEspacioDisponible()
    {
        for(int i = 0; i < estudiantes.length; i+=1)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    //Terminar este metodo con el FOR de tarea
    /**
     * Inscribe un estudiante en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante ya fue inscrito o falso en caso de que no se pudiera inscribir .
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
            int existe = this.buscarEstudiante(unEstudiante.dimeLaClave());
                
                if(existe != -1)
                {
                    return false; //El estudiante ya esta inscrito.
                }
            
            int posDisponible = this.buscarEspacioDisponible();
            
                if(posDisponible == -1)
                {
                    return false; //El arreglo ya esta lleno.
                }
                
                estudiantes[posDisponible] = unEstudiante;
                return true; //El estudiante fue inscrito.
    }
    
    //hacer otro metodo: daDeBaja(int claveEstudiante) de tarea.
    /**
     * Se da de baja al alumo del grupo y de la materia.
     * @param claveEstudiante Entra la clave del estudiante que se desea dar de baja.
     */
    public void darDeBaja(int claveEstudiante)
    {
        //Buscar el estudiante con la clave y asignarle un null
        for(int i=0; i < estudiantes.length; i++)
        {
            if(estudiantes[i].dimeLaClave() == claveEstudiante)
            {
                estudiantes[i] = null;
            }
        }
    }
}