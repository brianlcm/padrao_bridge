import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SedanTest {

    @Test
    void deveRetornarCustoSedanEconomico() {
        Grupo grupo = new Economico();
        Sedan sedan = new Sedan(2000.0f);
        sedan.setGrupo(grupo);
        assertEquals(2000.0f, sedan.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoSedanIntermediario() {
        Grupo grupo = new Intermediario();
        Sedan sedan = new Sedan(2000.0f);
        sedan.setGrupo(grupo);
        assertEquals(2400.0f, sedan.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoSedanElite() {
        Grupo grupo = new Elite();
        Sedan sedan = new Sedan(2000.0f);
        sedan.setGrupo(grupo);
        assertEquals(2600.0f, sedan.calcularCusto(), 0.01f);
    }

}