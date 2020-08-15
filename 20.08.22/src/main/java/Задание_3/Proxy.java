package Задание_3;

import java.io.IOException;

public class Proxy implements ClientInterface {

    Client client;

    public Proxy() {
        this.client = new Client();
    }

    @Override
    public void run () throws IOException {
        client.run();
    }
}
