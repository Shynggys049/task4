public class Main {
    public static void main(String[] args) {
        DispatcherMediator mediator = new DispatcherMediator();

        Client client = new Client(mediator);
        Driver driver = new Driver(mediator);

        mediator.registerClient(client);
        mediator.registerDriver(driver);

        client.requestTaxi();
    }
}
