package AtSchool.WebClientAbstract;

public abstract class WebClient {

    protected String serverUrl;

    public WebClient() {
        serverUrl = "default";
    }

    public WebClient(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public abstract void setConnection();
}
