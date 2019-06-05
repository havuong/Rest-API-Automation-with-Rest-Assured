import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CheckStatusCode {
    @Test
    public void requestUsZipCode90210_checkStatusCode_expectHttp200() {
        given().
                when().get("http://zippopotam.us/us/90210").
                then().assertThat().statusCode(200);
    }
}
