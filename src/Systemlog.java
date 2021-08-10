public class Systemlog implements Step{

    private static Systemlog systemlog = new Systemlog();
    private Systemlog(){};

    public static Systemlog getInstance(){
        return systemlog;
    }

    @Override
    public String informationalLog(String description) {
        return "Info: "+description;
    }

    @Override
    public String errorLog(String description) {
        return "Error: "+description;
    }

    @Override
    public String debugLog(String description) {
        return "Debug Session: "+description;
    }
}
