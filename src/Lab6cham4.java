import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Lab6cham4 {
    public static void main(String[] args) throws IOException {
        //Check http OR https; domain name, .com OR .net
        String googleUrl = "https://google.com";

        URL url = null;
        url = new URL(googleUrl);
        Object domainName = googleUrl.substring(8);
        System.out.println(domainName);

        String[] protocol = url.getProtocol().split("\\.");
        googleUrl = protocol[protocol.length-1];
        System.out.println(googleUrl);

        String[] domainNameParts = url.getHost().split("\\.");
        googleUrl = domainNameParts[domainNameParts.length-1];
        System.out.println(googleUrl);


    }
}
