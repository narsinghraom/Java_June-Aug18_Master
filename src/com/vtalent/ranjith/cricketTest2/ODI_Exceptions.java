package com.vtalent.ranjith.cricketTest2;

public class ODI_Exceptions  {

	class WeatherException extends Exception {
	
		private static final long serialVersionUID = 1L;

		public String toString(){
			return "Match is canceld due to the rain";
		}
	}	
	class OversException1 extends Exception{
		private static final long serialVersionUID = 1L;
		public String toString(){
			return "Overs can be<=50";
		}
	}
	class OversException2 extends Exception{
		private static final long serialVersionUID = 1L;
		public String toString(){
			return "Overs can be<=40";
		}
	}
	class MatchTieException extends Exception{		
		private static final long serialVersionUID = 1L;

		public String toString(){
			return "Match is tie";
		}
	}

}
