package ts.userData;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class UserClass {

    public UserClass() {
    }

    public
    @Id
    @GeneratedValue
    long id;

    int age;
    public String name;
}
