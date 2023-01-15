package main.java.memento;

import main.java.state.Funcionario;

public class FuncionarioEstadoAtivo implements FuncionarioEstado {

    private FuncionarioEstadoAtivo() {}
    private static FuncionarioEstadoAtivo instance = new FuncionarioEstadoAtivo();
    public static FuncionarioEstadoAtivo getInstance() { return instance; }

    public String getNomeEstado() {
        return "Ativo";
    }
}
