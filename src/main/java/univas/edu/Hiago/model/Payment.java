package univas.edu.Hiago.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import univas.edu.Hiago.model.support.PaymentCategory;

@Entity
public class Payment {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Product_code;
	private Date Payment_date;
	private Date Due_date;
    private float Value;
    private String Payment_type;
    
    
    public Payment(String string, String string2, int i, PaymentCategory medium) {}

    public Payment(Long Product_code, Date Payment_date,Date Due_date, float Value,String Payment_type) {
        super();
        this.Product_code = Product_code;
        this.Payment_date = Payment_date;
        this.Due_date = Due_date;
        this.Value = Value;
        this.Payment_type = Payment_type;
    }

	public Long getProduct_code() {
		return Product_code;
	}

	public void setProduct_code(Long product_code) {
		Product_code = product_code;
	}

	public Date getPayment_date() {
		return Payment_date;
	}

	public void setPayment_date(Date payment_date) {
		Payment_date = payment_date;
	}

	public Date getDue_date() {
		return Due_date;
	}

	public void setDue_date(Date due_date) {
		Due_date = due_date;
	}

	public float getValue() {
		return Value;
	}

	public void setValue(float value) {
		Value = value;
	}

	public String getPayment_type() {
		return Payment_type;
	}

	public void setPayment_type(String payment_type) {
		Payment_type = payment_type;
	}

	

	
}
