import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Andreia");
        nomes.add("Antonio");
        nomes.add("Juanito");
        nomes.add("Amanda");

        FiltroNome iniciaComA = nome -> nome.startsWith("A");
        nomes.stream().filter(nome -> iniciaComA.testar(nome)).forEach(System.out::println);

    }
}
