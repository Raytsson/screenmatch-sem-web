package br.com.alura.screenMatch.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
