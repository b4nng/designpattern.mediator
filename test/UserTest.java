import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void deveLogarInformacao(){
        User usuario = new User();
        Assertions.assertEquals("Application X Info: Ação trivial executada com sucesso.", usuario.executaAcaoNormalNaAplicacao());
    }
    @Test
    public void deveLogarErro(){
        User usuario = new User();
        Assertions.assertEquals("Application X Error: Erro, ação não executada por falta de alocação de RAM", usuario.executaAcaoQueDaErroNaAplicacao());
    }
    @Test
    public void deveLogarDebug(){
        User usuario = new User();
        Assertions.assertEquals("Application X Debug Session: Ação trivial iniciada\n"+
                "Application X Debug Session: Ação trivial executando...passo 1 de 3\n"+
        "Application X Debug Session: Ação trivial executando...passo 2 de 3\n"+
        "Application X Debug Session: Ação trivial executando...passo 3 de 3\n"+
        "Application X Debug Session: Ação trivial executada com sucesso. Execução em 0.87s\n"
        , usuario.executaAcaoQueEstaSendoDebugadaNaAplicacao());
    }
}
//
//
