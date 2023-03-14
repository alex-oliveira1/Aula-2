public class App {
    public static void main(String[] args) throws Exception {
        String nomecompleto;
        nomecompleto="Alex";
        System.out.println("Seja bem vindo "+nomecompleto);
        // comentario de uma linha
        /* 
        comentario de blocos
        */
        int i;
        i=5;
        System.out.println("O valor de i: "+i);
        double d= 15.7;
        char c='a';
        System.out.println(c);
        c='\t';
        System.out.println(c);
        c='\u0043';
        System.out.println(c);
        
        float f=5.2f;
        byte bb=127;
        short s=1024;
        long l=1234567890;
        int x,y, z;
        String frase1;
        frase1="Alex Santos de Oliveira";
        String frase2="Joao elias";
        System.out.println(frase1);
        System.out.println(frase2);
        System.out.println(frase1.equals(frase2));
        System.out.println(frase1.length());
        System.out.println(frase2.charAt(0));
        int a=5;
        boolean b = (a==10);
        System.out.println(!b);
        // conversão de variavel
        String s3="10";
        int a1=Integer.parseInt(s3);
        float a2=Float.parseFloat(s3);
        double a3=Double.parseDouble(s3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
