import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LogRequestAndResponseDetails {
    @Test
    public void requestUsZipCode90210_logRequestAndResponseDetails() {

        given().
                log().all().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                log().body();
    }
}
