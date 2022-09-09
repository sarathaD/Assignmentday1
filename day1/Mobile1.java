package week1.day1;

public class Mobile1 {
public void MakeACall() {
	String mobileModel="Samsung";
	float mobileWeight=105.5f;
	System.out.println("Make A Call");}
	public void SendSms() {
		boolean FullCharged=true;
		int mobileCost=10000;
	System.out.println("send message"); 
}
	public static void main(String[] args) {
		Mobile1 obj = new Mobile1();
		obj.MakeACall();
		obj.SendSms();
		System.out.println("This is my mobile");
		// TODO Auto-generated method stub

	}

}
