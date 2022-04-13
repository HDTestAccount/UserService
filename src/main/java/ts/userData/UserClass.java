package ts.userData;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "UserClass")
public class UserClass {

    public UserClass() {
    }

    public
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
