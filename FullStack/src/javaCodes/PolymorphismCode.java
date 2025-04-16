package javaCodes;

public class PolymorphismCode {
	 public static void main(String[] args) {
	  Message msg;
	        msg = new TextMessage();
	        msg.send();
	        msg = new VoiceMessage();
	        msg.send();
	        msg = new VideoMessage();
	        msg.send();
	    }
	}
	class Message {
	    void send() {
	        System.out.println("Message sent.");
	    }
	}
	class TextMessage extends Message {
	    void send() {
	        System.out.println("Text message sent.");
	    }
	}
	class VoiceMessage extends Message {
	    void send() {
	        System.out.println("Voice message sent.");
	    }
	}
	class VideoMessage extends Message {
	    void send() {
	        System.out.println("Video message sent.");
	    }
	}
