import java.lang.*;

public class Network {
	private String name;
	private int flag;
	private String[] phones=new String[50];
	
	
	
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
	public int getFlag() {
		return flag;
	}	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}

	/**
	 * @return the phones
	 */
	public String[] getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(String[] phones) {
		this.phones = phones;
	}
	/*
	 * метод проверки размерности
	 */
	public boolean checkLengthOfMass() {
		if (this.flag==this.phones.length) return false;
		return true;
	}
	/*
	 * метод расширения размерности массива
	 */
	public  void expendArray() {
		String [] mass = new String[this.phones.length+20];
		System.arraycopy(this.phones, 0, mass, 0, this.phones.length);
		this.phones = mass;
		
	}
	public void check() {
		if (this.checkLengthOfMass()==false) this.expendArray(); //если размерности мало то увеличить
	}

	
	
	
	
	

}
