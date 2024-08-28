import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
/*
        Persona usuario = new Persona(); //creacion de objeto usuario de la clase persona

        Persona alumno1 = new Persona("Briyik", 17);

        Persona alumno2 = new Persona();
        alumno2.setName("Briyik");
        alumno2.setAge(18);

        System.out.println(alumno1.equals(alumno2));

        Persona egresado = new Persona("Carlos", 22);
        Persona profesor = new Persona("Santi", 50);

        Facultad facultad = new Facultad();
        facultad.setCodigo(getRandomCode());
        facultad.setNombre("FACI");

        profesor.setFacultad(facultad);
        System.out.println(profesor.saluda());
        System.out.println("Esta es la suma: " + alumno1.operacionLarga(3, 4));
        System.out.println(egresado.getName());

        // alumno.setName("Chirlei");
        // alumno1.name = "Chirlei";
       // alumno1.setAge(18);
        alumno1.setName("");
        alumno1.setCelular("987654321");
        //System.out.println(alumno1.saluda());
        //System.out.println("mayoría: "+ alumno1.isMayorEdad());

        String text = "GAPbsasjahfa";
        String valor1 = "ola";
        String valor2 = "ola";
        System.out.println(valor1.equals(valor2));


        System.out.println(facultad.getNombre());

        alumno1.setFacultad(facultad);
        System.out.println(alumno1.saluda());
        */

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        Persona persona1 = new Persona("Vriyik", 19);
        Persona persona2 = new Persona("Antonio", 22);
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.forEach(persona -> {
            System.out.println(persona.getName() +" "+ persona.getAge());
        });

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getName() + " " + persona.getAge());
            System.out.println("Lista personas");
        }
        Facultad sociales = new Facultad();

        HashMap<String, String> listaPersonasDNI = new HashMap<String, String>();
        listaPersonasDNI.put("Carlos", "12346758");
        listaPersonasDNI.put("Briyik", "85296374");
        System.out.println(listaPersonasDNI.containsValue("85296374"));
        listaPersonas.forEach(persona -> {
            boolean existe = false;
            if(persona.getDNI()=="85296374"){
                existe = true;
            }
            System.out.println(existe);
        });

    }

    public static String getRandomCode(){
        return Math.round(Math.random()*10000)+"A";
    }
}
