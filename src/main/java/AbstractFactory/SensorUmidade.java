package AbstractFactory;

class SensorUmidade implements Sensor {
    @Override
    public String ler() {
        return "Lendo umidade...";
    }
}
