package com.patrickovm;

public class Main {
    public static void main(String[] args) {
        String text = "My name is Kevin and I am a working as a software engineer at a multinational company and my main interests are algorithms and machine learning";

        CaesarCipher cipher = new CaesarCipher();

        int key = 10;

        String cipherText = cipher.encrypt(text, key);
        System.out.println(cipherText);

        System.out.println(cipher.decrypt(cipherText, key));
    }
}