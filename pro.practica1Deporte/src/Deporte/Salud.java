package Deporte;

public class Salud {
	/**
         * Calcula la frecuencia máxima cardiaca en funcion de la edad y del sexo
         * del individuo. Para ello hace uso de los métodos calcularFCMHombre y 
         * calcularFCMMujer, que están por completar.
         * @param edad edad del individuo.
         * @param sexo caracter que indica el sexo del individuo. Si es el carácter 'H'
         * calcula la FCM de un hombre y si es distinto de 'H', de una mujer.
         * @return la Frecuencia Cardiaca Máxima.
         */
	public static int calcularFCM(int edad, char sexo){
            //Este método ya está implementado. No se debe modificar
            if (sexo == 'H') return calcularFCMHombre(edad);
            else return calcularFCMMujer(edad);
	}
	/**
         * Módulo secundario de Salud.calcularFCM, calcula la frecuencia cardíaca
         * máxima de un hombre en función de su edad.
         * @param edad edad del individuo
         * @return la Frecuencia Cardíaca Máxima de un hombre
         */
	public static int calcularFCMHombre(int edad){
            //Completar
            int fcmh = 220-edad;
            return fcmh;
	}
	/**
         * Módulo secundario de Salud.calcularFCM, calcula la frecuencia cardíaca
         * máxima de una mujer en función de su edad.
         * @param edad edad del individuo
         * @return la Frecuencia Cardíaca Máxima de una mujer
         */
	public static int calcularFCMMujer(int edad){
            //Completar
            int fcmm = 226-edad;
            return fcmm;
	}
	/**
         * Calcula la frecuencia cardíaca de entrenamiento de un sujeto según la
         * edad, el sexo, la frecuencia cardíaca en reposo y el porcentaje de
         * esfuerzo del indivíduo
         * @param edad edad del sujeto
         * @param sexo sexo del sujeto
         * @param fcr frecuencia cardíaca en reposo del sujeto
         * @param porcentajeEsfuerzo porcentaje de esfuerzo realizado en el entrenamiento
         * @return la frecuencia cardíaca de entrenamiento de un indivíduo
         */
	public static double calcularFCE(int edad, char sexo, int fcr, double porcentajeEsfuerzo){
            //Completar
            double fce = (fcr + (calcularFCM(edad, sexo) - fcr) * porcentajeEsfuerzo/100);
            return fce;
	}
        /**
         * Calcula el índice de masa corporal de un sujeto según su estatura
         * y su peso
         * @param peso peso del sujeto en kilogramos
         * @param estatura estatura del sujeto en centímetros
         * @return índice de masa corporal de un sujeto
         */
        public static double calcularIMC(double peso, double estatura){
            //Completar
            double imc = peso / Math.pow(estatura, 2);
            return imc;
        }
}
