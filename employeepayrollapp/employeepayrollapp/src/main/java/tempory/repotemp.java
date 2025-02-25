package tempory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repotemp extends JpaRepository<temporyEmployee,Long> {
}
