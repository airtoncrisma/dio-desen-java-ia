package edu.airton.estrurepeticao;
//estrutura do controle de fluxo for

//  for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
// {
//      // comando que será executado até que a 
//      // expressão de validação torne-se falsa 
// }
public class ExemploFor {
    public static void main(String[] args) {
		// for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
		// 	System.out.println(carneirinhos + " - Carneirinho(s)");
		// }

            // em arrays o indice inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	//     for (int x=0; x<alunos.length; x++) {
	// 	    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	// }
        //Forma abreviada
	    for(String aluno : alunos) {
        System.out.println("Nome do aluno é: " + aluno);
        }


	}
}
