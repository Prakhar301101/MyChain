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
