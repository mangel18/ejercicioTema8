public class Main {
    public static void main(String[] args) {

    Persona persona = new Persona();
    persona.setEdad(18);
    persona.setNombre("Miguel Patiño");
    persona.setTelefono("8331802204");

    System.out.println(persona.getEdad());
    System.out.println(persona.getNombre());
    System.out.println(persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }


}