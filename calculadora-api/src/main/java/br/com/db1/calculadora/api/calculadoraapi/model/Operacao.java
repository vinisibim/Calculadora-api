package br.com.db1.calculadora.api.calculadoraapi.model;

public enum Operacao {
	SOMA {
		@Override
		public Double fazCalculo(Double num1, Double num2) {
			// TODO Auto-generated method stub
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Double fazCalculo(Double num1, Double num2) {
			// TODO Auto-generated method stub
			return num1 - num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double fazCalculo(Double num1, Double num2) {
			// TODO Auto-generated method stub
			return num1 * num2;
		}
	},
	DIVISAO {
		@Override
		public Double fazCalculo(Double num1, Double num2) {
			// TODO Auto-generated method stub
			return num1 / num2;
		}
	};
	
	
	public abstract Double fazCalculo(Double num1, Double num2);
}
