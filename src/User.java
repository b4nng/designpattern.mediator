public class User {
    public User(){}

    public String executaAcaoNormalNaAplicacao(){
        return Application.getInstance().logInfo("Ação trivial executada com sucesso.");
    }
    public String executaAcaoQueDaErroNaAplicacao(){
        return Application.getInstance().logError("Erro, ação não executada por falta de alocação de RAM");
    }
    public String executaAcaoQueEstaSendoDebugadaNaAplicacao(){
         return Application.getInstance().logDebug("Ação trivial iniciada\n")+
         Application.getInstance().logDebug("Ação trivial executando...passo 1 de 3\n")+
         Application.getInstance().logDebug("Ação trivial executando...passo 2 de 3\n")+
         Application.getInstance().logDebug("Ação trivial executando...passo 3 de 3\n")+
         Application.getInstance().logDebug("Ação trivial executada com sucesso. Execução em 0.87s\n");
    }
}
