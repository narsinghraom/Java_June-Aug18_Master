package com.vtalent.karunya;

public class Xyz {
	public static void main(String[] args){
		int i,j,k;
		for(i=0; i<1; i++){
			for(j=1;j<4; j++){
				for (k=2; k<5;k++){
					if((i==j)&&(j==k))
						System.out.println(i);
				}
			}
		}
	}
}
