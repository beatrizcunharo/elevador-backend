package elevador.java.elevadorbackend.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_andar_tb")
public class HistoricoAndar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_andar")
    private int id;

    @Column(name = "numero_andar")
    private int andar;

    @Column(name = "data_andar")
    private LocalDateTime data;

    public HistoricoAndar() {
        //construtor vazio
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}



