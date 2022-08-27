public class Main {
    InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Hata Kodunu Giriniz= ");
        String s=br.readLine();
        int hatakodu=Integer.parseInt(s);
        
        switch (hatakodu){
            case 1 -> System.out.println("OK");
            case 2 -> System.out.println("Warning");
            case 3 -> System.out.println("ERROR");
            case 4 -> System.out.println("PANIC");
            case 5 -> System.out.println("UNKOWN");
            default->System.out.println("Yanlis kod girdiniz");
    
}
