package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajuste deve ser de no mínimo 6 meses");
        }
    }
}
