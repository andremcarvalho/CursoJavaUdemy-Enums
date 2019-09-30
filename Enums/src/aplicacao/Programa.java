package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.OrdemStatus;

public class Programa {

	public static void main(String[] args) {
	
		Pedido pedido = new Pedido (1080, new Date (), OrdemStatus.AGUARDANDO_PAGAMENTO  );// instanciando pedido
		System.out.println(pedido);
		
		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
