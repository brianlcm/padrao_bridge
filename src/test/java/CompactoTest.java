import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompactoTest {

    @Test
    void deveRetornarCustoCompactoEconomico() {
        Grupo grupo = new Economico();
        Compacto compacto = new Compacto(2000.0f);
        compacto.setGrupo(grupo);
        assertEquals(2000.0f, compacto.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoCompactoIntermediario() {
        Grupo grupo = new Intermediario();
        Compacto compacto = new Compacto(2000.0f);
        compacto.setGrupo(grupo);
        assertEquals(2000.0f, compacto.calcularCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoCompactoElite() {
        Grupo grupo = new Elite();
        Compacto compacto = new Compacto(2000.0f);
        compacto.setGrupo(grupo);
        assertEquals(2000.0f, compacto.calcularCusto(), 0.01f);
    }
}