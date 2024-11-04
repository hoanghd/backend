package symphony;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import symphony.model.Row;

public class ReportApplication {

	public static void main(String[] args) {
		try {
			List<Row> rows = new ArrayList<>();
			rows.add(new Row("JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。", 1));
			rows.add(new Row("Jacqueline Huff Jacqueline Huff Jacqueline Huff Jacqueline Huff", 2));
			rows.add(new Row("Jacqueline Huff", 3));
			rows.add(new Row("Louise Glass", 4));
			rows.add(new Row("Jacqueline Huff", 5));
			rows.add(new Row("Louise Glass", 6));
			rows.add(new Row("Jacqueline Huff", 7));
			rows.add(new Row("Louise Glass", 8));
			rows.add(new Row("Jacqueline Huff", 9));
			rows.add(new Row("Louise Glass", 10));
			rows.add(new Row("Jacqueline Huff", 11));
			rows.add(new Row("Louise Glass", 12));
			rows.add(new Row("Jacqueline Huff", 13));
			rows.add(new Row("Louise Glass", 14));
			rows.add(new Row("Jacqueline Huff", 15));
			rows.add(new Row("Louise Glass", 16));
			rows.add(new Row("Jacqueline Huff", 17));
			rows.add(new Row("Louise Glass", 18));
			rows.add(new Row("Jacqueline Huff", 19));
			rows.add(new Row("Louise Glass", 20));
			rows.add(new Row("Jacqueline Huff", 21));
			rows.add(new Row("Louise Glass", 22));
			rows.add(new Row("Jacqueline Huff", 23));
			rows.add(new Row("Louise Glass", 24));
			rows.add(new Row("Jacqueline Huff", 25));
			rows.add(new Row("Louise Glass", 26));
			rows.add(new Row("Jacqueline Huff", 27));
			rows.add(new Row("Louise Glass", 28));
			rows.add(new Row("Jacqueline Huff", 29));
			rows.add(new Row("Louise Glass", 30));
			rows.add(new Row("Jacqueline Huff", 31));
			rows.add(new Row("Louise Glass", 32));
			
			Map<String,Object> parameters = new HashMap<>();
			parameters.put("companyName","header");
			parameters.put("rowsDataSet", new JRBeanCollectionDataSource(rows));
			
			JasperReport report = JasperCompileManager.compileReport("/Users/hoang-hd/Documents/symphony/src/main/resources/templates/report.jrxml");
			JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(print, "/Users/hoang-hd/Documents/symphony/src/main/resources/static/report.pdf");
			System.out.println("Report Generated Successfully");
			
			
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}
