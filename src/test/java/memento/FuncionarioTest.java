package test.java.memento;

import main.java.memento.Funcionario;
import main.java.memento.FuncionarioEstadoAtivo;
import main.java.memento.FuncionarioEstadoDemitido;
import main.java.memento.FuncionarioEstadoLicenca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    void deveArmazenarEstados(){
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoANterior(){
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        funcionario.restauraEstado(1);
        assertEquals(FuncionarioEstadoLicenca.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido(){
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
