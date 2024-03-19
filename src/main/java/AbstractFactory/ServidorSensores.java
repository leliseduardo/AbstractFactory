package AbstractFactory;

public class ServidorSensores {
    private FabricaSensores fabricaSensores;

    public ServidorSensores(FabricaSensores fabricaSensores) {
        this.fabricaSensores = fabricaSensores;
    }

    public void processarDadosSensores() {
        Sensor sensor = fabricaSensores.criarSensor();

        sensor.ler();
    }
}
