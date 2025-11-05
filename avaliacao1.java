
public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("=== SISTEMA ESCOLAR ===");
        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
        }

        // Cálculos das médias
        double media1Bimestre = (notas[0] + notas[1]) / 2;
        double media2Bimestre = (notas[2] + notas[3]) / 2;
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;
c        double media4Bimestre = (notas[6] + notas[7]) / 2;
        double media2Semestre = (media3Bimestre + media4Bimestre) / 2;

        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Exibição dos resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("1º Bimestre: %.2f%n", media1Bimestre);
        System.out.printf("2º Bimestre: %.2f%n", media2Bimestre);
        System.out.printf("1º Semestre: %.2f%n", media1Semestre);
        System.out.printf("3º Bimestre: %.2f%n", media3Bimestre);
        System.out.printf("4º Bimestre: %.2f%n", media4Bimestre);
        System.out.printf("2º Semestre: %.2f%n", media2Semestre);
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        input.close();
    }
}

