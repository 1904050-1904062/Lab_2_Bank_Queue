import java.util.Random;
public class Customer {
    private long arrivalTime;
    private long serviceTime;
    private boolean served;

    public Customer(long arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.serviceTime = new Random().nextInt(241) + 60; // Service time between 60 and 300 seconds
        this.served = false;
    }


    public long getArrivalTime() {
        return arrivalTime;
    }

    public long getServiceTime() {
        return serviceTime;
    }

    public boolean isServed() {
        return served;
    }



    
    public void setServed(boolean served) {
        this.served = served;
    }
    
}