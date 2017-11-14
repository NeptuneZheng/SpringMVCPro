package util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class MongoDBHelper {
    private static String address = null;
    private static Integer port = null;
    private static String name = null;

    static StringUtil strUtil = new StringUtil();

    public MongoDBHelper() throws FileNotFoundException {
    }

    public static boolean initDBProperty(){
        boolean initStatus = false;
        Properties pro = new Properties();
        try {
//            System.out.println(System.getProperty("user.dir"));
            InputStream in = new BufferedInputStream(new FileInputStream("src/main/resources/mongodb.properties"));
            pro.load(in);
            address = pro.getProperty("mongodb.address");
            port = Integer.valueOf(pro.getProperty("mongodb.port"));
            name = pro.getProperty("mongodb.dbName");
            initStatus = true;
        } catch (FileNotFoundException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }finally {
            return initStatus;
        }
    }

    public static MongoClient getMongoClient(){
        MongoClient mc = null;
        if(initDBProperty()){
            mc = new MongoClient(address,port);
            System.out.println("MongoDB connect sucess!");
        }
        return mc;
    }

    public static MongoDatabase getMongoDatabase(MongoClient mongoClient){
        MongoDatabase md = null;
        if(mongoClient !=null && strUtil.stringNotNull(name) ){
            md = mongoClient.getDatabase(name);
//            md.createCollection("Test");
            System.out.println("Return mongoDB database!");
        }
        return md;
    }

    public static void closeMongoClient(MongoDatabase mongoDataBase,MongoClient mongoClient ) {
        if (mongoDataBase != null) {
            mongoDataBase = null;
        }
        if (mongoClient != null) {
            mongoClient.close();
        }
        System.out.println("CloseMongoClient successfully");
    }

}
