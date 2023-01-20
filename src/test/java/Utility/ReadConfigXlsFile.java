package Utility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadConfigXlsFile extends BaseClass {
	public ReadConfigXlsFile() {
		// TODO Auto-generated constructor stub
	}

	public static Map<String, Map<String, String>> setMapData() {

		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();
		Map<String, String> dataMap = new HashMap<String, String>();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src/test/resources/testData/Config_Demo.xls");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int lastRow = sheet.getLastRowNum();
			// Looping over entire row
			for (int i = 0; i <= lastRow; i++) {
				Row row = sheet.getRow(i);
				// 1st Cell as Value
				Cell valueCell = row.getCell(1);
				valueCell.setCellType(CellType.STRING);
				// 0th Cell as Key
				Cell keyCell = row.getCell(0);
				keyCell.setCellType(CellType.STRING);
				String value = valueCell.getStringCellValue().trim();
				String key = keyCell.getStringCellValue().trim();
				// Putting key & value in dataMap
				dataMap.put(key, value);
				// Putting dataMap to excelFileMap
				excelFileMap.put("DataSheet", dataMap);
			}
			// Returning excelFileMap
			return excelFileMap;
		} catch (Exception e) {
			logger.error(e);
		}
		return excelFileMap;
	}

	// Method to retrieve value
	public static String getMapData(String key) {
		try {
			Map<String, String> m = setMapData().get("DataSheet");
			String value = m.get(key);
			return value;
		} catch (Exception e) {
			System.out.println(e);
			logger.error(e);
		}
		return null;

	}

	
}
