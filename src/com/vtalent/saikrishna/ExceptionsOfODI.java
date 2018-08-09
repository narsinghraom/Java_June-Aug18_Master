package com.vtalent.saikrishna;

public class ExceptionsOfODI 
{
	class WeatherException extends Exception
	{
		private static final long serialVersionUID = 1L;
		public String toString()
		{
			return "rain stops play";
		}
	}
	class OverException1 extends Exception
	{
		private static final long serialVersionUID = 1L;
		public String toString()
		{
			return "overs can be <= 50";
		}
	}
	class OverException2 extends Exception
	{
		private static final long serialVersionUID = 1L;

		public String toString()
		{
			return "overs can be <= 40";
		}
	}
	
	class MatchTieException extends Exception
	{
		private static final long serialVersionUID = 1L;
		public String toString()
		{
			return "match tie";
		}
	}
}
