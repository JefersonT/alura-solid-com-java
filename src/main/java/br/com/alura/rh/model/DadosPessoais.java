package br.com.alura.rh.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class DadosPessoais {
    private String nome;
    private String cpf;
    private Cargo cargo;
    private BigDecimal salario;
}
