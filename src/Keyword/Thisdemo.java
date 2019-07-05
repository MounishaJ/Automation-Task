package Keyword;

public class Thisdemo {

	int x=50;
	public static void main(String[] args) {
		// 7-5-2019
		Thisdemo o=new Thisdemo();
		o.getData();
	}
	public void getData()
	{
		int x=90;
		System.out.println(x+this.x);
	}

}
