
public class TestG {
public static void main(String[] args) {
	System.out.println("*************************************");
	ThirdGen tg =new ThirdGen();
	tg.call();
	tg.camera();
	tg.game();
	tg.msg();
	System.out.println("********************************");
	FirstGen fg=new FirstGen();
	fg.call();
	fg.msg();
	System.out.println("******************************");
	SecondGen sg =new SecondGen();
	sg.call();sg.game();sg.msg();
	
}
}
