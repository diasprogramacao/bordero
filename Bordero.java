package wba_web;

public class Bordero {
	
    private double valorFace ;
	private double desagio ;
	private double adValorem;
	private double imposto; 
	private double valorLiquido;
	Cliente cliente;
	
	public void setvalorFace (double valorFace) {
		
		this.valorFace = valorFace;
	}

	public double getvalorFace () {
		
		return valorFace;
	}

	public double getDesagio() {
		return desagio;
	}

	public void setDesagio(double desagio) {
		this.desagio = desagio;
	}

	public double getAdValorem() {
		return adValorem;
	}

	public void setAdValorem(double adValorem) {
		this.adValorem = adValorem;
	}

	public double getimposto() {
		return imposto;
	}

	public void setimposto(double imposto) {
		this.imposto = imposto;
	}

	public double getvalorLiquido() {
		
		valorLiquido = valorFace - adValorem - desagio - imposto ; 
		
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
}
