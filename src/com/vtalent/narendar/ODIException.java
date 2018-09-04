package com.vtalent.narendar;

public class ODIException {


class OversException extends Exception

{
		public String toString()
		{
		return "Overs should not be greater thn 50";
		}
}

class WeatherException extends Exception
{
	
	public String toString(){
	return "Match is canceld due to the rain";
		}
}	

class MatchTieException extends Exception{		
	
		public String toString(){
		return "Match is tie";
	}
}
}
