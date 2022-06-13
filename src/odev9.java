import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
        String username, password, chnpass,newpass;

        Scanner inp = new Scanner(System.in);

        System.out.print(" \nKullanici Adinizi Giriniz : ");
        username = inp.nextLine();

        System.out.print(" Sifrenizi Giriniz : ");
        password = inp.nextLine();

        if (username.equals("tolgaunal") && password.equals("qwert")) {
            System.out.println("Giriş Yaptiniz !");
        }else{
                System.out.println("Sifrenizi veya Kullanici Adinizi Yanlis Girdiniz !!!");
                System.out.print("Sifrenizi Sifirlamak Istiyormusunuz ? y/n ?");
                chnpass = inp.nextLine();
                if(chnpass.equals("y")) {
                    System.out.println("Lutfen Yeni Sifrenizi Giriniz");
                    newpass = inp.nextLine();
                    if (newpass.equals("qwert")){
                        System.out.println("Yeni Sifreniz Eskisiyle ayni Olamaz");
                    }else{
                        System.out.println("Yeni Sifre Olusturuldu !");
                    }
                }else{
                    System.out.println("Program bitti !!!");
                }
            }
        }
    }

