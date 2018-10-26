package com.vtalent.pruthvi.basic;
public class Mobile {
interface Imobile{
	    void dial();
	}
	interface Itelephone{
	    void dial();
	}
	public  class Mobile implements Imobile,Itelephone{
	int IEMICode;
	int NoOfSim;
	String processor;
	String simCard;
	long mobileNo;
	public Mobile(){
	    this.IEMICode=0;
	    this.NoOfSim=0;
	    this.processor="";
	    this.simCard="";
	    this.mobileNo=0;
	}
	public Mobile(int imeiNo,int noOfSim,String processor,String simCard,long mobileNo){
	    this.IEMICode=imeiNo;
	    this.NoOfSim=noOfSim;
	    this.processor=processor;
	    this.simCard=simCard;
	    this.mobileNo=mobileNo;
	}
	public void dial(){
	    System.out.println("enter mobile no");
	}
	public void ConnectBluetooth(){
	    System.out.println("bluetooth connected");
	}
	public int GetIEMICode(){
	    return this.IEMICode;
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    System.out.println("wifi connected");
	}
	public void Receive(){
	    System.out.println("received");
	}
	public void SendMessage(){
	    System.out.println("send message");
	}
	}
	class Samsung extends Mobile {
	public Samsung(int imeiNo,int noOfSim,String processor,String simCard,long mobileNo){
	    super(imeiNo,noOfSim,processor,simCard,mobileNo);
	}
	public void dial(){
	   
		 super.dial();
		
	}
	public void ConnectBluetooth(){
	    
		super.ConnectBluetooth();
	}
	public int GetIEMICode(){
	    return this.IEMICode;
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    
		super.GetWifiConnection();
	}
	public void Receive(){
	   
	    super.Receive();
	}
	public void SendMessage(){
	   
	    super.SendMessage();
	} 
	}
	class Nokia extends Mobile {
	public Nokia(int imeiNo,int noOfSim,String processor,String simCard,long mobileNo){
	    super(imeiNo,noOfSim,processor,simCard,mobileNo);
	}
	public void dial(){
	    super.dial();
	}
	public void ConnectBluetooth(){
	    super.ConnectBluetooth();
	}
	public int GetIEMICode(){
	    return super.GetIEMICode();
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    super.GetWifiConnection();
	}
	public void Receive(){
	    super.Receive();
	}
	public void SendMessage(){
	    super.SendMessage();
	} 

	}
	class Iphone extends Mobile{
	public Iphone(int imeiNo,int noOfSim,String processor,String simCard,long mobileNo){
	    super(imeiNo,noOfSim,processor,simCard,mobileNo);
	}
	public void dial(){
	    super.dial();
	}
	public void ConnectBluetooth(){
	    super.ConnectBluetooth();
	}
	public int GetIEMICode(){
	    return super.GetIEMICode();
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    super.GetWifiConnection();
	}
	public void Receive(){
	    super.Receive();
	}
	public void SendMessage(){
	    super.SendMessage();
	} 

	}
	class SamsungS5 extends Samsung{

	public SamsungS5(int imeiNo, int noOfSim, String processor, String simCard,long mobileNo) {
	    super(imeiNo, noOfSim, processor, simCard, mobileNo);
	}
	public void dial(){
	    super.dial();
	}
	public void ConnectBluetooth(){
	    super.ConnectBluetooth();
	}
	public int GetIEMICode(){
	    return super.GetIEMICode();
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    super.GetWifiConnection();
	}
	public void Receive(){
	    super.Receive();
	}
	public void SendMessage(){
	    super.SendMessage();
	}     
	}
	class NokiaLumia625 extends Nokia{
	public NokiaLumia625(int imeiNo,int noOfSim,String processor,String simCard,long mobileNo){
	    super(imeiNo,noOfSim,processor,simCard,mobileNo);
	}

	public void dial(){
	    super.dial();
	}
	public void ConnectBluetooth(){
	    super.ConnectBluetooth();
	}
	public int GetIEMICode(){
	    return super.GetIEMICode();
	}
	public void SetIEMICode(int IEMI){
	    this.IEMICode=IEMI;
	}
	public void GetWifiConnection(){
	    super.GetWifiConnection();
	}
	public void Receive(){
	    super.Receive();
	}
	public void SendMessage(){
	    super.SendMessage();
	} 
}
}