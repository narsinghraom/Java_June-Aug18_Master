package com.vtalent.chaithanya.InnerClass;

//Static Inner class
 class MotherBoard {
    String model;
    public MotherBoard(String model) {
        this.model = model;
    }
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
    protected static class USBS{
        int usb2 = 2;
        int usb3 = 5;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}
public class StaticInner {

	public static void main(String[] args) {
        MotherBoard.USB usb = new MotherBoard.USB();
        MotherBoard.USBS usbs = new MotherBoard.USBS();
        System.out.println("Total Ports = " + usb.getTotalPorts());
        System.out.println("Total Ports = " + usbs.getTotalPorts());
    }
}
