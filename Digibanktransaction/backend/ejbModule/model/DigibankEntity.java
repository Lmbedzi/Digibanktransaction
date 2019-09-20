package model;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity(name="digibank_tbl")
public class DigibankEntity {
	
	
	
//	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 0013)
//	@GeneratedValue(strategy=GenerationType.AUTO)

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transCode_generator")
	@SequenceGenerator(name="transCode_generator", sequenceName = "transCode_generator_seq", initialValue = 0013, allocationSize=50)
	
	
	private Long transaction_Code;
	private String name;
	private String source_Passport;
	private String destination_Passport;
	private String destination_Bank;
	private String destination_Country;
	private Integer account_Number;
	private BigDecimal amount;
	
	public Long getTransaction_Code() {
		return transaction_Code;
	}
	public void setTransaction_Code(Long transaction_Code) {
		this.transaction_Code = transaction_Code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource_Passport() {
		return source_Passport;
	}
	public void setSource_Passport(String source_Passport) {
		this.source_Passport = source_Passport;
	}
	public String getDestination_Passport() {
		return destination_Passport;
	}
	public void setDestination_Passport(String destination_Passport) {
		this.destination_Passport = destination_Passport;
	}
	public String getDestination_Bank() {
		return destination_Bank;
	}
	public void setDestination_Bank(String destination_Bank) {
		this.destination_Bank = destination_Bank;
	}
	public String getDestination_Country() {
		return destination_Country;
	}
	public void setDestination_Country(String destination_Country) {
		this.destination_Country = destination_Country;
	}
	public Integer getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(Integer account_Number) {
		this.account_Number = account_Number;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
