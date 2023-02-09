package br.com.alura.rh.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Terceirizado {

    private DadosPessoais dadosPessoais;
    private String empresa;
}
