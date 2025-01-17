package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;


import java.util.Objects;



public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "id não pode ser nulo");
        Objects.requireNonNull(nome, "nome não pode ser nulo");

        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Manga manga = (Manga) object;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se this < outroManga; return -1
        //se this == outroManga; return 0
        //positivo se this > outroManga; return 1
//        if (this.id < outroManga.getId()){
//            return -1;
//        } else if (this.id == outroManga.getId()) {
//            return 0;
//        }else{
//            return 1;
//        }
        return this.nome.compareTo(outroManga.getNome());
//        return Double.compare(this.preco, outroManga.getPreco());
//        return Double.valueOf(this.preco).compareTo(outroManga.getPreco());
//        return this.id.compareTo(outroManga.getId());
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
