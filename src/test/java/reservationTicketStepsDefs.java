import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesBE.BaseFunctions;
import sun.awt.SunHints;

import java.util.Map;

public class reservationTicketStepsDefs {
    private String departure;
    private String destination;
    private Integer seatNumber;
    private UserData userData = new UserData();
    private BaseFunctions baseFunctions = new BaseFunctions();
    private final String HOME_PAGE = "http://qaguru.lv:8090/tickets/";

    @Given("departure airport (.*)")
    public void set_departure_airport(String departure) {
        this.departure = departure;

    }

    @Given("destination airport (.*)")
    public void set_destination_airport(String destination) {
        this.destination = destination;
    }

    @Given("user data is: (.*)")
    public void set_user_data(Map<String,String> params) {
        userData.setName(params.get("name"));
        userData.setSurname(params.get("surname"));
        userData.setDiscountCode(params.get("discountCode"));
        userData.setTravellerCount(Integer.valueOf(params.get("travellerCount")));
        userData.setChildren(Integer.valueOf(params.get("children")));
        userData.setLuggage(Integer.valueOf(params.get("luggage")));
        userData.setNextFlight(params.get("nextFlight"));
    }

    @Given("seat number is (.*)")
    public void set_seat_number(Integer number) {
        this.seatNumber = seatNumber;

    }

    @Given("we are on home page")
    public void home_page() {
        baseFunctions.goToUrl(HOME_PAGE);

    }

    @When("we are selecting airports")
    public void selecting_airports() {

    }

    @When("we are pressing GoGoGO button")
    public void pressing_button() {

    }

    @Then("the registration page appears")
    public void check_registration_page() {

    }

    @When("we are filling registration form")
    public void filling_geristration_form() {

    }

    @When("we are pressing GetPrice button")
    public void pressing_getPrice_button() {

    }

    @Then("our price will be (.*) euro")
    public void price_check(Integer price) {

    }

    @When("we are pressing Book button")
    public void pressing_Book_button() {

    }

    @Then("we are on select seat page")
    public void seats_page() {

    }

    @When("we are selecting seat number")
    public void selecting_seat_num() {

    }

    @When("we are clicking Book button")
    public void clicking_button() {

    }

    @Then("successful registration page appears")
    public void registration_page() {

    }

    @When("we are requesting registration list")
    public void requesting_reg_list() {

    }

    @Then("can see our reservation in the list")
    public void check_reservation_on_the_list() {

    }

    @When("we are deleting our reservation ticket")
    public void deleting_reservation_from_list() {

    }

    @When("we are requesting registration list again")
    public void requesting_registration_list_again() {

    }

    @Then("we can see aur reservation is not in the list")
    public void reservation_is_not_inTheList() {

    }
}
