public class ContasTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234, 1234);
        cc.deposita(1350);
        System.out.println();
        cc.saca(250);
        ContaPoupanca cp = new ContaPoupanca(345, 3456);
        cp.deposita(230);
        cc.transfere(500, cp);
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
