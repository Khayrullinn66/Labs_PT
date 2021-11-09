public class Singleton {
    private static Singleton singleton;
    private static string logFile = "This is log file. \n\n";

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();

        }
        return singleton;
    }
    private Singleton(){

    }
    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}

