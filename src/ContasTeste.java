public class ContasTeste {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1234, 1234);
        cc.deposita(1350);
        System.out.println();
        cc.saca(250);
        Conta cp = new ContaPoupanca(345, 3456);
        cp.deposita(230);
        cc.transfere(500, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
