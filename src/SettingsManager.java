
public class SettingsManager {
	
	private static SettingsManager INSTANCE = new SettingsManager();
	private String deviceName;
	private float backLightLevel;
	
	
	public SettingsManager() {
		
	}
	
	public static SettingsManager getInstance() {
		return INSTANCE;
	}


	public String getDeviceName() {
		return deviceName;
	}


	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	public float getBackLightLevel() {
		return backLightLevel;
	}


	public void setBackLightLevel(float backLightLevel) {
		this.backLightLevel = backLightLevel;
	}
	
}
