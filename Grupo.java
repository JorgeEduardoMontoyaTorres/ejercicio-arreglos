public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nombMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nombMateria; //this.  se refiere a la variable de instancia
    }
    
    //Terminar este metodo con el FOR de tarea
    public void inscribir(Estudiante unEstudiante)
    {
        for(int i = 0; i < estudiantes.length; i+=1)
        {
                if(estudiantes[i] == null)
                {
                    estudiantes[i] = unEstudiante;
                    i=estudiantes.length+1;
                }
        }
    }
    
    //hacer otro metodo: daDeBaja(int claveEstudiante) de tarea.
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