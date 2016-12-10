import java.util.Date;

/**
 * Created by hbrtxito on 11/29/16.
 */
public class Income {

    private String str_user;
    private float amount;
    private String comments;
    private Date date;



    public String getStr_user() {
        return str_user;
    }

    public void setStr_user(String str_user) {
        this.str_user = str_user;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "  User = " + str_user + " Income = " + amount + " Date = " + date  + " Comments =" + comments ;
    }
}
