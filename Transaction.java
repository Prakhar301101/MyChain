import java.security.*;
import java.util.ArrayList;

public class Transaction {

    public String transactionId;    
    public PublicKey sender;
    public PublicKey reciepient;
    public float value;
    public byte[] signature;

    public ArrayList<TransactionInput> inputs=new ArrayList<>();
    public ArrayList<TransactionOutput> outputs=new ArrayList<>();
    public static int sequence=0;

    public Transaction(PublicKey from,PublicKey to,float val,ArrayList<TransactionInput> input){
        this.sender=from;
        this.reciepient=to;
        this.value=val;
        this.inputs=input;
    }
    // private String calculateHash(){
        // creates Hash for transactionID
    // }
    public class TransactionInput{

    }
    public class TransactionOutput{

    }

}
/**
 * Transaction class->Creates a transaction 
 * TransactionId->Unique Id for every transaction
 * Sender->Public Key(address) of the Sender
 * Reciepient->Public key(address) of the reciever
 * Value->Amount of funds
 * Signature->Cryptographic signature that proves owner is sending this transaction and that data hasn't been tampered with
 * List of TransactionInput(inputs)-> They are references to prev transactions that proves the sender has enough fund to transfer
 * List of TransactionOutput(outputs)-> This shows the amount relevant addresses received in the transaction.(This are referred as inputs in new transactions)
 */

