import org.apache.spark.sql.*;

import java.util.Properties;

import static org.apache.spark.sql.functions.*;


public class LoadPhysicianMaster {


    public static void main(String[] args) {
        //Args[0] contain properties filename
        SparkSession spark = SparkSession
                .builder()
                .appName("PhysicianMasterLoad")
                .master("local")
                .getOrCreate();

        spark.conf().set("spark.testing.memory", "2147480000");         // if you face any memory issue
        Dataset<Row> ds = spark.emptyDataFrame();
        ds.show();
    }
}
