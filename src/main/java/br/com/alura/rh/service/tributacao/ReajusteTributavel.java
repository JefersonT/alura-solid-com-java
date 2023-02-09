package br.com.alura.rh.service.tributacao;

import br.com.alura.rh.service.tributacao.Reajuste;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
    BigDecimal valorImpostoDeRenda();
}
