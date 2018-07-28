
public class Phone {
	private String number;
	private Network network;
	
	public Phone(String number, Network network) {
		super();
		this.number = number;
		this.network = network;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the network
	 */
	public Network getNetwork() {
		return network;
	}

	/**
	 * @param network the network to set
	 */
	public void setNetwork(Network network) {
		this.network = network;
	}

	
	/*
	 * Метод регистрации в сети
	 */
	public void registration() {
		if (this.checkRegistration()) {
			System.out.println("Such number has been registered before");
			return;
		}
		if (Network.checkLengthOfMass()==false) Network.expendArray(); //Проверка если размерности мало то увеличить
		String [] mass = Network.getPhones();
		mass[Network.getFlag()]=this.getNumber();
		Network.setFlag(Network.getFlag()+1);
		Network.setPhones(mass);
		System.out.println("Number "+this.getNumber()+" has been registered");
		
	}
	/*
	 * Метод звонка на другой номер
	 * 
	 */
	public void call(Phone contact) {
		if (this.getNumber().equals(contact.getNumber())) {
			System.out.println("You can't to call to your number");
			return;
		}
		if (contact.checkRegistration()) 
			System.out.println("Number "+this.getNumber()+ " calling to "+contact.getNumber());
		else System.out.println("Such number isn't exist or not registered");
	}
	/*
	 * Метод проверки регистрации в сети
	 */
	public  boolean checkRegistration() {
		String [] mass =Network.getPhones();  
		for (int i = 0; i < mass.length; i++) {
			if (this.getNumber().equals(mass[i])) return true;			
		}  return false;
	}

}
