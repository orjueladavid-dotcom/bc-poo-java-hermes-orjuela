package co.edu.sena.hermes.sema01;

//PruebaAgenciaViajes
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN - AGENCIA TRAVEL BUSINESS ===\n");

        // Crear clientes corporativos
        Secundaria cliente1 = new Secundaria("900123456", "TechSolutions S.A.", "Laura Gómez", "contacto@techsolutions.com");
        Secundaria cliente2 = new Secundaria("901789012", "Constructora Andina", "Carlos Pérez", "ventas@andina.com");

        // Crear viajes corporativos
        ViajeCorporativo viaje1 = new ViajeCorporativo("VC001", "Madrid", "TechSolutions S.A.", 8, 3200.50);
        ViajeCorporativo viaje2 = new ViajeCorporativo("VC002", "Buenos Aires", "Constructora Andina", 12, 2800.75);

        // Mostrar información de los clientes
        System.out.println("--- CLIENTES CORPORATIVOS ---");
        cliente1.mostrarInformacion();
        System.out.println();
        cliente2.mostrarInformacion();

        // Registrar viajes para cada cliente
        System.out.println("\n--- REGISTRO DE VIAJES ---");
        cliente1.registrarViaje();
        cliente1.registrarViaje(); // Registrar más de uno para el mismo cliente
        cliente2.registrarViaje();

        // Verificar si son clientes frecuentes
        System.out.println("\n¿" + cliente1.getNombreEmpresa() + " es cliente frecuente?: " + cliente1.esClienteFrecuente());
        System.out.println("¿" + cliente2.getNombreEmpresa() + " es cliente frecuente?: " + cliente2.esClienteFrecuente());

        // Mostrar información de los viajes
        System.out.println("\n--- VIAJES CORPORATIVOS ---");
        viaje1.mostrarInformacion();
        System.out.println("Costo total del viaje: $" + viaje1.calcularCostoTotal());

        System.out.println();
        viaje2.mostrarInformacion();
        System.out.println("Costo total del viaje: $" + viaje2.calcularCostoTotal());

        // Confirmar un viaje
        System.out.println("\n--- ACTUALIZACIÓN DE ESTADO DE VIAJE ---");
        viaje1.setConfirmado(true);
        viaje1.mostrarInformacion();

        // Simular más viajes para cliente1 para volverlo “frecuente”
        cliente1.registrarViaje();
        cliente1.registrarViaje();
        cliente1.registrarViaje();
        System.out.println("\n¿" + cliente1.getNombreEmpresa() + " es cliente frecuente ahora?: " + cliente1.esClienteFrecuente());
    }
}

