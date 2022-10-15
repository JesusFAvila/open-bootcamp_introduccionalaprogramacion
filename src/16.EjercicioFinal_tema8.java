public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Jesús Fernández");
        persona.setTelefono(958689980);
        System.out.println("La persona tiene: "+ persona.getEdad() + " años, se llama: " + persona.getNombre() + " y su número de teléfono es:" +persona.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

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

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }


}
