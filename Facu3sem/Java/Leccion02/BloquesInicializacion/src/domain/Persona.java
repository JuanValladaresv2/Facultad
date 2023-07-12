package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //Bloque de inicializacion estatico
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10 no es un atributo estatico por esto tenemos un error
    }
    
    { //Bloque de inicializacion NO estático(contexto dinámico)
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; // Incrementamos el atributo
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Esta es la ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
