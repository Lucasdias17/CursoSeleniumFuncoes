package utils;

public class Utils {
	public void sleepSeconds(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
