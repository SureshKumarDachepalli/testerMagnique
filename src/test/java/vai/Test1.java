package vai;

public class Test1 
{
	    public String param1;
	    public String abri;
	    
//		public Test1()
//		{
//		   this.param1="my name is vaibhav b y";
//		}
     	public Test1(String abri)
		{
			this.abri= abri;
	
		}
		public static void main(String[] args) 
		{
			Test1 ob=new Test1("No1");
			
		//	System.out.println(ob.param1);
			System.out.println(ob.abri);
		}
}
