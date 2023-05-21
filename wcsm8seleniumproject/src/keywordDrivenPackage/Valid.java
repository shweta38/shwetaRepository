package keywordDrivenPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Valid {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Flib flib = new Flib();
		
		String pd = flib.readPropertyData("./data/config.properties", "password");
		
		System.out.println(pd);
		
		
		
		
		
	}

}
