package core.docx;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SessionReader {
    private String folderPath;

    SessionReader(String folderPath) {
        this.folderPath = folderPath;
    }

    Map<String,String> sessionMap(){
        File[] list = filesList();
        Map<String,String> map =new HashMap<>();
        for (File docx : list){
            String docxName = docx.getPath();
            String docxContent = readDocx(docxName);
            map.put(docxName,docxContent);
        }
        return map;
    }

    private File[] filesList(){
        File dir = new File(folderPath);
        return dir.listFiles((file, name) -> name.endsWith(".docx"));
    }

    private String readDocx(String docxName){
        XWPFDocument docx = new XWPFDocument();
        try {
            docx = new XWPFDocument(new FileInputStream(docxName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        return we.getText();
    }
}
