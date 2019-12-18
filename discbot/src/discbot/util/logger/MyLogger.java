package discbot.util.logger;

public class MyLogger{
    public static LoggerValues debugLevel;

    public static void setDebugLevel(LoggerValues debugLevelIn){
        debugLevel = debugLevelIn;
    }

    public static void setDebugLevel(int debugLevelIn){
        debugLevel = LoggerValues.values()[debugLevelIn];
    }

    public void printMessage(String messageIn, LoggerValues debugValue){
        if (debugValue.ordinal() >= debugLevel.ordinal()){
            System.out.println(messageIn);
        }
    }

    // TODO: Logger file
}