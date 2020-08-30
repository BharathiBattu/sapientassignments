package procFeeCal;

import java.util.Date;

public class TranRepo {

	String Ex_TransactionId;
	String ClientId;
	String SecurityId;
	String TransactionType;
	String PriorityFlag;
    Date TransactionDate;
    Double MarketValue;
	Double ProcessingFee;
	int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Double getProcessingFee() {
		return ProcessingFee;
	}

	public void setProcessingFee(Double processingFee) {
		ProcessingFee = processingFee;
	}
	public String getEx_TransactionId() {
		return Ex_TransactionId;
	}
	public void setEx_TransactionId(String ex_TransactionId) {
		this.Ex_TransactionId = ex_TransactionId;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		this.ClientId = clientId;
	}
	public String getSecurityId() {
		return SecurityId;
	}
	public void setSecurityId(String securityId) {
		this.SecurityId = securityId;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		this.TransactionType = transactionType;
	}
	public String getPriorityFlag() {
		return PriorityFlag;
	}
	public void setPriorityFlag(String priorityFlag) {
		this.PriorityFlag = priorityFlag;
	}
	public Date getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.TransactionDate = transactionDate;
	}
	public Double getMarketValue() {
		return MarketValue;
	}
	public void setMarketValue(Double marketValue) {
		this.MarketValue = marketValue;
	}
	public TranRepo() {
		super();
	}
	
	@Override
	public String toString() {
		return " " + Ex_TransactionId + ", " + ClientId + ", " + SecurityId + ", " + TransactionType + ", "
				+ TransactionDate + ", " + MarketValue + ", " + PriorityFlag + "";
	}
	
}
	
    
    


