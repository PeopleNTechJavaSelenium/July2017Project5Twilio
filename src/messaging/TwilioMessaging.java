package messaging;

import java.util.ArrayList;
import java.util.List;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioMessaging {

	public static final String ACCOUNT_SID = "your sid";
	public static final String AUTH_TOKEN = "your token";
	
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		List<String> listOfContacts = new ArrayList<String>();
		listOfContacts.add("12013342668");
		listOfContacts.add("13477614311");
		listOfContacts.add("19725519652");
		for(int i=0; i<listOfContacts.size(); i++) {
		Message message = Message.creator(new PhoneNumber(listOfContacts.get(i)), new PhoneNumber("16513141569"), "Hi,How is CodeLab going?").create();
		System.out.println(message.getSid());
		}
	}

}
