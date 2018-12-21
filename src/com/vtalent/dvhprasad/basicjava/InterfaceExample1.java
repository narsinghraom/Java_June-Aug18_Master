package com.vtalent.dvhprasad.basicjava;



interface Mnr extends Abc1,Xyz{
	
}
class MnrImpl extends XyzImpl implements Mnr{
	
}

public class InterfaceExample1 {
public static void main(String[] args) {
	Mnr mnr =new MnrImpl();
	mnr.function(2);
	mnr.function(2, 3);
	mnr.function("HELLo");
}
}
