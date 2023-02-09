package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizaSalario(salarioReajustado);
    }
}
