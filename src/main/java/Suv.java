public class Suv extends TipoCarro {
    private int cilindradas;

    public Suv(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.grupo.percentualAumento()) + cilindradas*0.1f;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
