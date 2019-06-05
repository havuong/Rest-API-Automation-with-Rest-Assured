import static io.restassured.RestAssured.given;

public class CheckStatusCode {
    public void requestUsZipCode90210_checkStatusCode_expectHttp200() {
        given().
                when().get("http://zippopotam.us/us/90210").
                then().assertThat().statusCode(200);
    }
}
