package test;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Popup;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

public class Verification{
//    public static final String ACCOUNT_SID = "AC9e1d71023ffc262498a885749b53c97e";
//    public static final String AUTH_TOKEN = "94f1695586c22cb0efac94a8cbadbaa8";
//
//    public static void main(String[] args) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//        Message message = Message.creator(new PhoneNumber("+237655931893"),
//                new PhoneNumber("MG172f5be4031c8885459301eab0043ad7"),
//                "This is the ship that made the Kessel Run in fourteen parsecs?").create();
//
//        System.out.println(message.getSid());
//    }

    public static void main(String[] args) {
        String json_string="[{\"test1\":\"test1_values_baru\",\"test2\":\"test2_values\"},{\"test1\":\"test‌​1_values\",\"test2\":\"test2_values\"}]";

        JSONArray jResultArray = new JSONArray(json_string);
        for(int i=0; i<jResultArray.length(); i++){
            JSONObject jResultObj = jResultArray.getJSONObject(i);
            String val_Test1 = jResultObj.getString("test1");
            String val_Test2 = jResultObj.getString("test2");
            System.out.println(json_string);
        }
        ; }


}
