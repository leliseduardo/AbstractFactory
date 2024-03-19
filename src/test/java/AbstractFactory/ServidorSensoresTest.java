package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServidorSensoresTest {

    @Test
    void testarServidorSensoresTemperatura() {
        ServidorSensores servidor = new ServidorSensores(new FabricaSensorTemperatura());
        assertNotNull(servidor);
        servidor.processarDadosSensores();
    }

    @Test
    void testarServidorSensoresUmidade() {
        ServidorSensores servidor = new ServidorSensores(new FabricaSensorUmidade());
        assertNotNull(servidor);
        servidor.processarDadosSensores();
    }
}
