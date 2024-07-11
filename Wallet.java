import java.security.*;

public class Wallet {
    public PrivateKey privateKey;
    public PublicKey publicKey;
    public Wallet(){
        generateKeyPair();
    }
    public void generateKeyPair(){
        try {
            KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            keyGen.initialize(2048,random);
            KeyPair keyPair=keyGen.generateKeyPair();
            privateKey=keyPair.getPrivate();
            publicKey=keyPair.getPublic();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
}


/**
 * For our (ChadCoin), publicKey will act as the address
 * We generate both the keys in Pair when the wallet is instantiated
 * We need to keep the private key safe because it gives access to our wallet
 * We generate the Public key with the help of private key 
 * The Public key is used when someone else is sending us money
 * When we send someones else money we sign the transaction with our private key
 * So the recipient can verify it(transaction) with my public key as its accessible to all
 */