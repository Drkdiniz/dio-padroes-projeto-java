package dio.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamentoConfig {
    @Bean
    public PagamentoStrategy pagamentoCartaoCredito() {
        return new PagamentoCartaoCredito();
    }

    @Bean
    public PagamentoStrategy pagamentoBoleto() {
        return new PagamentoBoleto();
    }

    @Bean
    public PagamentoStrategy pagamentoPix() {
        return new PagamentoPix();
    }

    @Bean
    public PagamentoContext pagamentoContext(PagamentoStrategy pagamentoCartaoCredito) {
        return new PagamentoContext(pagamentoCartaoCredito);
    }
}
