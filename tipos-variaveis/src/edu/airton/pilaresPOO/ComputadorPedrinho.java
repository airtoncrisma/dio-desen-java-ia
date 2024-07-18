package edu.airton.pilaresPOO;

import edu.airton.pilaresPOO.APPS.FacebookMessenger;
import edu.airton.pilaresPOO.APPS.MSNMessenger;
import edu.airton.pilaresPOO.APPS.ServicoMensagemInstantanea;
import edu.airton.pilaresPOO.APPS.Telegram;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	// public static void main(String[] args) {
	// 	//abrindo MSN Messenger

    //     System.out.println("MSN");
	// 	MSNMessenger msn = new MSNMessenger();
	// 	msn.enviarMensagem();
	// 	msn.receberMensagem();

    //     System.out.println("FACEBOOK");

    //     FacebookMessenger fcb = new FacebookMessenger();
	// 	fcb.enviarMensagem();
	// 	fcb.receberMensagem();

    //     System.out.println("TELEGRAM");

    //     Telegram tlg = new Telegram();
	// 	tlg.enviarMensagem();
	// 	tlg.receberMensagem();
	// }

    public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
            POLIMORFISMO
		 */
		String appEscolhido="fcb"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
        
	}
}