import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuvTest {

    @Test
    void deveRetornarCustoSUVEconomico() {
        Grupo grupo = new Economico();
        Suv suv = new Suv(2000.0f);
        suv.setGrupo(grupo);
        suv.setCilindradas(2000);
        assertEquals(2200.0f, suv.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoSUVIntermediario() {
        Grupo grupo = new Intermediario();
        Suv suv = new Suv(2000.0f);
        suv.setGrupo(grupo);
        suv.setCilindradas(2000);
        assertEquals(2600.0f, suv.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoSUVElite() {
        Grupo grupo = new Elite();
        Suv suv = new Suv(2000.0f);
        suv.setGrupo(grupo);
        suv.setCilindradas(2000);
        assertEquals(2800.0f, suv.calcularCusto(), 0.01f);
    }

}