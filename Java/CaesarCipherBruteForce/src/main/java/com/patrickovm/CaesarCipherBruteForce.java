package com.patrickovm;

public class CaesarCipherBruteForce {
    public void crack(String cipherText) {
        // we try all the possible key values so the size of the ALPHABET
        // that's why Caesar cipher is weak: 27 possible encryptions
        // IT MAKES 27 ITERATIONS !!!
        String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int key = 0; key < ALPHABET.length(); ++key) {

            // reinitialize this to be an empty string
            StringBuilder plainText = decrypt(cipherText, ALPHABET, key);

            // print the actual decrypted string with the given key
            System.out.format("Cracking Caesar-cipher with %s key the result is: %s%n",
                    key, plainText);
        }
    }

    private static StringBuilder decrypt(String cipherText, String ALPHABET, int key) {
        StringBuilder plainText = new StringBuilder();

        // we just have to make a simple Caesar decryption
        for (int i = 0; i < cipherText.length(); ++i) {
            char character = cipherText.charAt(i);
            int charIndex = ALPHABET.indexOf(character);
            int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());
            plainText.append(ALPHABET.charAt(decryptedIndex));
        }
        return plainText;
    }
}
