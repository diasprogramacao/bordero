package wba_web;

public class CriarBodero {
	
	public static void main (String[]agrs) {

		
		Bordero operacao = new Bordero();
		
		Cliente cliente= new Cliente();
		
        operacao.cliente=cliente;
        
        operacao.cliente.cnpj= ("100.978.8888.000/1");
        System.out.println("CNPJ :" + operacao.cliente.cnpj);
        
        operacao.cliente.razaoSocial= ("FERRARI LTDA");
        System.out.println("RAZÃO SOCIAL :" + operacao.cliente.razaoSocial);
        
        operacao.cliente.cep = ("09330-304");
        System.out.println("CEP : " + operacao.cliente.cep);
        
		operacao.cliente.endereco = ("RUA IZABEL MARIA CALCHI RODRIGUES");
        System.out.println("ENDEREÇO : " + operacao.cliente.endereco);
        		
		operacao.setvalorFace(100.000);
		
		System.out.println ("VALOR FACE : " + operacao.getvalorFace());
		
		operacao.setDesagio(10.00);
		
		System.out.println ("DESÁGIO    : " + operacao.getDesagio());
		
		operacao.setAdValorem(20.00);
		
		System.out.println ("AD VALOREM : " + operacao.getAdValorem());
		
		operacao.setimposto(50.00);
		
		System.out.println ("IMPOSTOS   : " + operacao.getimposto());
		
		System.out.println ("VALOR LIQUIDO : " + operacao.getvalorLiquido());
		
 
	}
	    

}
