class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;

    public void registerClient(Client client) {
        this.client = client;
    }

    public void registerDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender == client && event.equals("requestTaxi")) {
            System.out.println("Dispatcher: Notifying driver about the client's request.");
            driver.acceptRequest();
        } else if (sender == driver && event.equals("pickup")) {
            System.out.println("Dispatcher: Driver is picking up the client.");
            client.confirmPickup();
        }
    }
}
