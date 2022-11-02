public abstract class TipoCarro {

    protected Grupo grupo;

    protected float custoBase;

    public TipoCarro(float valorBase) {
        this.custoBase = valorBase;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCusto();
}
