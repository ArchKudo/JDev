package work.wbar;

public class Main {

    public static void main(String[] args) {
        ITelephone iTelephone;
        iTelephone = new CordlessPhone(1234567890);
        iTelephone.powerOn();
        iTelephone.callPhone(1234567890);
        iTelephone.dial(987654321);
        iTelephone.answer();

    }
}
