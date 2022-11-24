import java.util.Scanner;

public class User_Activate {
    public static void main(String[] args) {
        String passWord, userName, editPass;
        int editCode;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName=input.nextLine();
        System.out.print("Lütfen Paralonızı Giriniz:  ");
        passWord=input.nextLine();
        if (userName.equals("java101") && passWord.equals("jav10"))
        {
            System.out.print("Welcome/Hoşgeldiniz");
        }
        else if (!userName.equals("java101"))
        {
            System.out.print("Kullanıcı Adı Eşleşmiyor");
        }
        else if (!passWord.equals("jav10"))
        {
            System.out.print("Hatalı Şifre Girişi Yaptınız");
            System.out.print("Şifreyi Düzeltmek için 1 Basınız: ");
            editCode=input.nextInt();

                if (editCode==1) {
                    System.out.print("Lütfen Yeni Şifrenizi Giriniz");
                    editPass=input.nextLine();
                    System.out.print(editPass.equals("jav10")? " Şifre oluşturulamadı, lütfen başka şifre giriniz." :"Şifre oluşturuldu" );

                }
        }

    }
}
