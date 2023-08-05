package restassure;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutiils {
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("john"+generatedString);
	}
	
		public static String getLastName() {
			String generatedString = RandomStringUtils.randomAlphabetic(1);
			return("kenedy"+generatedString);
		}
		
		public static String getUserName() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return("john"+generatedString);
		}	
		
		public static String getPassword() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return("john"+generatedString);
		}	
		
		public static String getEmail() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return(generatedString+"gmail.com");
		}
		public static String empName() {
			String generatedString = RandomStringUtils.randomAlphabetic(1);
			return("john"+generatedString);
		}
		public static String empSal() {
			String generatedString = RandomStringUtils.randomAlphabetic(5);
			return(generatedString);
		}
		public static String empAge() {
			String generatedString = RandomStringUtils.randomAlphabetic(3);
			return(generatedString);
		}
	
	}


