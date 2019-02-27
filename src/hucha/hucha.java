import java.util.*;
public class hucha {
	
	int saldo=0;

	public void introducir(int a) {
		saldo+=a;                           
	}
	public void sacar(int a){
		saldo-=a;
	}
	public void informar(){
		System.out.println("Tu saldo es: " + saldo);
	}

	public static void main(String[] args) {

		hucha P = new hucha();
		
		P.introducir(50);
		P.sacar(20);
		P.introducir(40);
		P.informar();
	}
}