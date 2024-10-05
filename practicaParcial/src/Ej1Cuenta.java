public class Ej1Cuenta {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000.0);
        Cliente cliente = new Cliente();
        cliente.setCuentaBancaria(cuenta);

    }
}

class Cliente {

    private CuentaBancaria cuen;

    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuen = cuenta;
    }

}

class CuentaBancaria {
    private Long numCuenta;
    private Double saldo;

    public void depositar(Double monto) {

        saldo += monto;
    }

    public void retirar(Double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("El monto supera la cantidad de saldo disponible (" + saldo + ")");
        }
    }
}
