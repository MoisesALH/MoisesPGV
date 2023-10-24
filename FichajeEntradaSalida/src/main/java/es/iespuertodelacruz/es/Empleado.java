package es.iespuertodelacruz.es;

import java.util.Date;

public class Empleado{
    private int codigoEmpleado;
    private Date horaEntrada;

    public Empleado(int codigoEmpleado, Date horaEntrada) {
        this.codigoEmpleado = codigoEmpleado;
        this.horaEntrada = horaEntrada;
    }

    public Empleado(){

    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
