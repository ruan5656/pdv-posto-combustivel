package com.br.pdvpostocombustivel.model;

import java.time.LocalDate;


//Para resposta

public record PessoaResponse(
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        LocalDate dataNascimento)
{}