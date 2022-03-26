package Service;

public class OTPGenerator {

	//generateOTP method generates a 4 digit random OTP and returns it
	public int generateOTP() {
		int otp = (int)(Math.random()*9000)+1000;
		return otp;
	}
}
