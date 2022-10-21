package tarea.main;

import tarea.Entrenador;
import tarea.Futbolista;
import tarea.Masajista;
import tarea.SeleccionFutbol;

public class Main {

    public static void main(String[] args){
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol  raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        //CONCENTRACION
        System.out.print(delBosque.getNombre() + "" + delBosque.getApellidos() + " -> "); delBosque.concentrarse();
        System.out.print(iniesta.getNombre() + "" + iniesta.getApellidos() + " -> "); iniesta.concentrarse();
        System.out.print(raulMartinez.getNombre() + "" + raulMartinez.getApellidos() + " -> "); raulMartinez.concentrarse();
        //VIAJE
        System.out.print(delBosque.getNombre() + "" + delBosque.getApellidos() + " -> ");delBosque.viajar();
        System.out.print(iniesta.getNombre() + "" + iniesta.getApellidos() + " -> ");iniesta.viajar();
        System.out.print(raulMartinez.getNombre() + "" + raulMartinez.getApellidos() + " -> ");raulMartinez.viajar();

        //ENTRENAMIENTO

        System.out.print("\bPartido de Fútbol: Todos los itegrantes tiene su función en un entrenamiento (Especialización)");
        System.out.print(delBosque.getNombre() + "" + delBosque.getApellidos() + " -> ");delBosque.entrenar();
        System.out.print(iniesta.getNombre() + "" + iniesta.getApellidos() + " -> ");iniesta.entrenar();
        System.out.print(raulMartinez.getNombre() + "" + raulMartinez.getApellidos() + " -> ");raulMartinez.entrenar();

        //PARTIDO DE FUTBOL

        System.out.print("\nParitod de Fútbol: Todos lo integrantes tienen su función en un partido (Especialización)");
        System.out.print(delBosque.getNombre() + "" + delBosque + " -> ");delBosque.jugarPartido();
        System.out.print(iniesta.getNombre() + "" + iniesta + " -> ");iniesta.jugarPartido();
        System.out.print(raulMartinez.getNombre() + "" + raulMartinez +  " -> ");raulMartinez.jugarPartido();

        //PLANIIFICAR ENTRENAMIENTO
        System.out.print("\nPlanificar Entrenamiento: Solo el entrenador tiene el mét odo para planificar un entrenamiento:");
        System.out.print(delBosque.getNombre() + "" + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

        //ENTREVISTA
        System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

        //MASAJE
        System.out.print("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + "" + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();
    }
}
