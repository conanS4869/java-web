package java.com.conan.learn.tabledatagenerator;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;
import com.alibaba.fastjson.JSON;
import com.conan.learn.tabledatagenerator.HutoolCsvDataGenerator;
import com.conan.learn.tabledatagenerator.Notary;
import com.conan.learn.tabledatagenerator.TableDataGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.UUID;

public class TableDataGeneratorTest {

    private TableDataGenerator generator;
    private long no;

    @BeforeMethod
    public void beforeMethod() {
        generator  = new HutoolCsvDataGenerator();
        //generator = new SimpleCSVDataGenerator();
        no = 0;
    }
    @Test
    public void addNRow() throws Exception {
        String sourcingId = createSourcingId();
        String serialNo = createSerialNo();
        String timestamp = String.valueOf(System.currentTimeMillis());
        String content = createContent();

        String path = "D:\\conan\\bcbpcm.csv";
        for (int i = 0; i < 10000; i++) {
            generator.addRow(sourcingId, serialNo, timestamp, content);

            generator.generate(path);
        }

        CsvRow actual = getRow(path);
        Assert.assertNotNull(actual);

        Assert.assertEquals(actual.get(0), sourcingId);
        Assert.assertEquals(actual.get(1), serialNo);
        Assert.assertEquals(actual.get(2), timestamp);
        String expectedContent = content.replaceAll("\"", "\"\"");
        ;
        Assert.assertEquals(actual.get(3), expectedContent);

    }
    private CsvRow getRow(String filePath) {
        CsvReader reader = CsvUtil.getReader();
        CsvData data = reader.read(FileUtil.file(filePath));
        List<CsvRow> rows = data.getRows();

        if (rows != null && rows.size() > 0) {
            return rows.get(0);
        }
        return null;
    }

    private String createContent() {
        Notary notary = new Notary();
        notary.setId(UUID.randomUUID().toString());
        notary.setName("Tom");
        notary.setText("eat money");
        return JSON.toJSONString(notary);
    }

    private String createSerialNo() {
        String appId = "weixin";
        String timestamp = String.valueOf(System.currentTimeMillis());
        no = no + 1;
        return appId + timestamp + no;
    }

    private String createSourcingId() {
        return UUID.randomUUID().toString();
    }

}
