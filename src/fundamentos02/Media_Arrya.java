package fundamentos02;
import java.util.Scanner;

public class Media_Arrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media,soma=0;
		float notas[] = new float[5];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i<notas.length;i++) {
			System.out.printf("Informe a nota do %dº aluno: ",i+1);
			notas[i] = entrada.nextFloat();
		}
		for (float i:notas)
			soma+=i;
		media = soma/notas.length;
		System.out.printf("A média da turma foi %.2f",media);
	}

}
