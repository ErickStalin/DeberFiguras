public class figurasGeo {
   double radio, lado, area, perimetro,volumen,altura ,base , lado2, lado3;
    public figurasGeo(){
        lado = 0;
        area = 0;
        perimetro = 0;
    }
    public figurasGeo(double rad, double vol){
        radio = rad;
        volumen = vol;
    }
    public figurasGeo(double alt, double ba, double lad2, double lad3){
        altura = alt;
        base = ba;
        lado2 = lad2;
        lado3 = lad3;
    }
    //metodos


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
