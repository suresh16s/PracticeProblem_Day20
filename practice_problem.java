public class practice_problem {
		private final int a, b;
		private final float c;

	public practice_problem(int a, int b, float c) {
        	this.a = a;
    		this.b = b;
     	        this.c = c;
		System.out.print("The addition is :"+(a+b+c));
	}

	public void add(int a,int b) {
		System.out.print("The multiply is :"+(a*b));

	}

	public void areaCircle(double c){
		final float pi=(float) 3.14;
		System.out.print("The Area is:"+(2*pi*c));

	}
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		System.out.print("The value is:"+x);
		practice_problem p=new practice_problem(5,1,5);
	        p.add(5,2);
		p.areaCircle(5.2);

}
}
