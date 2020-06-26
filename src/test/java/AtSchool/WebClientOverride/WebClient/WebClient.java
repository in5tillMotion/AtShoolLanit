package AtSchool.WebClientOverride.WebClient;

public class WebClient {

    protected String serverUrl;

    public WebClient() {
        serverUrl = "default";
    }

    public WebClient(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void setConnection(){
        System.out.println("Установка соединения c " + serverUrl);
    }
}
