public class App {
    public static void main(String[] args) {

        // Coment line 01
        // Coment line 02

        clearScreen();

        System.out.println("\nDiscipline: Economic Engineering For Software");
        System.out.println("Student: Matheus Machado de Oliveira Andrade\n");

        /*
         * Coment line 03-05
         */
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar o terminal: " + e.getMessage());
        }
    }
}
