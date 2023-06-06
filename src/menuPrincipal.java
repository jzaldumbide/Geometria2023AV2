public class menuPrincipal {
    public static void main(System[]args){
        figuras2D miFigura=new figuras2D(4,2);
        figuras2D triangulo=new figuras2D(4,6);
        miFigura.setLado(3);
        triangulo.setBase(3);
        System.out.println(miFigura.areaCuadrado(7));
        System.out.println(triangulo.perimetroTriangulo(5,6));

    }
}
