public class figuras2D {
    //triangulo equilatero y cuadrado
    private int nLados;//número de lados
    public float lado;//longitud del lado
    public float base;//longitud del base
    public float altura;//longitud altura

    //Constructor
    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public figuras2D(float lado) {
        this.lado = lado;
    }

    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }
    public figuras2D(float base, float altura){
        this.base= base;
        this.altura=altura;
    }
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Setters y getters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }


    public float areaCuadrado(int lado){
    return this.lado*this.lado;
    };
    public float perimetroCuadrado(){
        return this.lado*4;
    };

    public float areaTriangulo(int lado){
        return this.base*this.altura/2;
    };
    public float perimetroTriangulo(float base, float altura){
        return base*altura;
    };
}
