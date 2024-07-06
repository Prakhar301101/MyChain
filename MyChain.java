import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class MyChain {
    public static ArrayList<Block> blockchain=new ArrayList<Block>();
    public static int difficulty=4;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data");
        String data=sc.nextLine();
        createBlock(data);
        view_Chain();        
    }

    //isValid will check for the integrity of the blockchain
    //It will compare the hash of the block with the calculated hash value
    //also the hash value of the previous block with prev_Hash value 
    public static void createBlock(String data){
        blockchain.add(new Block(data,getPrevHash()));
        System.out.println("Trying to mine the block no:"+blockchain.size()+" ....Please wait!");
        blockchain.get(blockchain.size()-1).mineBlock(difficulty);
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
        char ch[]=new char[difficulty];
        for(int i=0;i<difficulty;i++) ch[i]='0';
        String target=new String(ch);
        for(int i=1;i<blockchain.size();i++){
            curBlock=blockchain.get(i);
            prevBlock=blockchain.get(i-1);
            //compare hash of cur block with calculated hash of cur block
            if(!curBlock.hash.equals(curBlock.calculateHash())){
                System.out.println("Current hashes do not match");
                return false;
            }
            //compare hash of prev block with the registered hash of prev block stored in cur block
            if(!prevBlock.hash.equals(curBlock.prev_Hash)){
                System.out.println("Previous hash do not match");
                return false;
            }
            if(!curBlock.hash.substring(0,difficulty).equals(target)){
                System.out.println("Block was not mined");
                return false;
            }

        }
        return true;
    }

}

//To Stop tampering of data we use proof of work