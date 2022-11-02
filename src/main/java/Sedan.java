public class Sedan extends TipoCarro {
    public Sedan(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.grupo.percentualAumento());
    }
}
