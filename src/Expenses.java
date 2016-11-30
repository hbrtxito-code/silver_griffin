/**
 * Created by hbrtxito on 11/12/16.
 */

import java.io.Serializable;
import java.util.Date;

public class Expenses implements Serializable {

    private int id;
    private String category;
    private String product ;
    private int quantity ;
    private float price;
    private String payment ;



    private Date date;
    private String comments;
    private String store;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getStore() { return store;  }

    public void setStore(String store) { this.store = store; }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return " ID= " + id + "  Category= " + category + " Product= " + product + " Quantity = " + quantity + " Price = "
                + price + " Payment = " + payment + " Date = " + date  + " Comments =" + comments ;
    }

}

