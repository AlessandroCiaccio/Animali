public class Main{
    public static void main(String[] args){
        Animale animale=new Animale("ROAR");
        Gatto gatto=new Gatto("MIAO");
        faiIlVerso(animale.getVerso());
        faiIlVerso(gatto.getVerso());

    }
    public static void faiIlVerso(String obj) {
        System.out.println(obj);
    }

}