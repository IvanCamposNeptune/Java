package clases;

public class Persona implements Comparable<Persona>
{
    //Atributos
    private String nombre, apellido;
    private Integer id;
    //Metodos
    public Persona(String nombre, String apellido, Integer id)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + '}' + "\n";
    }

    @Override
    public int compareTo(Persona t) //Metodo de ordenacion
    {
        return id.compareTo(t.getId()); //Ordena con respecto al Id los objetos de la clase Persona
    }
        
        
        
}
