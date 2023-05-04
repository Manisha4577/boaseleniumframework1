package boauiflip.testdatareader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReader {
	
	
	//Please review it
	public Map<Integer, List<Object>> readxlsFile(String xlsFileName,String subsheet)
	{
		Map<Integer, List<Object>> map=new LinkedHashMap<Integer, List<Object>>();
		try {
			
			String path=System.getProperty("user.dir")+"\\testdata\\"+xlsFileName;
			FileInputStream file=new FileInputStream(path);
			
			Workbook book=WorkbookFactory.create(file);
			Sheet sheet=book.getSheet(subsheet);
			
			Iterator<Row> itr=sheet.iterator();
			
			while(itr.hasNext())
			{
				List<Object> rowlist=new ArrayList<Object>();
				Row row=itr.next();
				
				Iterator<Cell> cellitr=row.cellIterator();
				int i=0;
				while(cellitr.hasNext())
				{
					
					
					Cell cellvalue=cellitr.next();
					
					
					switch (cellvalue.getCellType()) {
					case STRING:
						rowlist.add(cellvalue.getStringCellValue());
						break;
						
					case BOOLEAN:
						
						rowlist.add(cellvalue.getBooleanCellValue());
						
						break;
						
					case NUMERIC:
						rowlist.add(cellvalue.getNumericCellValue());
						break;
						
					case FORMULA:
						
						rowlist.add(cellvalue.getCellFormula());
						
						break;
						
						
					case BLANK:
						
						rowlist.add("Blank");
						break;

					default:
						System.out.println("Please check your code");
						break;
					}
					
				}
				
				map.put(i, rowlist);
				i++;
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
		
		
		
		
		
	}
	
	
	

}
