package com.example.diyashop.model;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

/**
 * Advanced Encryption Standard is used for Password encryption.
 * It is widely used symmetric-key encryption algorithm.
 */
public class Encryptor {

    private  static final  byte[] SALT = new byte[16];
    private static String PASSWORD="1234567";
   private static IvParameterSpec iv = generateIv();



    static {
        new SecureRandom().nextBytes(SALT);
    }
    /**
     * Secret key is generated using PBKDF2WithHmacSHA256 Algorithm.
     * In AES Algorith, we need three parameters: input data, secret key, and IV. Input data is in this case is String.
     * PBKDF2WithHmacSHA256  algorithm is used for generating a key from given password.
     *
     * @param
     * @param input
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static SecretKey generateKeyFromPassword(String  input) throws NoSuchAlgorithmException,  InvalidKeySpecException {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

         String salt =Base64.getEncoder().encodeToString(SALT);
         KeySpec spec = new PBEKeySpec(PASSWORD.toCharArray(),salt.getBytes(),65536,256);
        SecretKey secretKey = new SecretKeySpec(factory.generateSecret(spec).getEncoded(),"AES");
        return secretKey;
    }
    /**
     *Initialization Vector(IV) is generated
     *
     */

    public static IvParameterSpec generateIv(){
        byte[] iv= new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    /**
     *
     * @param input is encrypted
     * @return
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidAlgorithmParameterException
     * @throws InvalidKeyException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     */
    public static  String encrypt( String input) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {

          String algorithm="AES/CBC/PKCS5Padding";
        Cipher cipher = Cipher.getInstance(algorithm);

        SecretKey key = generateKeyFromPassword(input);
         cipher.init(Cipher.ENCRYPT_MODE,key,iv);
        byte[] cipherText = cipher.doFinal(input.getBytes());
        return  Base64.getEncoder().encodeToString(cipherText);
    }

    /**
     *
     *
     * @param cipherText is decrypted
     * @return
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidAlgorithmParameterException
     * @throws InvalidKeyException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     */
    public static String decrypt(String cipherText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {
        String algorithm="AES/CBC/PKCS5Padding";
        SecretKey key = generateKeyFromPassword(cipherText);
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE,key,iv);
        byte[] plainText= cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(plainText);
    }

    public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeySpecException, InvalidKeyException {
        String password = "1234567";
        String encryptPassword = encrypt(password);
        String decryptedPassword = decrypt(encryptPassword);

        System.out.println("Decrypted Password: " + decryptedPassword);
        System.out.println("Encrypted Password: " + encryptPassword);
        System.out.println("Check --> " + password.equals(decryptedPassword));
    }
}
