import java.util.Date;

public class Block {
    public String hash;
    public String prev_Hash;
    private String data;
    private long timeStamp;
    private int nonce;

    public Block(String data,String prev_Hash){
        this.data=data;
        this.prev_Hash=prev_Hash;
        this.timeStamp=new Date().getTime();
        this.hash=calculateHash();
        this.nonce=0;
    }

    public String calculateHash(){
        String calculated_HashString=StringUtil.apply_SHA256(prev_Hash+Long.toString(timeStamp)+Integer.toString(nonce)+data);
        return calculated_HashString;
    }
    public void mineBlock(int difficulty){
        char ch[]=new char[difficulty];
        for(int i=0;i<difficulty;i++) ch[i]='0';
        String target=new String(ch);
        while(!hash.substring(0,difficulty).equals(target)){
            nonce++;
            hash=calculateHash();
        }
        System.out.println("Block has been Mined!!! :"+ hash);
    }
}

/**
 * Block class makes up the blocks in the chain     
 * Hash-> contains the hash value of the current block
 * data-> contains the data stored in the current block
 * prev_Hash-> contains the hash value of the previous block
 * timeStamp-> stores time at which the current block is created
 * nonce->(important) variable short for(number used once) used to find the hash that meets specific criteria
 * [criteria in our case is the hash starting with certain number of 0's.]
 */
