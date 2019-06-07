import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CheckResponseBody {

    @Before
    public void setBaseUri() {

        RestAssured.baseURI = "http://zippopotam.us/us/90210";
    }
    
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {

        given().
                when().
                get("").
                then().
                assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void requestUsZipCode90210_checkStateNameInResponseBody_expectCalifornia() {

        given().
                when().
                get("").
                then().
                assertThat().
                body("places[0].state", equalTo("California"));
    }

    @Test
    public void requestUsZipCode90210_checkListOfPlaceNamesInResponseBody_expectContainsBeverlyHills() {

        given().
                when().
                get("").
                then().
                assertThat().
                body("places.'place name'", hasItem("Beverly Hills"));
    }

    @Test
    public void requestUsZipCode90210_checkNumberOfPlaceNamesInResponseBody_expectOne() {

        given().
                when().
                get("").
                then().
                assertThat().
                body("places.'place name'", hasSize(1));
    }

}
