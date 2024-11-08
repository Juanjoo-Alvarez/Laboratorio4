// Main.java
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo() {}; // Usando una clase anónima para probar Vehiculo

        System.out.println(vehiculo.encender());
        vehiculo.ajustarTemperatura(25);
        vehiculo.ajustarVentilacion(2);
        vehiculo.activarModoEco();
        vehiculo.ventilacionDireccional("pies");
        System.out.println(vehiculo.encenderDesempanador());
        vehiculo.calefaccionRapida();
        vehiculo.programarMantenimiento("2024-11-08");

        // Ver historial
        String[] historial = vehiculo.verHistorial();
        System.out.println("Historial de acciones:");
        for (String accion : historial) {
            System.out.println(accion);
        }
    }
}
