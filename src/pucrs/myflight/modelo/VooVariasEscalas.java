package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooVariasEscalas extends VooEscalas{

    private Rota novaRotaFinal;

    public VooVariasEscalas(Rota rota, Rota rotafinal, Rota novaRotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota,rotafinal,datahora,duracao);
        this.novaRotaFinal = novaRotaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "-> " + novaRotaFinal;
    }
}
