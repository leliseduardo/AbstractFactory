package AbstractFactory;

class SensorTemperatura implements Sensor {
    @Override
    public String ler() {
        return "Lendo temperatura...";
    }
}
