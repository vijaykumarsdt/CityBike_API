package com.citybike.testCases;

import org.testng.annotations.Test;
import com.citybike.pageObjects.Location;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
//import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import java.util.List;

public class citybike_location {

	@Test
	public void citybikebylocation() {
		Response response = given().when().get("https://api.citybik.es/v2/networks");

		given().
		when().get("https://api.citybik.es/v2/networks").
		then().assertThat().statusCode(200);

		//System.out.println("Response Status Code is " + response.getStatusCode());

		if (response.statusCode() == 200) {

			// System.out.println(response.getBody().prettyPrint());

			JsonPath jsonPath = response.getBody().jsonPath();

			List<Location> locations = jsonPath.getList("networks.location");

			if (!locations.isEmpty()) {
				for (int i = 0; i < locations.size(); i++) {
					String path = "networks.location[" + i + "]";

					Location location = jsonPath.getObject(path, Location.class);

					if (location.getCity().equals("Frankfurt") && location.getCountry().equals("DE")) {
						System.out.println("City Name is -> " + location.getCity());
						System.out.println("Latitude is  -> " + location.getLatitude());
						System.out.println("Longitude is -> " + location.getLongitude());
					}
				}
			}

		} else {
			System.out.println("Failed to get the Response");
		}

	}

}
