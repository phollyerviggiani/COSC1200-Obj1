import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Weather {
    private static final String API_KEY = "c02821d30d7e79335c7d9f6d4cc8a3cf";
    private static final String API_URL = "http://api.openweathermap.org/data/3.0/onecall/timemachine?lat=35.658581&lon=139.745438&dt=1643803200&appid=";
//https://api.openweathermap.org/data/3.0/onecall/timemachine?lat=39.099724&lon=-94.578331&dt=1643803200&appid={API key}
    public static void main(String[] args) throws Exception {
        // Create a Url object from the API_URL String.
        URL url = new URL(API_URL + API_KEY);

        // Create a HttpURLConnection object from the Url object.
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request type to GET.
        connection.setRequestMethod("GET");

        // Send the request and get the response code.
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // If the request was successful (response code 200),
        // read the input stream and print it.
        if(responseCode == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println("Response: " + response.toString());
        }
    }
}