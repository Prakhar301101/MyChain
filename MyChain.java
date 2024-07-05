import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class MyChain {
    public static ArrayList<Block> blockchain=new ArrayList<Block>();
    public static void main(String[] args) {
        blockchain.add(new Block("The first Block", "0"));
        blockchain.add(new Block("The second Block",blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("The third Block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("The fourth Block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("The fifth Block", blockchain.get(blockchain.size()-1).hash));

        String blockchainJson=new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);

    }
}