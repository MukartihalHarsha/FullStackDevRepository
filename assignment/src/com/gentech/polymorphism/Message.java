package com.gentech.polymorphism;
class Message1
{
	 void sendMessage(String recipient, String content)
	 {
	     System.out.println("Sending a generic message to " + recipient);
	 }
}
class EmailMessage extends Message1
{
	 void sendMessage(String recipient, String content) 
	 {
	     System.out.println("Sending an email to " + recipient + " with content: " + content);
	 }
}
class SMSMessage extends Message1 
{
	 void sendMessage(String recipient, String content)
	 {
	     System.out.println("Sending an SMS to " + recipient + " with content: " + content);
	 }
}
class WhatsappMessage extends Message1 
{
	 void sendMessage(String recipient, String content)
	 {
	     System.out.println("Sending an Whatsappmsg to " + recipient + " with content: " + content);
	 }
}

public class Message {

	public static void main(String[] args) {
		Message1 email = new EmailMessage();
	    Message1 sms = new SMSMessage();
	    Message1 whatsapp = new WhatsappMessage();
	    
	    email.sendMessage("john@example.com", "Hello John!");  
	    sms.sendMessage("9113666088", "Hi there!");
	    whatsapp.sendMessage("9445587231", "How are you?");
		

	}

}


