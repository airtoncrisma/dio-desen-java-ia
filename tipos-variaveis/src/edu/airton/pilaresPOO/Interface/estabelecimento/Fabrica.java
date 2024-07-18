package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizador;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Impressora impressora = em;
        Digitalizador digitalizador = em;
        Copiadora copiadora = em;

     
     impressora.imprimir();
     digitalizador.digitalizar();
     copiadora.copiar();
    }
    
}
