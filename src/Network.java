import java.lang.*;

public class Network {
	private String name;
	private static int flag;
	private static String[] phones=new String[50];
	
	
	
	public Network(String name) {
		super();
		this.name = name;
	}
	
	
	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the flag
	 */
	public static int getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public static void setFlag(int flag) {
		Network.flag = flag;
	}

	/**
	 * @return the phones
	 */
	public static String[] getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public static void setPhones(String[] phones) {
		Network.phones = phones;
	}
	/*
	 * метод проверки размерности
	 */
	public static boolean checkLengthOfMass() {
		if (Network.flag==Network.phones.length) return false;
		return true;
	}
	/*
	 * метод расширения размерности массива
	 */
	public static void expendArray() {
		String [] mass = new String[Network.phones.length+20];
		System.arraycopy(Network.phones, 0, mass, 0, Network.phones.length);
		Network.phones = mass;
		
	}
	
	
	
	
	
	

}
