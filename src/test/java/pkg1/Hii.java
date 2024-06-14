package pkg1;

public class Hii
{
	public String attribute;
	
	public Hii(String attribute)
	{
		this.attribute=attribute;
	}
	public static void main(String[] args) 
	{
	  Hii obj=new Hii("hello, World");
	  System.out.println(obj.attribute);
	}

}
