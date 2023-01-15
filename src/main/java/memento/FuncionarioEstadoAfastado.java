package main.java.memento;

import main.java.state.Funcionario;

public class FuncionarioEstadoAfastado implements FuncionarioEstado {

    private FuncionarioEstadoAfastado() {}
    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();
    public static FuncionarioEstadoAfastado getInstance() { return instance; }

    public String getNomeEstado() {
        return "Afastado";
    }
}
