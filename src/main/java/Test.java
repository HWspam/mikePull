import javax.persistence.*;

/**
 * Created by erikjakubowski on 10/21/17.
 */
@Entity
@Table(name = "Test")
public class Test {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String test;

    public Test(){
        //
    }

    public Test(int id, String test) {
        this.id = id;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
