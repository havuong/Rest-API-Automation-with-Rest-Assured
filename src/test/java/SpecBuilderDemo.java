import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SpecBuilderDemo {
    private static RequestSpecification reqSpec;

    @BeforeClass
    public static void createRequestSpecification() {
        reqSpec = new RequestSpecBuilder().
                setBaseUri("http://api.zippopotam.us").
                build();
    }

    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills_withRequestSpec() {

        given().
                spec(reqSpec).
                when().
                get("us/90210").
                then().
                assertThat().
                statusCode(200);
    }
}
