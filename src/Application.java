public class Application{

    private static Application application = new Application();
    private Application(){};
    public static Application getInstance(){
        return application;
    }

    public String logInfo(String message){
        return "Application X "+ Systemlog.getInstance().informationalLog(message);
    }
    public String logError(String message){
        return "Application X "+ Systemlog.getInstance().errorLog(message);
    }
    public String logDebug(String message){
        return "Application X "+ Systemlog.getInstance().debugLog(message);
    }

}
