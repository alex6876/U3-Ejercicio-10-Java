
public class Main {
    public static void main(String[] args) {
        BilleteraVirtual billetera =
                new BilleteraVirtual("usuario.mp", 50000);

        System.out.println("--- Primera transferencia ---");
        billetera.transferir(10000);

        System.out.println("\n--- Supera el saldo disponible ---");
        billetera.transferir(60000);

        System.out.println("\n--- Supera el límite ---");
        billetera.actualizarLimite(20000, "usuario.mp");
        billetera.transferir(25000);

        System.out.println("\n--- Titular no autorizado ---");
        billetera.actualizarLimite(30000, "otro.usuario");

        System.out.println("\n--- Transferencia exitosa ---");
        billetera.transferir(15000);

        System.out.println("\n--- Estado final ---");
        System.out.println("Alias: " + billetera.getAlias());
        System.out.println("Saldo: $" + billetera.getSaldo());
        System.out.println("Límite diario: $"
                + billetera.getLimiteDiarioTransferencia());
    }
}
