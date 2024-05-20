package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoContext pagamentoContext;

    @Autowired
    private PagamentoStrategy pagamentoCartaoCredito;

    @Autowired
    private PagamentoStrategy pagamentoBoleto;

    @Autowired
    private PagamentoStrategy pagamentoPix;

    @PostMapping("/cartao-credito")
    public void pagarCartaoCredito(@RequestParam double valor) {
        pagamentoContext.setStrategy(pagamentoCartaoCredito);
        pagamentoContext.executarPagamento(valor);
    }

    @PostMapping("/boleto")
    public void pagarBoleto(@RequestParam double valor) {
        pagamentoContext.setStrategy(pagamentoBoleto);
        pagamentoContext.executarPagamento(valor);
    }

    @PostMapping("/pix")
    public void pagarPix(@RequestParam double valor) {
        pagamentoContext.setStrategy(pagamentoPix);
        pagamentoContext.executarPagamento(valor);
    }
}
