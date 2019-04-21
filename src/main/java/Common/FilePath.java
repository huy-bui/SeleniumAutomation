package Common;

public final class FilePath {

    private FilePath(){
    }

    private static final String USER_DIRECTORY = System.getProperty("user.dir");

    public static final String CHROME_DRIVER = USER_DIRECTORY + "\\src\\main\\resources\\ChromeDriver\\chromedriver.exe";
}
