import java.util.Random;

public class Chromosome {

    int[] solution;
    int wallsHit = 0;

    public Chromosome(int solutionSize) {
        this.solution = new int[solutionSize];
    }

    public void generateRandomSolution() {
        if (this.solution != null) {
            Random r = new Random();
            for (int i = 0; i < this.solution.length; i++) {
                this.solution[i] = r.nextInt(8) + 1;
            }
        }
    }

}
