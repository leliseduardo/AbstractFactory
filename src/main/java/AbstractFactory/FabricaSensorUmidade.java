package AbstractFactory;

class FabricaSensorUmidade implements FabricaSensores {
    @Override
    public Sensor criarSensor() {
        return new SensorUmidade();
    }
}