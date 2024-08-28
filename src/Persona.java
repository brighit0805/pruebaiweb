public class Persona {

    // ATRIBUTOS
    private String name;
    private int age;
    private String estadoCivil = "Soltero";
    private String celular;
    private boolean mayorEdad;
    private Facultad facultad;
    private String DNI;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = "+51"+ celular;
    }

    // MÉTODOS
    String saluda(){
        return "Hola, soy "+this.name+" y tengo "+ this.age +" años, y mi celular es: "+
                this.celular+" y soy de "+this.facultad.getNombre() + " y soy "+this.estadoCivil;
    }

    int operacionLarga(int a, int b){
        return a+b + multiplique(a,b);
    }

    int multiplique(int a, int b){
        return a*b;
    }


    // GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int  getAge() {
        return age;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setAge(int age) {
        this.age = age;
        if(age>=18){
            this.mayorEdad = true;
        }else{
            this.mayorEdad = false;
        }
    }


    // CONSTRUCTORES
    // CON PARAMETROS
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
        if(age>=18){
            this.mayorEdad = true;
        }else{
            this.mayorEdad = false;
        }
    }
    // DEFAULT
    public Persona() {
    }
}
