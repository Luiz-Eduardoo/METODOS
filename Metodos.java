// criei a classe para verificar o numero positivo ou negativo
	class Posouneg {
    private int num; // variavel privada que guarda um numero (privada para ser usada apenas nessa classe)

    // construtor para colocar o numero para verificar
    public Posouneg(int num) {
        this.num = num; // this. direcionar o construtor para a variavel
        VerificaNumero(); // Chama o método para verificar o número
    }
    // Método privado para verificar se o número é positivo ou negativo
    private void VerificaNumero() {
        if (num >= 0) {
            System.out.println(num + " é positivo"); // se o número for maior ou igual a zero é positivo
        } else {
            System.out.println(num + " é negativo"); // se não for, é negativo
        }
    }
}	
	// criei a classe para fazer a media aritmetica
	class Mediaarit {
		private int x;
		private int y;
		private int z;
	// metodo construtor para colocar os numeros nas variaveis
	public Mediaarit(int x, int y, int z) {
		this.x = x; // this. para direcionar o construtor para a variavel
		this.y = y;
		this.z = z;
	}
		// metodo privado para calcular a media aritmetica
		private double Calmedia() {
			return (x + y + z)/3;// entre parenteses para realizar primeiramente as somas e depois a divisão
		}
		// metodo para organizar e mostrar ao usuario na tela final
		public String Media() {
			return
					"o calculo da média aritmetica é: " + Calmedia();
		}
	}
	// criei a classe para mostrar o maior numero de uma lista
	class Maior {
		
		int[] maiornum;
		// metodo construtor para organizar a lista
		public Maior(int[] numeros) {
			this.maiornum = numeros;
		}
		// metodo privado para organizar a lista e colocar o maior numero aparente
		private static int Encontrarmaior(int[] maiornum) {
			int x = maiornum[0]; // Variável para armazenar o maior número
	        for (int j = 0; j < maiornum.length; j++) { // For para rodar toda a lista do array e passar pela verificação
	            if (maiornum[j] > x) {
	                x = maiornum[j]; // Atualiza x se encontrar um número maior
	            }
	        }
	        return x; // Retorna o maior número encontrado
		}
		// metodo para mostrar o resultado final (int por que vai retornar um numero inteiro)
		int Resultado() {
			return Encontrarmaior(maiornum);
		}
		
	}
	// criei a classe para realizar o calculo de potencoa
	class Potencia {
		private double a;
		private double b;
		// metodo construtor para organizar a conta
		public Potencia(double a, double b) {
			this.a = a;
			this.b = b;
		}
		// criei o metodo privado para realizar a conta de potencia
		private double Calpot() {
			return Math.pow(a, b);// "math.pow" serve para realizar calculos de potencia
		}
		// criei o metodo para mostrar ao usuario o resultado final
		String Resultado() {
			return "O calculo da potência " + a + " elevado a " + b + " é " + Calpot();
		}
	}
	// criei a classe horas para realizar a conversão
	class Horas {
		private int min;
		// metodo construtor para organizar a conversão
		public Horas(int min) {
			this.min = min;
		}
		// primeiramente fiz o calculo para receber a quantidade de horas
		private int Calhoras() {
			return min / 60;
		}
		// depois para receber a quantidade em minutos
		private int Calminutos() {
			return min % 60;
		}
		// agora fiz o metodo para organizar tudo e devolver o resultado final da conversão
		public String Descricao() {
			return + min +" minutos " + "em horas e minutos são " + Calhoras() + " hora(s) "+ " e " + Calminutos() + " minuto(s).";
		}
	}
	// criei a classe para fazer o calculo de fatorial
	class Fatorial {
		int num;
		//metodo contrutor para organizar os valores
		public Fatorial(int num) {
			this.num = num;
		}
		// metodo privado para calcular a fatoração
		private int Calfat() {
	        int resultado = 1; // 1 por que todo numero multiplicado por ele é ele mesmo
	        for (int i = 1; i <= num; i++) { // Loop que incia no 1 até o valor colocado por "num"
	            resultado *= i; // Multiplica o resultado pelo contador
	        }
	        return resultado; // Retorna o resultado final
	    }
		// metodo para organizar o resultado final e mostrar ao usuario
		String Resultado() {
	        int fatorial = Calfat(); // Chama o método para calcular o fatorial
	        return "O fatorial de " + num + " é " + fatorial + "."; // Retorna a frase formatada
	}
	}
public class Metodos {
	public static void main(String[] args) {
		// novo objeto para dar um valor para a variavel
		Posouneg pn1 = new Posouneg(15);
		// novo objeto para dar os valores para as variaveis
		Mediaarit ma1 = new Mediaarit(2, 5, 5);
		// mostra no sistema o resultado final do calculo
		System.out.println(ma1.Media());
		// coloquei os valores do int aqui para que possa ser alterados os valores da verificação
		int[] numeros = {1, 5, 9};
		// novo objeto para passar os valores do int para o metodo construtor da classe maior
		Maior m1 = new Maior(numeros);
		// mostra o resultado final da classe maior
		System.out.println("o maior número é: " + m1.Resultado());
		// novo objeto para dar os valores para o calculo de potencia
		Potencia p1 = new Potencia(2, 3);
		// mostra o resultado final da classe potencia
		System.out.println(p1.Resultado());
		// novo objeto para dar o valor para a conversão
		Horas h1 = new Horas(90);
		// mostra o resultado final da conversão
		System.out.println(h1.Descricao());
		// novo objeto para dar o numero que precisa ser fatorado
		Fatorial f1 = new Fatorial(5);
		// mostra o resultado final da fatoração
		System.out.println(f1.Resultado());
	}
}