package mvc;

public class ImcModel {

	 public String calcular(String peso, String altura, String genero) {
	 
		 String resultado="";
		 String msg="";
		 
		 if (altura != null && peso != null && genero != null){             
		        double imc = Double.parseDouble(peso) / (Double.parseDouble(altura) * Double.parseDouble(altura));
		        	       	
		        if((imc < 19.1 && genero.equals("F"))|| (imc <20.7 && genero.equals("F"))){
		        	 msg="Voc� est� muito abaixo do peso";
				
				}else if((imc >= 19.1 && imc < 25.8 && genero.equals("F"))|| (imc >= 20.7 && imc <26.4 && genero.equals("M"))){
		        	 msg="Parabens! Voc� est� com peso normal";

				}else if((imc >= 25.8 && imc < 27.3 && genero.equals("F"))|| (imc >= 26.4 && imc <27.8 && genero.equals("M"))){
		        	 msg="Voc� esta acima do peso";

				}else if((imc >= 27.3 && imc < 32.3 && genero.equals("F"))|| (imc >= 27.8 && imc < 31.1 && genero.equals("M"))){
		        	 msg="Voc� est� bem acima do peso, tenha cuidado";

				}else if((imc > 32.3 && genero.equals("F")) || (imc> 31.1 && genero.equals("M"))){
		        	 msg="Meu Deus! Procure um m�dico urgente, muito urgente !";

				}else{
				
					 msg = "E agora?!";
				}
		       		        
		        resultado = "Resultado do IMC: "+String.format("%.2f", imc)+"\n"+msg+"";
				
		    }
		 
		 return resultado;	 
	 }
	
}
