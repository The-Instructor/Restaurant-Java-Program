public class Restaurant {

    // Properties
    private String name;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    // Constructor
    public Restaurant() {}

    public Restaurant(String name, int waitTime, double rating, double avgPrice, double distance, String hoursOpen) {
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }

    // Getters & Setters
    // Accessors & Mutators


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getHoursOpen() {
        return hoursOpen;
    }

    public void setHoursOpen(String hoursOpen) {
        this.hoursOpen = hoursOpen;
    }

//    private String name;
//    private int waitTime;
//    private double rating;
//    private double avgPrice;
//    private double distance;
//    private String hoursOpen;
    public String toString() {
        return "Restaurant Name:\t" + name +
                "\nWait Time:\t\t\t" + waitTime +
                "\nRating:\t\t\t\t" + rating +
                "\nAverage Price:\t\t" + avgPrice +
                "\nDistance:\t\t\t" + distance +
                "\nHours of Operation: " + hoursOpen;
    }
}
