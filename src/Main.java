
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network network1 = new Network("MTS");
		Phone ph1 = new Phone("38050323001",network1);
		Phone ph2 = new Phone("38050323002",network1);
		Phone ph3 = new Phone("38050323003",network1);
		Phone ph4 = new Phone("38050323004",network1);
		Phone ph5 = new Phone("38050323001",network1);
		ph1.registration();
		ph2.registration();
		ph3.registration();
		ph5.registration();
		System.out.println(ph1.getNumber());
	   ph1.call("38050323001");
		ph1.call(ph3.getNumber());
		ph1.call(ph4.getNumber());         
	}

}
