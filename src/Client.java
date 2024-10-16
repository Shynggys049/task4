class Client {
    private Mediator mediator;

    public Client(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTaxi() {
        System.out.println("Client: Requesting a taxi.");
        mediator.notify(this, "requestTaxi");
    }

    public void confirmPickup() {
        System.out.println("Client: Confirmed pickup.");
    }
}

class Driver {
    private Mediator mediator;

    public Driver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void acceptRequest() {
        System.out.println("Driver: Accepting the request.");
        mediator.notify(this, "pickup");
    }
}
