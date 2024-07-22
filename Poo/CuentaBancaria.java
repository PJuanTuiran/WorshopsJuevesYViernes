public class CuentaBancaria {
    private String titular;
    private double balance;

    public CuentaBancaria(String titular, double balanceInicial) {
        this.titular = titular;
        this.balance = balanceInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            return

        }
        System.out.println("el valor es negativo")
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && balance >= cantidad) {
            balance -= cantidad;
            return true;
        }
        return false;
    }

    public void mostrarBalance() {
        System.out.println("Balance actual: " + balance);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Maria Lopez", 1000);
        System.out.println("Titular: " + cuenta.getTitular());
        cuenta.mostrarBalance();
        cuenta.depositar(500);
        cuenta.mostrarBalance();
        if (cuenta.retirar(200)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Retiro fallido");
        }
        cuenta.mostrarBalance();
        if (cuenta.retirar(2000)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("Retiro fallido");
        }
        cuenta.mostrarBalance();
    }
}
