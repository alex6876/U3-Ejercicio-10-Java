
public class BilleteraVirtual {
    private String alias;
    private double saldo;
    private double limiteDiarioTransferencia;

    public BilleteraVirtual(String alias, double saldo) {
        this.alias = alias;
        this.saldo = saldo >= 0 ? saldo : 0;
        this.limiteDiarioTransferencia = 1000000;
    }

    public void transferir(double monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Transferencia rechazada: saldo insuficiente.");
        } else if (monto > limiteDiarioTransferencia) {
            System.out.println("Transferencia rechazada: supera el límite.");
        } else {
            saldo = saldo - monto;
            System.out.println("Transferencia realizada correctamente.");
        }
    }

    public void actualizarLimite(double nuevoLimite, String aliasTitular) {
        if (!alias.equals(aliasTitular)) {
            System.out.println("Cambio rechazado: titular no autorizado.");
        } else if (nuevoLimite <= 0) {
            System.out.println("El límite debe ser mayor que cero.");
        } else {
            limiteDiarioTransferencia = nuevoLimite;
            System.out.println("Límite actualizado correctamente.");
        }
    }

    public String getAlias() {
        return alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDiarioTransferencia() {
        return limiteDiarioTransferencia;
    }
}
