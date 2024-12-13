package com.bharath.oops;

import java.time.LocalDate;

public class CreditCard {
	private String cardNumber;
	private LocalDate expDate;
	private String namOnCArd;
	private String CVV;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getNamOnCArd() {
		return namOnCArd;
	}

	public void setNamOnCArd(String namOnCArd) {
		this.namOnCArd = namOnCArd;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

}
