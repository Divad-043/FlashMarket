package test;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Verification {
    public static final String ACCOUNT_SID = "AC9e1d71023ffc262498a885749b53c97e";
    public static final String AUTH_TOKEN = "94f1695586c22cb0efac94a8cbadbaa8";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+237655931893"),
                new PhoneNumber("MG172f5be4031c8885459301eab0043ad7"),
                "This is the ship that made the Kessel Run in fourteen parsecs?").create();

        System.out.println(message.getSid());
    }
}
