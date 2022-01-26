package com.example.w2p;

import com.aspose.words.Document;
import org.springframework.stereotype.Service;

@Service
public class W2PService {

    public void convert2Pdf() throws Exception {
        Document document = new Document("file/CV.docx");
        document.save("file/CV.pdf");
    }
}
