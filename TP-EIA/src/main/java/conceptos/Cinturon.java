package conceptos;

import atributos.TipoDesgaste;

public class Cinturon {
	TipoDesgaste desgaste;

	public Cinturon(TipoDesgaste desgaste) {
		this.desgaste = desgaste;
	}

	public TipoDesgaste getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(TipoDesgaste desgaste) {
		this.desgaste = desgaste;
	}
	
}
