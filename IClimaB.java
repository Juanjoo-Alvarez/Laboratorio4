// IClimaB.java

public interface IClimaB {
    String encender();
    String apagar();
    double ajustarTemperatura(int temperatura);
    double modoAutomatico(int temperaturaAmbiente);
    int ajustarVentilacion(int intensidadVentilacion);
    void activarModoEco();
    void ventilacionDireccional(String direccion);
    String encenderDesempanador();
    String apagarDesempanador();
    void calefaccionRapida();
    String[] verHistorial();
    void programarMantenimiento(String fecha);
}
