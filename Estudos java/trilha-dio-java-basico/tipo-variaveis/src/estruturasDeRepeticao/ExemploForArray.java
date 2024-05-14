package estruturasDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice de elementos inicia em zero
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

//        for (int x = 0; x < alunos.length; x++) {
//            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

        //usando o for each

        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

        }
    }
