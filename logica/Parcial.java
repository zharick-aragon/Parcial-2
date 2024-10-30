package logica;
//"ax^2 + bx + c = 0"
//* Reglas matematicas no se pude dividir por cero */
//(-b±√(b²-4ac))/(2a)
public class Parcial {
    public double cuadratica(int a, int b , int c) throws Exception {
        if (a == 0){ throw new Exception("Si el coeficiente a es 0, automaticamente deja de ser una cuadratica"); }
        if (c== 0){ throw new Exception("Utilizando la ecuacion de la cuadratica no se puede dividir por cero"); }
        else {
            double m = 4*a*c; 
            double n = Math.pow(b, 2); 
            double divisor = 2*a; 
            if (m>n){ throw new Exception("Utilizando la formula de la cuadratica, la raiz no puede ser negativa"); }
            else{
                double raiz = Math.pow((n-m), (1/2)); 
            return (-b +(raiz))/divisor;
            //return (-b -(raiz))/divisor;
            }
        }
    }
}



