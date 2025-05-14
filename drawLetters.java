// FEYZULLAH ÖZTÜRK
// INT240106731

import java.util.Scanner;
public class drawLetters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Veri okumak için bir Scanner objesi oluşturduk
        while(true){
            System.out.println("Please Enter A Character ('Q' to exit) :"); //Konsola Metin Yazdırıyoruz...
            String cha = sc.next(); // Okuduğumuz veriyi String olarak aldık
            if(cha.equalsIgnoreCase("Q")) // ÇIKIŞ YAPMAK İÇİN WHİLE KULLANIYORUZ
            {
                sc.close(); // Dinlemeyi Kapattık
                System.out.println("Goodbye!");
                break;
            }
            String letter_Cha = "";
            boolean b_letter= false; 
            boolean b_letterSize=false;
            int letter_Size = 0;
           while(!b_letter){
            System.out.println("Please choose a letter ('L','T','S','O','Z') :");
            letter_Cha = sc.next();
            switch (letter_Cha){
                case "L": b_letter=true;
                            break;
                case "T":  b_letter=true;
                            break;
                case "S" :  b_letter=true;
                            break;
                case "O": b_letter=true;
                        break;
                case "Z": b_letter=true;
                            break;
                default:  System.out.println("Please choose a letter that given by program!");
    
            }
        }
        while(!b_letterSize){
            System.out.println("Please Enter A Size (5-20): ");
            letter_Size=sc.nextInt();
            if(letter_Size>=20){
                System.out.println("Too high");
            }else if(letter_Size<=5){
                System.out.println("Too low");
            }else {b_letterSize=true;}
        }
        // System.out.println(cha); //Programlarken kullanıyorum değer atandıysa görmek için... 
        // System.out.println(letter_Cha);  //Programlarken kullanıyorum değer atandıysa görmek için... 
        // System.out.println(letter_Size);  //Programlarken kullanıyorum değer atandıysa görmek için...
        draw(cha,letter_Cha,letter_Size);
        }
       
}
public static void draw(String pSymbol, String pLetter,int pSize){ //YAZDIRMAK İÇİN AYRI BİR VOID OLUŞTURDUK VE MAİN DE ÇAĞIRIYORUZ
            switch(pLetter){ // Her bir harf için ayrı yazım biçimi olduğundan switch case kullanıldı.
            case "L":
                  for (int i = 0; i < pSize; i++) {
                       if (i == pSize - 1) {
                  for (int j = 0; j < pSize; j++) {
                        System.out.print(pSymbol + " ");
                    }
                       } else {
                       System.out.print(pSymbol);
                     }
                    System.out.println();
            }
            break;
            case "T":
            for (int i = 0; i < pSize; i++) {
                for (int j = 0; j < pSize; j++) {
                    if (i == 0) {
                        System.out.print(pSymbol + " ");
                    } else if (j == pSize / 2) {
                        System.out.print(pSymbol + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            break;

        case "S":
        for (int i = 0; i < pSize; i++) {
            for (int j = 0; j < pSize; j++) {
                if (i == 0 || i == pSize - 1 || i == pSize / 2) {
                    System.out.print(pSymbol + " ");
                } else if (i < pSize / 2 && j == 0) {
                    System.out.print(pSymbol + " ");
                } else if (i > pSize / 2 && j == pSize - 1) {
                    System.out.print(pSymbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        break;

        case "O":
        for (int i = 0; i < pSize; i++) {
            for (int j = 0; j < pSize; j++) {
                if (i == 0 || i == pSize - 1 || j == 0 || j == pSize - 1) {
                    System.out.print(pSymbol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        break;

        case "Z":
            for (int i = 0; i < pSize; i++) {
                for (int j = 0; j < pSize; j++) {
                    if (i == 0 || i == pSize - 1 || j == pSize - 1 - i) {
                        System.out.print(pSymbol + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            break;
        }
        }
}

//Goodbye 