package Completed;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;


public class LeanExcel {

  //  public static List<UrlTestCase> Urllist = new ArrayList<>();


    public static void addUrlTestCaseInExcel(List<String> urlList) throws IOException {

//        urlStatus.add(new UrlTestCase("www.creditmantri.com", "sucess"));
//        urlStatus.add(new UrlTestCase("www.cmol/creditmantri.com", "sucess"));
//        urlStatus.add(new UrlTestCase("www.crm/creditmantri.com", "Failure"));

        String filename = "/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/newExcel.xlsx";

        HSSFWorkbook workbook = new HSSFWorkbook();

        HSSFSheet sheet = workbook.createSheet("UrlTestCase");

        HSSFRow rowhead;


        for (int i = 0; i < urlList.size(); i++) {

            //i - row

            System.out.println("row " + i);

            rowhead = sheet.createRow((short) i);

            //j - column
            for (int j = 0; j < 1; j++) {

//                if (j == 0) {
//                    rowhead.createCell(j).setCellValue(urlStatus.get(i).getUrl());
//                } else {
//                    rowhead.createCell(j).setCellValue(urlStatus.get(i).getStatus());
//                }

                rowhead.createCell(j).setCellValue(urlList.get(i));

                rowhead.getSheet().setColumnWidth(j,17000);

            }


        }

        FileOutputStream fileOut = new FileOutputStream(filename);
        workbook.write(fileOut);
//closing the Stream
        fileOut.close();
//closing the workbook
        workbook.close();
    }


//    public static void addUrlTestCasesInExcel(String excelPath,ArrayList<LinkedHashMap<String,String>> urlStatusList,List<String> urlStatus) throws IOException {
//
//
//
//        HSSFWorkbook workbook = new HSSFWorkbook();
//
//        HSSFSheet sheet = workbook.createSheet("UrlTestCase");
//
//        HSSFRow rowhead;
//
//        rowhead = sheet.createRow((short) 0);
//
//        rowhead.createCell(0).setCellValue("URL");
//
//        rowhead.createCell(1).setCellValue("Status");
//
//
////        for (String name : urlStatusList.ge.keySet())
////            System.out.println("key: " + name);
////
////        // using values() for iteration over values
////        for (String url : gfg.values())
////            System.out.println("value: " + url);
//
//
//        for (int i = 1; i <= urlStatusList.size(); i++) {
//
//            //i - row
//
//            System.out.println("row " + i);
//
//            rowhead = sheet.createRow((short) i);
//
//            //j - column
//            for (int j = 0; j < 1; j++) {
//
//                if (j == 0) {
//                    rowhead.createCell(j).setCellValue(urlStatus.get(i).getUrl());
//                } else {
//                    rowhead.createCell(j).setCellValue(urlStatus.get(i).getStatus());
//                }
//
//                rowhead.createCell(j).setCellValue(urlList.get(i));
//
//                rowhead.getSheet().setColumnWidth(j,17000);
//
//            }
//
//
//        }
//
//        FileOutputStream fileOut = new FileOutputStream(filename);
//        workbook.write(fileOut);
////closing the Stream
//        fileOut.close();
////closing the workbook
//        workbook.close();
//    }



    public static void createExcelSheets(String path) throws IOException {

        //src/main/resources/newExcel.xlsx

        File file = new File(path);


        if(file.exists()){

            System.out.println("Excel Sheet Exist");

            file.delete();

            System.out.println("Excel Sheet Deleted");

            createExcelSheets(path);

        }else{

            System.out.println("Excel Sheet Created");

            //creating an instance of Workbook class
            Workbook wb = new HSSFWorkbook();

            //creates an excel file at the specified location

            OutputStream fileOut = new FileOutputStream(path);

            System.out.println("Excel File has been created successfully.");

            wb.write(fileOut);

        }




    }

    public static void createExcelSheet() throws IOException {

//        String path = "src/main/resources/test.xlsx";



        //creating an instance of Workbook class
        Workbook wb = new HSSFWorkbook();

        //creates an excel file at the specified location

        OutputStream fileOut = new FileOutputStream("src/main/resources/newExcel.xlsx");

        System.out.println("Excel File has been created successfully.");

        wb.write(fileOut);



    }

    public static void main(String[] args) throws IOException {

//        createExcelSheet();

       // addUrlTestCaseInExcel(urlList);

    }
}
