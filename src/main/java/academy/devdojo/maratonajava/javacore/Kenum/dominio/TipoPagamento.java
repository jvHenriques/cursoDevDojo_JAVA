package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
        CREDITO{
            @Override
            public double desconto(double valor) {
                return valor * 0.05;
            }
        },
        DEBITO{
            @Override
            public double desconto(double valor) {
                return valor * 0.1;
            }
        };
        public abstract double desconto(double valor);
}
