public class AppPOO {

    public static class Triangulo {

        public double[] lados;

        public Triangulo(double lado1, double lado2, double lado3) {
            this.lados = new double[3];
            this.lados[0] = lado1;
            this.lados[1] = lado2;
            this.lados[2] = lado3;
        }

        public String calcularArea(){
            double p = (lados[0] + lados[1] + lados[2])/2;
            double area = Math.sqrt(p*(p-lados[0])*(p-lados[1])*(p-lados[2]));

            return ("A área do Triângulo é " + area);
        }

        @Override
        public String toString() {
            return "Triangulo: " +
                    "lado a = " + this.lados[0]+
                    " " +
                    "lado b = " + this.lados[0]+
                    " " +
                    "lado c = " + this.lados[0];
        }
    }



}
