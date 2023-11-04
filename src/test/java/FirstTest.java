import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirstTest {

    @Test
    public void firstTest() {

        // Scenario setup: config, headers, params
        given().
                log().all().
        // action: GET, POST, PUT, DELETE
        when()
                .get("https://videogamedb.uk/api/videogame").
        // assertions: check response code, extract data
        then()
                .log().all();
    }
}

