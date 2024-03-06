package j9;

import java.net.Authenticator;
import java.net.http.HttpClient;
import java.time.Duration;

public class J9 {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder()
                .authenticator(Authenticator.getDefault())
                .connectTimeout(Duration.ZERO)
                .build();
    }
}
