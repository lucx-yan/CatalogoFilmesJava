public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);
        boolean incluidoPlano = true;
        double notaFilme = 8.1;

        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + notaFilme) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com ator dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoLancamento;
        System.out.println(sinopse);
    }
}
