package example;

import org.junit.Test;

public class XmlDecoderDetectorTest {

	@Test
	public void detectXmlDecoder() {
		try {
			byte[] b = XmlDecoderUtil.test("password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}