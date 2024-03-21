/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.austro.util;

import static ec.fin.austro.util.EncryptDecrypt.hex;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ba0100068f
 */
public class EncodeDecode {

    private EncodeDecode() {
    }  
    
    public static String decodeBase64EncodedToText(String base64Encoded) {
        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64Encoded);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }

    public static String encodeTextToBase64Encoded(String text) {
        String originalInput = text;
        String encodedString = java.util.Base64.getEncoder().encodeToString(originalInput.getBytes());
        return encodedString;
    }
}
