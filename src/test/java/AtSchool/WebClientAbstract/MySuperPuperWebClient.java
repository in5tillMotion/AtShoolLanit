package AtSchool.WebClientAbstract;

public class MySuperPuperWebClient extends WebClient {
    public void workWithCookie(){
        System.out.println("Работаю с гуками");
    }

    public MySuperPuperWebClient() {
    }

    public MySuperPuperWebClient(String serverUrl) {
        super(serverUrl);
    }

    @Override
    public void setConnection() {
        System.out.println("Это переопределенный метод для установки соеденения");
        workWithCookie();
    }
}
