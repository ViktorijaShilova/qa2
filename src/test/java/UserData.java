public class UserData {
    private String name;
    private String surname;
    private String discountCode;
    private Integer travellerCount;
    private Integer children;
    private Integer luggage;
    private String nextFlight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Integer getTravellerCount() {
        return travellerCount;
    }

    public void setTravellerCount(Integer travellerCount) {
        this.travellerCount = travellerCount;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getLuggage() {
        return luggage;
    }

    public void setLuggage(Integer luggage) {
        this.luggage = luggage;
    }

    public String getNextFlight() {
        return nextFlight;
    }

    public void setNextFlight(String nextFlight) {
        this.nextFlight = nextFlight;
    }
}