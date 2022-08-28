package aplicacao;

import entidade.Notas;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Notas n1 = new Notas();
        
        System.out.println("Informe o nome do aluno: ");
        n1.nome=sc.nextLine();
        
        System.out.println("Informe a nota do primeiro trimestre: ");
        n1.nota1=sc.nextDouble();
        
        System.out.println("Informe a nota do segundo trimestre: ");
        n1.nota2=sc.nextDouble();
        
        System.out.println("Informe a nota do terceiro trimestre: ");
        n1.nota3=sc.nextDouble();
        
        n1.aprovacao();
        
        sc.close();
        
    }
    
}