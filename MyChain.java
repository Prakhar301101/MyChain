import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class MyChain {
    public static ArrayList<Block> blockchain=new ArrayList<Block>();
    public static void main(String[] args) {
        createBlock("The first block");
        createBlock("The second block");
        createBlock("The third block");
        createBlock("The fourth block");
        createBlock("The fifth block");
        view_Chain();        

    }

    //isValid will check for the integrity of the blockchain
    //It will compare the hash of the block with the calculated hash value
    //also the hash value of the previous block with prev_Hash value 
    public static void createBlock(String data){
        blockchain.add(new Block(data,getPrevHash()));
    }
    public static String getPrevHash(){
        return blockchain.size()==0?"0":blockchain.get(blockchain.size()-1).hash;
    }
    public static void view_Chain(){
        String blockchainJson=new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);
    }
    public static boolean isValid(){
        Block curBlock;
        Block prevBlock;
        for(int i=1;i<blockchain.size();i++){
            curBlock=blockchain.get(i);
            prevBlock=blockchain.get(i-1);
            //compare hash of cur block with calculated hash of cur block
            if(!curBlock.hash.equals(curBlock.calculateHash())){
                return false;
            }
            //compare hash of prev block with the registered hash of prev block stored in cur block
            if(!prevBlock.hash.equals(curBlock.prev_Hash)){
                return false;
            }
        }
        return true;
    }

}

//To Stop tampering of data we use proof of work