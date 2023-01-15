package main.java.memento;

import main.java.state.Funcionario;

public class FuncionarioEstadoLicenca implements FuncionarioEstado {

    private FuncionarioEstadoLicenca() {}
    private static FuncionarioEstadoLicenca instance = new FuncionarioEstadoLicenca();
    public static FuncionarioEstadoLicenca getInstance() { return instance; }

    public String getNomeEstado() {
        return "Licença";
    }
}
