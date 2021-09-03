package elevador.java.elevadorbackend.service.impl;

import elevador.java.elevadorbackend.model.HistoricoAndar;
import elevador.java.elevadorbackend.repository.HistoricoAndarRepository;
import elevador.java.elevadorbackend.service.HistoricoAndarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HistoricoAndarServiceImpl implements HistoricoAndarService {

    @Autowired
    private HistoricoAndarRepository historicoAndarRepository;

    @Override
    public List<HistoricoAndar> buscarTodos() {
        return historicoAndarRepository.findAllByOrderByDataDesc();
    }

    @Override
    public HistoricoAndar salvar(int andar) {
        HistoricoAndar historicoAndar = new HistoricoAndar();
        historicoAndar.setAndar(andar);
        historicoAndar.setData(LocalDateTime.now());
        return historicoAndarRepository.save(historicoAndar);
    }
}
