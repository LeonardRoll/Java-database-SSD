import java.io.Serializable;


public class P_Detail implements Serializable{

	//Attributes
	private String Card_Number;
	private String Security_Code;
	private String Verification;
	
	//Get and Set Functions
	public String getCard_Number() {
		return Card_Number;
	}
	public void setCard_Number(String card_Number) {
		Card_Number = card_Number;
	}
	public String getSecurity_Code() {
		return Security_Code;
	}
	public void setSecurity_Code(String security_Code) {
		Security_Code = security_Code;
	}
	public String getVerification() {
		return Verification;
	}
	public void setVerification(String verification) {
		Verification = verification;
	}
	
	//Constructor
	public P_Detail(String card_Number,String security_Code,String verification)
	{
		Card_Number = card_Number;
		Security_Code = security_Code;
		Verification = verification;
	}
}
