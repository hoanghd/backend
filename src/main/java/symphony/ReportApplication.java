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
			rows.add(new Row("ホアン", 1));
			rows.add(new Row("JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。JAIAが公表している統計資料ページです。", 1));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			rows.add(new Row("Jacqueline Huff", 1));
			rows.add(new Row("Louise Glass", 2));
			
			Map<String,Object> parameters = new HashMap<>();
			parameters.put("companyName","HEADER");
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
