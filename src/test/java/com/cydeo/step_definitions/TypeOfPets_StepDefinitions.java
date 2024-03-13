package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class TypeOfPets_StepDefinitions {

    @Then("user sees the list of pets below")
    public void user_sees_the_list_of_pets_below(List<String> typeOfPets) {

        System.out.println("typeOfPets = " + typeOfPets);
        System.out.println(typeOfPets.get(1));



    }
}
