package io.vertx.ext.auth.htpasswd.digest;

/**
 * Created by nevenr on 15/03/2017.
 */
public class Hex {

  final protected static char[] hexArray = "0123456789abcdef".toCharArray();
  public static String bytesToHex(byte[] bytes) {
    char[] hexChars = new char[bytes.length * 2];
    for ( int j = 0; j < bytes.length; j++ ) {
      int v = bytes[j] & 0xFF;
      hexChars[j * 2] = hexArray[v >>> 4];
      hexChars[j * 2 + 1] = hexArray[v & 0x0F];
    }
    return new String(hexChars);
  }

}
