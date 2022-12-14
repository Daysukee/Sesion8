package tarea;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(){
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public int setEdad(){
        return edad;

    }

    public void getEdad(){
        this.edad = edad;
    }

    public void concentrarse(){
        System.out.println("Concentrarse (Clase Padre)");
    }
    public void viajar(){
        System.out.println("Viajar (Clase Padre)");
    }

    public void entrenar(){
        System.out.println("Entrenar (Clase Padre)");
    }

    public void jugarPartido(){
        System.out.println("Asiste al Partida de Fútbol (Clase Padre)");
    }
}
