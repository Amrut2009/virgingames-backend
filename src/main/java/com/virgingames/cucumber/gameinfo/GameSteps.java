package com.virgingames.cucumber.gameinfo;

import com.virgingames.cucumber.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GameSteps {
    @Step("Getting all GBP Data")
    public ValidatableResponse getAllGBPData() {
        return SerenityRest.given()
                .log()
                .all()
                .when()
                .get(EndPoints.GBPCURRENCY)
                .then();
    }

    @Step("Getting all SEK Data")
    public ValidatableResponse getAllSEKData() {
        return SerenityRest.given()
                .log()
                .all()
                .when()
                .get(EndPoints.SEKCURRENCY)
                .then();
    }
}
