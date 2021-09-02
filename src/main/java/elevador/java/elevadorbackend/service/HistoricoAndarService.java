package elevador.java.elevadorbackend.service;

import elevador.java.elevadorbackend.model.HistoricoAndar;

import java.util.List;

public interface HistoricoAndarService {

    List<HistoricoAndar> buscarTodos();
    HistoricoAndar salvar(int andar);

}
