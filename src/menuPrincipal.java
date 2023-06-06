public class menuPrincipal {
    public static void main(String[] args) {
        figuras2D miFigura=new figuras2D(4,2);
        miFigura.setLado(3);

        System.out.println(miFigura.areaCuadrado(7));
        System.out.println(miFigura.perimetroCuadrado());

    }

}
