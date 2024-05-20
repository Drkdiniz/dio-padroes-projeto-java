package dio.springboot;

public class PagamentoContext {
    private PagamentoStrategy strategy;

    public PagamentoContext(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void executarPagamento(double valor) {
        strategy.pagar(valor);
    }

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }
}
