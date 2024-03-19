package AbstractFactory;

class FabricaSensorTemperatura implements FabricaSensores {
    @Override
    public Sensor criarSensor() {
        return new SensorTemperatura();
    }
}
