package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo {
	@Given("look at the water bottle")
	public void look_at_the_water_bottle() {
		System.out.println("looking at the water bottle");
	    
	}

	@When("^look at the bottle colour is \"([a-z0-9])*\"$")
	public void look_at_the_bottle_colour_is(String color) {
	    System.out.println("bottle color is:"+color);
	}
	
//	@When("look at the bottle colour is {string}")
//	public void look_at_the_bottle_colour_is(String color) {
//	    System.out.println("Bottle color is"+color);
//	}

	@When("^bottle should have capacity should be ([0-9])+$") 
	public void bottle_should_have_capacity_should_be(Integer Capacity) //write the values in regular expressions suppose it is in data type change in to given feature file format
	{
	    System.out.println("bottle capacity"+Capacity);
	}

	@When("^dimension of water bottle is ([0-9])+ and ([0-9]) $")
	public void dimension_of_water_bottle_is_length_and_width(String length, String width) {
	    System.out.println("bottle length and width " +length+ " and " +width);
	}

	@Then("validate the result")
	public void validate_the_result() 
	{
		System.out.println("result is pass");
	}
}