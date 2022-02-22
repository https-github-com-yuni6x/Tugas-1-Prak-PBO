public class Konversi {

    double celcius;
    double fahrenheit;
    double reamur;
    double kelvin;

    Konversi(double celcius){
        fahrenheit = ((9 * celcius) / 5) + 32;
        reamur = (4 * celcius/5);
        kelvin = (celcius + 273.15);
    }

    public static void kondisiAir(double celcius){
        if(celcius < 0){
            System.out.println("Kondisi air Beku");
        }else if(celcius>0 && celcius<100){
            System.out.println("Kondisi Air Normal");
        }else{
            System.out.println("Kondisi Air Mendidih");
        }
    }

}
