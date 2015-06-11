import java.io.*;

public class Passenger implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	/*Saved into a serialised file*/
	//Attributes
	private int P_ID;
	private Name Passenger_Name;
	private Name Leader_Name;
	private Address Naddress;
	private int Date_Account_Opened;
	//Border Control
	private String Insurance_Number;
	private String Insurance_Company;
	private String Verification; //viable for change
	private Contact Passenger_Contact_Detail;
	private Contact Leader_Contact_Detail;
	private String Policy_Number;
	private int Miles;
	private P_Detail Payment_Details;
	
	// Get and Set Functions
	public void setP_ID(int p_ID){
		P_ID = p_ID;
	}
	
	public int getP_ID(){
		return P_ID;
	}
	
	public P_Detail getPayment_Details() {
		return Payment_Details;
	}
	
	public void setPayment_Details(P_Detail payment_Details) {
		Payment_Details = payment_Details;
	}
	
	public int getMiles() {
		return Miles;
	}
	
	public void setMiles(int miles) {
		Miles = miles;
	}
	
	public String getPolicy_Number() {
		return Policy_Number;
	}
	
	public void setPolicy_Number(String policy_Number) {
		Policy_Number = policy_Number;
	}
	
	public Contact getLeader_Contact_Detail() {
		return Leader_Contact_Detail;
	}
	
	public void setLeader_Contact_Detail(Contact leader_Contact_Detail) {
		Leader_Contact_Detail = leader_Contact_Detail;
	}
	
	public Contact getPassenger_Contact_Detail() {
		return Passenger_Contact_Detail;
	}
	
	public void setPassenger_Contact_Detail(Contact passenger_Contact_Detail) {
		Passenger_Contact_Detail = passenger_Contact_Detail;
	}
	
	public String getVerification() {
		return Verification;
	}
	
	public void setVerification(String verification) {
		Verification = verification;
	}
	
	public String getInsurance_Company() {
		return Insurance_Company;
	}
	
	public void setInsurance_Company(String insurance_Company) {
		Insurance_Company = insurance_Company;
	}
	
	public String getInsurance_Number() {
		return Insurance_Number;
	}
	
	public void setInsurance_Number(String insurance_Number) {
		Insurance_Number = insurance_Number;
	}
	
	public int getDate_Account_Opened() {
		return Date_Account_Opened;
	}
	
	public void setDate_Account_Opened(int date_Account_Opened) {
		Date_Account_Opened = date_Account_Opened;
	}
	
	public Address getNaddress() {
		return Naddress;
	}
	
	public void setNaddress(Address naddress) {
		Naddress = naddress;
	}
	
	public Name getLeader_Name() {
		return Leader_Name;
	}
	
	public void setLeader_Name(Name leader_Name) {
		Leader_Name = leader_Name;
	}
	
	public Name getPassenger_Name() {
		return Passenger_Name;
	}
	
	public void setPassenger_Name(Name passenger_Name) {
		Passenger_Name = passenger_Name;
	}
	
	//Empty Constructor
	public Passenger(){};
	
	//Constructor
	public Passenger(int p_ID,Name passenger_Name,Name leader_Name,Address naddress,int date_Account_Opened,
			String insurance_Number,String insurance_Company,String verification,Contact passenger_Contact_Detail,
			Contact leader_Contact_Detail,String policy_Number,P_Detail payment_Details)
	{
		P_ID = p_ID;
		Passenger_Name = passenger_Name;
		Leader_Name = leader_Name;
		Naddress = naddress;
		Date_Account_Opened = date_Account_Opened;
		Insurance_Number = insurance_Number;
		Insurance_Company = insurance_Company;
		Verification = verification;
		Passenger_Contact_Detail = passenger_Contact_Detail;
		Leader_Contact_Detail = leader_Contact_Detail;
		Policy_Number = policy_Number;
		Miles = 0;
		Payment_Details = payment_Details;
	}

	public String toString()
    {
        return "Name = "+ Passenger_Name.getFirst_Name() + " ID = " + P_ID;
    }
	
	public String getFull_Name()
	{
		return Passenger_Name.getTitle() +" "+ Passenger_Name.getFirst_Name() +" "+ Passenger_Name.getLast_Name();
	}
}
