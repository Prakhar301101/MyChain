import java.security.MessageDigest;

public class StringUtil {
    public static String apply_SHA256(String data){
        try{
            MessageDigest digest=MessageDigest.getInstance("SHA-256");
            byte[] hash=digest.digest(data.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}

/**
 * We will use this String Utility class for the SHA256 algorithm
 * SHA256 is a cryptographic algorithm 
 * It will help us to create a digital footprint for the data(hash)
 */
