package work.wbar;

public class CordlessPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public CordlessPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Cordless is already on!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from cordless.");
    }

    @Override
    public void answer() {
        if (isRinging()) {
            System.out.println("Answering...");
        }
        isRinging = false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        isRinging = phoneNumber == myNumber;
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
