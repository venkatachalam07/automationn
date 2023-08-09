package Completed;

import ll.UrlTestCase;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SampleClass extends PreloginMethod {

    public static List<UrlTestCase> urlTestCaseList=new LinkedList<>();

    public static  String FLOWTYPE = "PRE-LOGIN";



    public static void automation() throws IOException, InterruptedException, MessagingException {


try {
   Homepage();
    FreeCreditScore();
    CreditCard();
    Loans();
    Community();
    Creditfit();
    PantnerWithus();
    PetrolPrice();
    DieselPrice();
    SilverPrice();
    GoldPrice();
    ContactUs();
    createZipFileAndSendEmail(FLOWTYPE,urlTestCaseList);
    System.out.println("-----------------Success----------------");
}

catch (Exception e){
    System.out.println("PRE-LOGIN CODE is Error");
    createZipFileAndSendEmail(FLOWTYPE,urlTestCaseList);
}}


    public static void main(String[] args) throws MessagingException, IOException, InterruptedException {
            automation();
    }
}
