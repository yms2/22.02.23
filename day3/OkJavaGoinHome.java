import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
public class OkJavaGoinHome {

	public static void main(String[] args) {
		String id = "JAVA APT 507";
		// TODO Auto-generated method stub
		//Elevator call
//		org.opentutorials.iot.Elevator myElevator = new org.openturtorials.iot.Elevator("JAVA APT507");
		Elevator myElevator = new Elevator("JAVA APT 507");
		myElevator.callForUp(1);
		//Security off
		Security mySecurity =new Security("JAVA APT 507");
		mySecurity.off();
		//Light on
		Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting("JAVA APT 507 / floorLamp");
		floorLamp.on();
		}

}
