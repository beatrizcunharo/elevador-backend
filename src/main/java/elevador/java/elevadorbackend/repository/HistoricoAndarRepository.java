package elevador.java.elevadorbackend.repository;

import elevador.java.elevadorbackend.model.HistoricoAndar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoricoAndarRepository extends JpaRepository<HistoricoAndar, Long> {
    List<HistoricoAndar> findAllByOrderByDataDesc();

}
