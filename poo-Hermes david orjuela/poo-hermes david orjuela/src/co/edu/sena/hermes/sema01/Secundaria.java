package co.edu.sena.hermes.sema01;

// Clase secundaria para Agencia de Viajes Corporativos "Travel Business"
public class Secundaria {

    private String nitEmpresa;
    private String nombreEmpresa;
    private String representante;
    private String correoContacto;
    private int viajesContratados;

    // Constructor
    public Secundaria(String nit, String nombre, String representante, String correo) {
        this.nitEmpresa = nit;
        this.nombreEmpresa = nombre;
        this.representante = representante;
        this.correoContacto = correo;
        this.viajesContratados = 0; // inicialmente sin viajes contratados
    }

    // Método 1: mostrar información del cliente
    public void mostrarInformacion() {
        System.out.println("=== CLIENTE CORPORATIVO ===");
        System.out.println("NIT: " + nitEmpresa);
        System.out.println("Empresa: " + nombreEmpresa);
        System.out.println("Representante: " + representante);
        System.out.println("Correo de contacto: " + correoContacto);
        System.out.println("Viajes contratados: " + viajesContratados);
    }

    // Método 2: registrar un nuevo viaje
    public void registrarViaje() {
        viajesContratados++;
        System.out.println("Se ha registrado un nuevo viaje para " + nombreEmpresa);
    }

    // Método 3: verificar si es cliente frecuente
    public boolean esClienteFrecuente() {
        return viajesContratados >= 5;
    }

    // Getter para nombre de empresa
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
}

