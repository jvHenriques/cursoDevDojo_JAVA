package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain;

public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(5), SUPER_SAYAJIN3(5);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
