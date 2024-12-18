package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static final String WSDL_URL = "http://localhost:8082/ws/banque";
    public static void main(String[] args) {
        Endpoint.publish(
                WSDL_URL,
                new BanqueService());
    }
}
