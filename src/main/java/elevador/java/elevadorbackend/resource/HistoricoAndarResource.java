package elevador.java.elevadorbackend.resource;

import elevador.java.elevadorbackend.dto.HistoricoAndarDto;
import elevador.java.elevadorbackend.model.HistoricoAndar;
import elevador.java.elevadorbackend.service.HistoricoAndarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/historico-andar")
public class HistoricoAndarResource {

    @Autowired
    private HistoricoAndarService historicoAndarService;

    @GetMapping()
    private List<HistoricoAndar> buscarTodos() {
        return historicoAndarService.buscarTodos();
    }

    @PostMapping()
    private ResponseEntity<HistoricoAndar> salvar(@RequestBody HistoricoAndarDto historicoAndar){
        return ResponseEntity.status(HttpStatus.CREATED).body(historicoAndarService.salvar(historicoAndar.getAndar()));
    }
}
