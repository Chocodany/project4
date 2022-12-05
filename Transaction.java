public class Transaction {
 private int blockNumber;
 private int index;
 private int gasLimit;
 private long gasPrice;
 private String fromAdr;
 private String toAdr;
 
 	public Transaction(int number, int index, int gasLimit, long gasPrice, String fromAdr, String toAdr){
 		this.blockNumber = number;
 		this.index = index;
 		this.gasLimit = gasLimit;
 		this.gasPrice = gasPrice;
 		this.fromAdr = fromAdr;
 		this.toAdr = toAdr;
 	}
 	
 	public int getBlockNumber() {
 		return this.blockNumber;
 	}
 	
 	public int getIndex() {
 		return this.index;
 	}
 	
 	public int getGasLimit() {
 		return this.gasLimit;
 	}
 	
 	public long getGasPrice() {
 		return this.gasPrice;
 	}
 	
 	public String getFromAddress() {
 		return this.fromAdr;
 	}
 	
 	public String getToAddress() {
 		return this.toAdr;
 	}
 	
 	public String toString() {
 		String thing = "Transaction " + index + " for Block " + blockNumber;
		return thing;
 		
 	}

 	public int compareTo(Transaction t) {
 		int compare = compareTo(t);
		return compare;
 	}
 	
	public double transactionCost() {
		return getGasPrice() * getGasLimit() / 1E+18;
	}
 	
 	
}
