package Completed;

import ll.Base;
import ll.LeanExcel;
import ll.UrlTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PreloginMethod extends Base {


    public static List<UrlTestCase> urlTestCaseList=new LinkedList<>();

    public static  String FLOWTYPE = "PRE-LOGIN";


    public static void Homepage() throws IOException, InterruptedException, MessagingException {



        chromeBrowser();

        urlLaunch("https://www.creditmantri.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        System.out.println("home page");

        //folder path
        String folderPath = Base.FILE_PATH+FLOWTYPE;

        createFolder(folderPath);

        WebElement cc=driver.findElement(By.xpath("//p[text()='Credit Card']"));

        cc.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        System.out.println("url = "+driver.getCurrentUrl());

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement pl=driver.findElement(By.xpath("//p[text()='Personal Loan']"));
        pl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        System.out.println("url = "+driver.getCurrentUrl());
        back();



        WebElement IL=driver.findElement(By.xpath("//IMG[@class=\"cashe-pos img-responsive mg-auto\"]"));
           IL.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        System.out.println("url = "+driver.getCurrentUrl());
        back();

        WebElement bl=driver.findElement(By.xpath("//p[text()='Business Loan']"));

        bl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        System.out.println("url = "+driver.getCurrentUrl());
        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement cis=driver.findElement(By.xpath("//p[text()='Credit Improvement Service']"));

        cis.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        System.out.println("url = "+driver.getCurrentUrl());

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement ms=driver.findElement(By.xpath("//p[text()='Monitoring Service']"));
        ms.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        System.out.println("url = "+driver.getCurrentUrl());

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);

        System.out.println("url = "+driver.getCurrentUrl());


        WebElement cf=driver.findElement(By.xpath("//p[text()=' CreditFit Program']"));cf.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        System.out.println("url = "+driver.getCurrentUrl());


        homeScreen(FLOWTYPE);back();Thread.sleep(7000);
        WebElement lm1=driver.findElement(By.xpath("(//a[text()='Learn More'])[1]"));down(lm1);lm1.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE); back();Thread.sleep(3000);

        System.out.println("url = "+driver.getCurrentUrl());

        System.out.println("prelogingggggggggggg");
        WebElement lm2=driver.findElement(By.xpath("(//a[text()='Learn More'])[2]"));down(lm2);lm2.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement lm3=driver.findElement(By.xpath("(//a[text()='Learn More'])[3]"));down(lm3);lm3.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);; back();Thread.sleep(3000);
        WebElement checknow=driver.findElement(By.xpath("//div[text()='Check Now For FREE']"));down(checknow);checknow.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);;Thread.sleep(5000);
        WebElement chc=driver.findElement(By.xpath("//p[contains(text(),'Wha')]"));down(chc);chc.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);;Thread.sleep(3000);chc.click();Thread.sleep(3000);
        WebElement chc1=driver.findElement(By.xpath("  //p[contains(text(),'How can I r')]"));down(chc1);homeScreen(FLOWTYPE);;Thread.sleep(3000);chc1.click();Thread.sleep(3000);
        WebElement chc2=driver.findElement(By.xpath("//p[contains(text(),'Why are')]"));down(chc2);chc2.click();homeScreen(FLOWTYPE);;Thread.sleep(3000);chc2.click();Thread.sleep(3000);
        WebElement chc3=driver.findElement(By.xpath("//p[contains(text(),'New articles')]"));down(chc3);chc3.click();homeScreen(FLOWTYPE);;Thread.sleep(3000);chc3.click();Thread.sleep(3000);
        WebElement knowmore=driver.findElement(By.xpath("//a[text()='Know More']"));down(knowmore);knowmore.click();homeScreen(FLOWTYPE);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        back();
        WebElement Forter=driver.findElement(By.xpath("//span[text()='Copyright © 2023 CreditMantri']"));down(Forter);
        Thread.sleep(5000);



    }


    public static void FreeCreditScore() throws InterruptedException {
        System.out.println("---------free CreditScore----------");


        WebElement FCS = driver.findElement(By.xpath("//a[text()='Free Credit Score']"));moveToElement(FCS);FCS.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement FCS2 = driver.findElement(By.xpath("//a[text()='Free Credit Score']"));moveToElement(FCS2);
        WebElement BHR = driver.findElement(By.xpath("//a[text()='Business Health Report']"));moveToElement(BHR);BHR.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        Scroll();
        back();Thread.sleep(3000);
        WebElement FCS3 = driver.findElement(By.xpath("//a[text()='Free Credit Score']"));moveToElement(FCS3);
        WebElement ccs = driver.findElement(By.xpath("//a[text()='Credit Score Simulator']"));moveToElement(ccs);ccs.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement FCS4 = driver.findElement(By.xpath("//a[text()='Free Credit Score']"));moveToElement(FCS4);
        WebElement ciss = driver.findElement(By.xpath("//a[text()='Credit Improvement Services']"));moveToElement(ciss);ciss.click();

        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);back();Thread.sleep(3000);
        WebElement FCS5 = driver.findElement(By.xpath("//a[text()='Free Credit Score']"));moveToElement(FCS5);
        WebElement CHR = driver.findElement(By.xpath("//a[text()='Credit Health Report']"));moveToElement(CHR);CHR.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);back();Thread.sleep(3000);

    }
    public static void CreditCard() throws InterruptedException {

        System.out.println("Next CC Code --------->");

        WebElement ccc = driver.findElement(By.xpath("//a[text()='Credit Cards']"));
        ccc.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        WebElement cardtype = driver.findElement(By.xpath("(//a[@class='ty-car'])[1]"));
        down(cardtype);
        String r = cardtype.getCssValue("rr");
        System.out.println(r);
        WebElement cardtyp = driver.findElement(By.xpath("(//a[@class='ty-car'])[1]"));
        down(cardtyp);
        cardtyp.click();

        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement cardtype1 = driver.findElement(By.xpath("(//a[@class='ty-car'])[2]"));
        moveToElement(cardtype1);
        javaClick(cardtype1);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        time();
        back();
        ccbeener();
        WebElement cardtype2 = driver.findElement(By.xpath("(//a[@class='ty-car'])[3]"));
        javaClick(cardtype2);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement cardtype3 = driver.findElement(By.xpath("(//a[@class='ty-car'])[4]"));
        javaClick(cardtype3);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement cardtype4 = driver.findElement(By.xpath("(//a[@class='ty-car'])[5]"));
        javaClick(cardtype4);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        //   ccbeener();
        WebElement cardtype5 = driver.findElement(By.xpath("(//a[@class='ty-car'])[6]"));
        javaClick(cardtype5);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
//        ccbeener();
        WebElement cardtype6 = driver.findElement(By.xpath("(//a[@class='ty-car'])[7]"));
        javaClick(cardtype6);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        //ccbeener();
        WebElement cardtype7 = driver.findElement(By.xpath("(//a[@class='ty-car'])[8]"));
        javaClick(cardtype7);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ccbaner = driver.findElement(By.xpath("//p[contains(text(),'Look')]"));
        down(ccbaner);
        WebElement bcn = driver.findElement(By.xpath("(//a[text()='Check Now'])[1]"));
        javaClick(bcn);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        refresh();
        WebElement Ql = driver.findElement(By.xpath("(//a[@class='txt-underline'])[1]"));
        javaClick(Ql);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ql2 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[2]"));
        javaClick(ql2);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ql3 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[3]"));
        javaClick(ql3);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        ccbeener();
        WebElement ql4 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[4]"));
        javaClick(ql4);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ql5 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[5]"));
        javaClick(ql5);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        //ccbeener();
        WebElement ql6 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[6]"));
        javaClick(ql6);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ql7 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[7]"));
        javaClick(ql7);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement ql8 = driver.findElement(By.xpath("(//a[@class='txt-underline'])[8]"));
        javaClick(ql8);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);back();System.out.println("CC Code done");}

    public static void Loans() throws InterruptedException {
        System.out.println("Loans --------->");
        WebElement loans = driver.findElement(By.xpath("(//a[text()='Loans'])[1]"));
        moveToElement(loans);
        loans.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        WebElement pll = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[1]"));
        pll.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        WebElement plbener = driver.findElement(By.xpath("//h2[text()='Check your Personal Loan eligibility']"));
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        String plconten = plbener.getText();
        System.out.println(plconten);
        WebElement plbener1 = driver.findElement(By.xpath("//p[text()='Go from low bank balance to full with an instant personal loan of upto 7.5L']"));
        down(plbener1);
        homeScreen(FLOWTYPE);
        String plconten1 = plbener1.getText();
        System.out.println(plconten1);
        homeScreen(FLOWTYPE);
        WebElement plbenner2 = driver.findElement(By.xpath("(//img[@title=\"Personal Loan\"])[2]"));
        down(plbenner2);
        homeScreen(FLOWTYPE);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        Thread.sleep(3000);
        back();
        WebElement hl = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[2]"));
        hl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement al = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[3]"));
        al.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement Gl = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[4]"));
        Gl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement Lap = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[5]"));
        Lap.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement bll = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[6]"));
        bll.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement el = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[7]"));
        el.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement twl = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[8]"));
        twl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement hlbt = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[9]"));
        hlbt.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement stl = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[10]"));
        stl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        WebElement stblbenner = driver.findElement(By.xpath("//p[@class=\"cfps-tp-clr\"]"));
        down(stblbenner);
        homeScreen(FLOWTYPE);
        String stblbenner1 = stblbenner.getText();
        System.out.println(stblbenner1);
        Scroll();
        homeScreen(FLOWTYPE);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        Thread.sleep(3000);
        back();
        WebElement cl = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[11]"));
        cl.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement loc = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[12]"));
        loc.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        WebElement bnpll = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[13]"));
        bnpll.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Scroll();
        Thread.sleep(3000);
        back();
        System.out.println("loans Completed next");
    }


    public static void Community() throws InterruptedException {

        System.out.println("Community started ----done next");

        WebElement commun = driver.findElement(By.xpath("//a[text()='Community']"));
        moveToElement(commun);
        commun.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(50000);
        WebElement Articles = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[1]"));
        Articles.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(50000);
        back();
        WebElement blog = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[2]"));
        blog.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement faq = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[3]"));
        faq.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement forum = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[4]"));
        forum.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement resouse = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[5]"));
        resouse.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement insurance = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[6]"));
        insurance.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();
        WebElement review = driver.findElement(By.xpath("(//h4[@class='txt-white txt-medium'])[7]"));
        review.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        Thread.sleep(3000);
        back();

    }

    public static void Creditfit(){
        WebElement creditfit = driver.findElement(By.xpath("//a[text()='CreditFit']"));
        moveToElement(creditfit);
        creditfit.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        WebElement credit = driver.findElement(By.xpath("//h3[text()='JOIN CREDITFIT']"));
        down(credit);
        WebElement cin = driver.findElement(By.xpath("//p[text()='U72100TN2012PTC085154']"));
        down(cin);
        String text2 = cin.getText();
        homeScreen(FLOWTYPE);
        System.out.println(text2);
        WebElement cfup = driver.findElement(By.xpath("//p[text()='CHECK IF YOU ARE CREDITFIT!']"));
        up(cfup);

    }

    public static void PantnerWithus() throws InterruptedException {
        WebElement Partnerwithus = driver.findElement(By.xpath("//a[text()='Partner With Us']"));
        javaClick(Partnerwithus);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        WebElement patners = driver.findElement(By.xpath("//p[text()='Our Partners']"));
        down(patners);
        homeScreen(FLOWTYPE);
        Thread.sleep(40000);
        WebElement Creditmantrii = driver.findElement(By.xpath("//img[@class='img-responsive']"));
        moveToElement(Creditmantrii);
        Creditmantrii.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

    }
    public static void PetrolPrice() throws InterruptedException, IOException, MessagingException {
        System.out.println("petrol price Start");
        WebElement Community = driver.findElement(By.xpath("//a[text()='Community']"));moveToElement(Community);
        WebElement Resources = driver.findElement(By.xpath("//a[text()='Resources']"));
        moveToElement(Resources);Resources.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        // Petrol Price
        WebElement petrol = driver.findElement(By.xpath("//h4[text()='Petrol Price']"));
        down(petrol);petrol.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        Thread.sleep(3000);
        homeScreen(FLOWTYPE);

        // skip the code
        try {
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            WebElement parachute = driver.findElement(By.xpath("//h1[text()='You seem to have lost your way']"));
            String page = parachute.getText();System.out.println(page);back();
        }

        catch (Exception e){
            System.out.println(e);
            WebElement maping = driver.findElement(By.xpath("//a[text()='Petrol Price in Nellore']"));
            down(maping);javaClick(maping);
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            homeScreen(FLOWTYPE);Thread.sleep(3000);back();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            Thread.sleep(3000);back();
        }
    }


    public static void DieselPrice() throws InterruptedException {
        // Diesel price

        WebElement Diesel = driver.findElement(By.xpath(" //h4[text()='Diesel Price']"));
        Diesel.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        Thread.sleep(3000); homeScreen(FLOWTYPE);
        try {
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            WebElement parachute = driver.findElement(By.xpath("//h1[text()='You seem to have lost your way']"));
            String page = parachute.getText();System.out.println(page);
            back();
        }
        catch (Exception e){
            // Diesel price maping
            WebElement Dieselmap = driver.findElement(By.xpath("//a[text()='Diesel Price in Sikar']"));
            down(Dieselmap);javaClick(Dieselmap);
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            Thread.sleep(3000); homeScreen(FLOWTYPE);back();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            Thread.sleep(3000);
            back();
        }


    }



    public static void SilverPrice() throws InterruptedException {

        // SIVER RATE
        WebElement Silver = driver.findElement(By.xpath("//h4[text()='Silver Rate Today']"));
        Silver.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);

        try {
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            WebElement parachute = driver.findElement(By.xpath("//h1[text()='You seem to have lost your way']"));
            String page = parachute.getText();System.out.println(page);
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            back();
        }
        catch (Exception e){
            // SIVER RATE maping
            WebElement silvermap = driver.findElement(By.xpath("//a[text()='Silver Rate in Dausa']"));
            down(silvermap);silvermap.click();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Success"));
            Thread.sleep(3000); homeScreen(FLOWTYPE);back();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Success"));
            Thread.sleep(3000);back();
        }
    }
    public static void GoldPrice() throws InterruptedException, IOException, MessagingException {

        //GOLD RATE
        WebElement Goldrate = driver.findElement(By.xpath("//h4[text()='Gold Rate Today']"));
        Goldrate.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        homeScreen(FLOWTYPE);
        try {
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            WebElement parachute = driver.findElement(By.xpath("//h1[text()='You seem to have lost your way']"));
            String page = parachute.getText();
            System.out.println(page);
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Failure"));
            back();
        } catch (Exception e) {
            // gold maping
            WebElement Goldratemap = driver.findElement(By.xpath("//a[text()='Gold Rate in Jaisalmer']"));
            down(Goldratemap);
            Goldratemap.click();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"Success"));
            Thread.sleep(3000);
            homeScreen(FLOWTYPE);
            back();
            Thread.sleep(3000);
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            back();
            WebElement Creditmantri = driver.findElement(By.xpath("//img[@class='img-responsive']"));
            moveToElement(Creditmantri);
            Creditmantri.click();
            urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
            homeScreen(FLOWTYPE);
            System.out.println("finesh the pre login");


        }



    }
    public static void ContactUs() throws InterruptedException {



        System.out.println("ContactUs");

        WebElement ContactUs = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));moveToElement(ContactUs);ContactUs.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        WebElement CusSupport = driver.findElement(By.xpath("//h3[@class='txt-medium']"));
        String content = CusSupport.getText();
        System.out.println(content);
        WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
        moveToElement(Login);Login.click();
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        homeScreen(FLOWTYPE);Thread.sleep(3000);back();
        WebElement ClickHere = driver.findElement(By.xpath("//a[text()='Login']"));
        down(ClickHere);
        Thread.sleep(3000);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));

        WebElement FAQ = driver.findElement(By.xpath("//h2[@class='txt-medium mg-tp-0']"));
        down(FAQ);
       Thread.sleep(3000);
        WebElement Q4 = driver.findElement(By.xpath("//strong[contains(text(),'4. My sub')]"));
        down(Q4);
        Thread.sleep(3000);
        urlTestCaseList.add(new UrlTestCase(driver.getCurrentUrl(),"success"));
        WebElement Q10 = driver.findElement(By.xpath("//strong[contains(text(),'10. What')]"));
        down(Q10);
      Thread.sleep(3000);

        System.out.println("Done Contact us page");
    }
//
//    public static void createZipFileAndSendEmail() throws IOException, MessagingException {
//
//        String screenShotDirPath = FILE_PATH+FLOWTYPE+"/tmp" ;
//
//        String zipFilePath = FILE_PATH+FLOWTYPE+".zip";
//
//        String excelPath = "src/main/resources/newExcel.xlsx";
//
//        zipFile(screenShotDirPath,zipFilePath);
//
//        LeanExcel.createExcelSheets(excelPath);
//
//        addUrlTestCaseInExcel(urlTestCaseList,excelPath);
//
//        List<String> attachmentList = new LinkedList<>();
//
//        attachmentList.add(excelPath);
//
//        attachmentList.add(zipFilePath);
//
//        Long successCount = urlTestCaseList.stream().filter(s->s.getStatus().contains("success")).count();
//        Long failureCount = urlTestCaseList.stream().filter(s->s.getStatus().contains("failure")).count();
//
//
//        emailSent(attachmentList,FLOWTYPE,successCount,failureCount);
//
//
//    }

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
