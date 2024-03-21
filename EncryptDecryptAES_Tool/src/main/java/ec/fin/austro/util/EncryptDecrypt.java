package ec.fin.austro.util;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.util.encoders.Hex;

public class EncryptDecrypt {
  int iterations = 1000;
  
  String algorithm = "AES";
  
  String cipherS = "AES/CBC/PKCS5Padding";
  
  int keySize = 256;
  
  public String decryptAES(String clave, String valor) throws Exception {
    if (valor.trim().length() > 0) {
      byte[] message = valor.getBytes();
      String salt = new String(Arrays.copyOfRange(message, 0, 32));
      String iv = new String(Arrays.copyOfRange(message, 32, 64));
      String data = new String(Arrays.copyOfRange(message, 64, message.length));
      SecretKey key = generateKey(salt, clave);
      Cipher cipher = Cipher.getInstance(this.cipherS);
      cipher.init(2, key, new IvParameterSpec(hex(iv)));
      return new String(cipher.doFinal(Base64.decodeBase64(data.getBytes())));
    } 
    System.out.println("Variable a desencriptar esta vacio - DecryptAes con clave");
    return null;
  }
  
  public String encryptAES(String clave, String message) throws Exception {
    String salt = random(16);
    String iv = random(16);
    SecretKey key = generateKey(salt, clave);
    Cipher cipher = Cipher.getInstance(this.cipherS);
    cipher.init(1, key, new IvParameterSpec(hex(iv)));
    byte[] encrypted = cipher.doFinal(message.getBytes("UTF-8"));
    String code = Base64.encodeBase64String(encrypted).replaceAll("\r\n", "");
    return salt + iv + code;
  }
  
  public String decryptAES(String valor) throws Exception {
    if (valor.trim().length() > 0) {
      byte[] message = valor.getBytes();
      String salt = new String(Arrays.copyOfRange(message, 0, 32));
      String iv = new String(Arrays.copyOfRange(message, 32, 64));
      String clave = iv;
      String data = new String(Arrays.copyOfRange(message, 64, message.length));
      SecretKey key = generateKey(salt, clave);
      Cipher cipher = Cipher.getInstance(this.cipherS);
      cipher.init(2, key, new IvParameterSpec(hex(iv)));
      return new String(cipher.doFinal(Base64.decodeBase64(data.getBytes())));
    } 
    System.out.println("Variable a desencriptar esta vacio- DecryptAes sin clave");
    return null;
  }
  
  public String encryptAES(String message) throws Exception {
    String salt = random(16);
    String iv = random(16);
    String clave = iv;
    SecretKey key = generateKey(salt, clave);
    Cipher cipher = Cipher.getInstance(this.cipherS);
    cipher.init(1, key, new IvParameterSpec(hex(iv)));
    byte[] encrypted = cipher.doFinal(message.getBytes("UTF-8"));
    String code = Base64.encodeBase64String(encrypted).replaceAll("\r\n", "");
    return salt + iv + code;
  }
  
  private static String random(int length) {
    byte[] salt = new byte[length];
    (new SecureRandom()).nextBytes(salt);
    return hex(salt);
  }
  
  public static String hex(byte[] bytes) {
    return new String(Hex.encode(bytes));
  }
  
  public static byte[] hex(String str) {
    return Hex.decode(str.getBytes());
  }
  
  private SecretKey generateKey(String salt, String passphrase) throws InvalidKeySpecException, NoSuchAlgorithmException {
    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    KeySpec spec = new PBEKeySpec(passphrase.toCharArray(), hex(salt), this.iterations, this.keySize);
    return new SecretKeySpec(factory.generateSecret(spec).getEncoded(), this.algorithm);
  }
}
