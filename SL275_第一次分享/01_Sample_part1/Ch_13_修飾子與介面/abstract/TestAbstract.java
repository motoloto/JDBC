//飛機類別(父類別)
//抽象類別
abstract class Airplane {
	protected double fuel;
	protected String iro;

	//抽象方法
	public abstract void display();

	public void setdata(double num,String str) {
		fuel = num;
		iro = str;
	}
}
//巨無霸噴射機類別(子類別)
class Jumbojet extends Airplane {
	//定義抽象類別的動作
	public void display() {
		System.out.print("飛機的燃料有" + fuel);
		System.out.println(" 顏色是" + iro + "色的");
	}
}

class TestAbstract {
	public static void main(String args[]) {
		Jumbojet jumbo = new Jumbojet();
		jumbo.setdata(100,"紅");
		jumbo.display();
	}
}
