
import java.time.LocalDateTime;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected LocalDateTime horaEntrada;

    public Veiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getPlaca() {
        return placa;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public abstract double calcularValor(LocalDateTime horaSaida);
}

