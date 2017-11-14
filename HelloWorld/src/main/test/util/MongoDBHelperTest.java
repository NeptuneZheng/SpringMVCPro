package util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import junit.framework.TestCase;

public class MongoDBHelperTest extends TestCase {
    public void testInitDBProperty() throws Exception {
        assertTrue(MongoDBHelper.initDBProperty());
    }

    public void testGetMongoClient() throws Exception {
        MongoDBHelper.getMongoClient();
    }

    public void testGetMongoDatabase() throws Exception {
        MongoDBHelper.getMongoDatabase(MongoDBHelper.getMongoClient());
    }

    public void testCloseMongoClient() throws Exception {
        MongoClient mc = MongoDBHelper.getMongoClient();
        MongoDatabase md = MongoDBHelper.getMongoDatabase(mc);
        MongoDBHelper.closeMongoClient(md,mc);
    }

}