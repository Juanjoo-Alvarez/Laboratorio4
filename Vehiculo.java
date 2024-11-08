// Vehiculo.java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Vehiculo implements IClimaB {
    protected boolean encendido;
    protected double temperatura;
    protected int intensidadVentilacion;
    protected String direccionVentilacion;
    protected boolean modoEco;
    protected int asientosDelanteros;
    protected int asientosTraseros;
    protected boolean desempanador;
    protected List<String> historial;
    protected Date citaMantenimiento;

    public Vehiculo() {
        this.encendido = false;
        this.temperatura = 22.0;  // Temperatura inicial
        this.intensidadVentilacion = 1;
        this.direccionVentilacion = "frontal";
        this.modoEco = false;
        this.asientosDelanteros = 2;
        this.asientosTraseros = 3;
        this.desempanador = false;
        this.historial = new ArrayList<>();
    }

    @Override
    public String encender() {
        encendido = true;
        historial.add("Sistema encendido");
        return "Sistema de climatización encendido.";
    }

    @Override
    public String apagar() {
        encendido = false;
        historial.add("Sistema apagado");
        return "Sistema de climatización apagado.";
    }

    @Override
    public double ajustarTemperatura(int temperatura) {
        this.temperatura = temperatura;
        historial.add("Temperatura ajustada a " + temperatura + "°C");
        return this.temperatura;
    }

    @Override
    public double modoAutomatico(int temperaturaAmbiente) {
        this.temperatura = temperaturaAmbiente <= 18 ? 24 : 20;  // Ajuste ejemplo
        historial.add("Modo automático ajustado a " + this.temperatura + "°C");
        return this.temperatura;
    }

    @Override
    public int ajustarVentilacion(int intensidadVentilacion) {
        if (intensidadVentilacion >= 1 && intensidadVentilacion <= 3) {
            this.intensidadVentilacion = intensidadVentilacion;
            historial.add("Intensidad de ventilación ajustada a nivel " + intensidadVentilacion);
        } else {
            historial.add("Error: Intensidad de ventilación fuera de rango.");
        }
        return this.intensidadVentilacion;
    }

    @Override
    public void activarModoEco() {
        modoEco = !modoEco;
        historial.add("Modo Eco " + (modoEco ? "activado" : "desactivado"));
    }

    @Override
    public void ventilacionDireccional(String direccion) {
        if (direccion.equals("parabrisas") || direccion.equals("frontal") ||
            direccion.equals("pies") || direccion.equals("todo")) {
            this.direccionVentilacion = direccion;
            historial.add("Ventilación ajustada a " + direccion);
        } else {
            historial.add("Error: Dirección de ventilación no válida.");
        }
    }

    @Override
    public String encenderDesempanador() {
        desempanador = true;
        historial.add("Desempanador encendido");
        return "Desempanador encendido.";
    }

    @Override
    public String apagarDesempanador() {
        desempanador = false;
        historial.add("Desempanador apagado");
        return "Desempanador apagado.";
    }

    @Override
    public void calefaccionRapida() {
        this.temperatura = 30;
        historial.add("Calefacción rápida activada");
    }

    @Override
    public String[] verHistorial() {
        return historial.toArray(new String[0]);
    }

    @Override
    public void programarMantenimiento(String fecha) {
        // Conversión de String a Date o almacenamiento como String según tu preferencia
        this.citaMantenimiento = new Date(); // Este es solo un ejemplo, deberías convertir fecha adecuadamente
        historial.add("Mantenimiento programado para " + fecha);
    }
}
