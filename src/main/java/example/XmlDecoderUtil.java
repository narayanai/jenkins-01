package example;

import java.beans.XMLDecoder;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class XmlDecoderUtil {
	public static Object handleXml(InputStream in) {
		XMLDecoder d = new XMLDecoder(in);
		try {
			Object result = d.readObject();
			return result;
		} finally {
			d.close();
		}
	}
	public static byte[]  test(String password) throws NoSuchAlgorithmException {
		MessageDigest md5Digest = MessageDigest.getInstance("MD5");
	    md5Digest.update(password.getBytes());
	    byte[] hashValue = md5Digest.digest();
	    return hashValue;
	}
}
