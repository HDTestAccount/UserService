package ts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ts.userData.UserClass;

public interface UserClassRepository extends JpaRepository<UserClass, Long> {
}
