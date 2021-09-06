package elevador.java.elevadorbackend.service;

import elevador.java.elevadorbackend.model.HistoricoAndar;
import elevador.java.elevadorbackend.repository.HistoricoAndarRepository;
import elevador.java.elevadorbackend.service.impl.HistoricoAndarServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class HistoricoAndarServiceImplTest {

    @InjectMocks
    private HistoricoAndarServiceImpl historicoAndarServiceImpl;

    @Mock
    private HistoricoAndarRepository historicoAndarRepository;

    @Test
    public void buscarTodosTest() {

        List<HistoricoAndar> listaHistoricoAndar = new ArrayList<>();

        when(historicoAndarRepository.findAllByOrderByDataDesc()).thenReturn(listaHistoricoAndar);

        List<HistoricoAndar> listaHistoricoAndarResult = historicoAndarServiceImpl.buscarTodos();

        assertEquals(listaHistoricoAndar, listaHistoricoAndarResult);
    }

    @Test
    public void salvarTest(){
        HistoricoAndar historicoAndar = new HistoricoAndar();

        when(historicoAndarRepository.save(Mockito.any())).thenReturn(historicoAndar);

        HistoricoAndar historicoAndarResult = historicoAndarServiceImpl.salvar(1);

        assertEquals(historicoAndar, historicoAndarResult);
    }

}
