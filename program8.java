class Codex{
	public static void main(String[] args){
	int x=10;
	int y=8;
	System.out.println(++x < ++y && --x > ++y);
	int a=5;
	int b=6;
	System.out.println(++a < ++b || --a > ++b);
	System.out.println(x);
	System.out.println(y);
	System.out.println(a);
	System.out.println(b);
}
}

class Demo{
	public static void main(String[] args){
	int x=5;
	int y=6;
	boolean ans=(++x < ++y && --x > ++y);
	System.out.println(ans);
	System.out.println(x);
	System.out.println(y);
	
}
}


class Logic{
	public static void main(String[] args){
	int x=5;
	int y=6;
	boolean ans=(++x < ++y || --x > ++y);
	System.out.println(ans);
	System.out.println(x);
	System.out.println(y);
	
}
}