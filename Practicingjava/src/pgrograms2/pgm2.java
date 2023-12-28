package pgrograms2;

public class pgm2 {
		private int sid;
		private String name;
		private int std;
		private char sec;
		private double per;
		
		
	public pgm2(int sid, String name, int std, char sec, double percentage) {
			super();
			this.sid = sid;
			this.name = name;
			this.std = std;
			this.sec = sec;
			this.per = per;
		}
	
			
			public double getsid()
				{
				return sid;
			}
			
			public String getname() 
			{
				return name;
				}
			
				public int getstd()
				{
					return std;
					}
					public char getsec() 
					{
						return sec;
						}
					public double getper(int sid) 
					{
						if(this.sid==sid)
						{
						return per;
						}
						return sid;
					}
			public void SetcustomerName(String name) {
				this.name=name;
			}
		


}
