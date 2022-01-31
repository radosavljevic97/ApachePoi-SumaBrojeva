package ExcelSumaBrojeva;

import HerokuappBase.ExcelReader;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SumaBrojeva {
    public static void main(String[] args) throws IOException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\stefa\\IdeaProjects\\SeleniumProject\\Brojevi.xlsx");


        int suma = 0;
        for(int i = 0; i <= excelReader.getLastRow("Brojevi"); i++){
            excelReader.getIntegerData("Brojevi", i, 0);
            suma = suma + excelReader.getIntegerData("Brojevi", i, 0);
        }

        System.out.println("Suma brojeva je: " + suma);
    }


}

