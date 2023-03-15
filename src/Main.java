public class Main {
    public static void main(String[] args) {

        AppPOO.Triangulo novoTriangulo1 = new AppPOO.Triangulo(3, 4, 5);
        AppPOO.Triangulo novoTriangulo2 = new AppPOO.Triangulo(6, 8, 10);



        //3, 4, 5
        //6, 8, 10

        double [] ladosTriangulo1 = new double[3];
        double [] ladosTriangulo2 = {6 ,8, 10};

        ladosTriangulo1[0] = 3;
        ladosTriangulo1[1] = 4;
        ladosTriangulo1[2] = 5;

        ladosTriangulo1[1] = 5;
        ladosTriangulo1[2] = 4;



        double p1 = (ladosTriangulo1[0] + ladosTriangulo1[1] + ladosTriangulo1[2])/2;
        double p2 = (ladosTriangulo2[0] + ladosTriangulo2[1] + ladosTriangulo2[2])/2;

        double area1 = Math.sqrt(p1*(p1-ladosTriangulo1[0])*(p1-ladosTriangulo1[1])*(p1-ladosTriangulo1[2]));
        double area2 = Math.sqrt(p2*(p2-ladosTriangulo2[0])*(p2-ladosTriangulo2[1])*(p2-ladosTriangulo2[2]));

//        if (area1 > area2) {
//            System.out.println("Área do triângulo 1 é maior que a do triangulo 2");
//        } else {
//            System.out.println("Área do triângulo 2 é maior que a do triangulo 1");
//        }
//
//        System.out.println(area1);
//        System.out.println(area2);
//
        System.out.println(novoTriangulo1);


        System.out.println(novoTriangulo2.calcularArea());

    }
}