<h1>MyChain is a blockchain made with JAVA.</h1>

<p>
A blockchain is a chain/list of blocks.Each block in the blockchain will contain data, its own digital fingerprint, also the fingerprint of previous block so as to maintain integrity.

The fingerprint is also known as the Hash Value.
A block contains 2 Hash values its own and the previous block's, the hash value is calculated with the data and cryptographic algorithms like SHA256, so any change in the value will lead to inconsistency in the hash values leading to the blockchain being invalid.

</p>

<h3>How to create Blocks on MyChain</h3>
<p>
Just use the <span><b>createBlock</b></span> function, send your string data as parameter and call the createBlock function.
The createBlock function creates a Block object by using the data, the previous block's hash and the calculated hash value of the current block.
</p>

<h3>To view the Blockchain</h3>
<p>Use the <span><b>view_Chain</b></span> function to get the information of the blockchain in JSON format.
A library called gson is used to convert the output string into JSON data.
</p>

<h3>To check integrity of the Blockchain</h3>
<p>Use the <span><b>isValid</b></span> function.
It works by comparing the hash values between the current and previous blocks 
 </p>

<h3>All about blockchain mining!</h3>
<p>
Mining the blockchain refers to the process of validating and adding new transactions to the blockchain.
Here’s a simplified explanation of what it involves:
<ul>
<li><b>Collecting Transactions:</b> Miners collect a group of pending transactions from the network into a block.</li>
<li><b>Solving a Puzzle:</b> Miners compete to solve a complex mathematical puzzle that is part of the Proof of Work (PoW) system. This puzzle involves finding a specific number (nonce) that, when combined with the block data and passed through a cryptographic hash function, produces a hash that meets certain criteria (usually starts with a specific number of zeros).</li>
<li><b>Finding the Solution:</b> The first miner to solve the puzzle finds the correct nonce and thus creates a valid block.</li>
<li><b>Broadcasting the Block:</b> The miner broadcasts the new block to the entire network.</li>
<li><b>Verification:</b> Other nodes in the network quickly verify the solution to ensure it is correct and that the block follows all the network rules.</li>
<li><b>Adding the Block:</b> Once verified, the block is added to the blockchain, making the transactions in that block permanent and secure.</li>
<li><b>Reward:</b> The successful miner is rewarded with newly created cryptocurrency (block reward) and any transaction fees included in the transactions within the block.</li>
</ul>

<b>For mining Mychain, adjust the difficulty according to your pc's computational power.</b>

</p>
