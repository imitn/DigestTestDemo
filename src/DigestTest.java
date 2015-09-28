import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

public class DigestTest {

	private static String src = "耐得住寂寞，才守得住繁华";
	private static String md5="";
	private static String md2="";

	public static String jdkMD5() {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] md5Bytes=md.digest(src.getBytes());
			md5=Hex.encodeHexString(md5Bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return md5;
	}
	
	public static String jdkMD2() {

		try {
			MessageDigest md = MessageDigest.getInstance("MD2");
			byte[] md2Bytes=md.digest(src.getBytes());
			md2=Hex.encodeHexString(md2Bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return md2;
	}

	public static void main(String[] args) {

		System.out.println("JDK MD5: "+src+"|"+jdkMD5());
		System.out.println("JDK MD2: "+src+"|"+jdkMD2());
	}

}
