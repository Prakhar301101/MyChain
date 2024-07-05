import java.util.Date;

public class Block {
    public String hash;
    public String prev_Hash;
    private String data;
    private long timeStamp;

    public Block(String data,String prev_Hash){
        this.data=data;
        this.prev_Hash=prev_Hash;
        this.timeStamp=new Date().getTime();
        this.hash=calculateHash();
    }

    public String calculateHash(){
        String calculated_HashString=StringUtil.apply_SHA256(prev_Hash+Long.toString(timeStamp)+data);
        return calculated_HashString;
    }
}

/**
 * Block class makes up the blocks in the chain     
 * Hash-> contains the hash value of the current block
 * data-> contains the data stored in the current block
 * prev_Hash-> contains the hash value of the previous block
 * timeStamp-> stores time at which the current block is created
 */
