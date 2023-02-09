package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public void atualizaSalario(BigDecimal salarioReajustado) {
		this.dadosPessoais.setSalario(salarioReajustado);
		this.dataUltimoReajuste = LocalDate.now();
	}

    public void promover(Cargo novoCargo) {
		dadosPessoais.setCargo(novoCargo);
    }
}
