
public class Start {

	public static void main(String[] args) {
		
		SettingsManager sm1 = SettingsManager.getInstance();
		sm1.setDeviceName("Bob");
		sm1.setBackLightLevel((float) 0.10);

		SettingsManager sm2 = SettingsManager.getInstance();
		
		
		System.out.println("SM1: " + sm1.hashCode());
		
		System.out.println("SM2: " + sm2.hashCode());
		System.out.println("Name: " + sm2.getDeviceName());
		System.out.println("Light: " + sm2.getBackLightLevel());
		
	}

}
