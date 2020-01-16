package staticData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.apache.commons.io.FileUtils;
import models.TestData;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class GlobleData {
	  private static Connection DBcon=null;
	  private static  WebDriver ChormeDriver=null;
	  private static Properties props=null;
	  private static String server=null;
	  private static TestData inputData=null;
	  private static String ScreenShotDir;
	public static TestData getInputData() {
		return inputData;
	}
	public static Connection getDBcon() {
		return DBcon;
	}
	public static WebDriver getChormeDriver(String key) {
		return ChormeDriver;
	}
	public static Properties getProps() {
		return props;
	}
	public static String getServer() {
		return server;
	}
	public static WebDriver getChormeDriver() {
		return ChormeDriver;
	}
	public static void setChormeDriver(WebDriver chormeDriver) {
		ChormeDriver = chormeDriver;
	}
	public static void setDBcon(Connection dBcon) {
		DBcon = dBcon;
	}
	public static void setProps(Properties props) {
		GlobleData.props = props;
	}
	public static void setServer(String server) {
		GlobleData.server = server;
	}
	public static void setInputData(TestData inputData) {
		GlobleData.inputData = inputData;
	}
	public static void loadData(String fileName) {
		Gson gson = new Gson();
		try {
			JsonReader reader = new JsonReader(new FileReader(fileName));
			inputData=gson.fromJson(reader,TestData.class);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  public GlobleData(String key) {
		  props=new Properties();
		  try {
			  InputStream input = new FileInputStream("C:\\java_config\\Testng\\config.properties");
			  props.load(input);
			  System.out.println("init config file");
			  server=props.getProperty("server");
			  ScreenShotDir=props.getProperty("ScreenShotDir");
			  createShreenShortDirPath();
			  initDBConnection();
	          initDriver(key);
		  } 
		  catch (IOException e) 
		  {
			e.printStackTrace();
		  }

	  }
	  private void createShreenShortDirPath() {
		  Date date = Calendar.getInstance().getTime();  
		  DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");  
		  String strDate = dateFormat.format(date);  
		  ScreenShotDir+="//"+strDate;
		  File fs=new File(ScreenShotDir);
		  if(!fs.exists()) {
			  fs.mkdirs();
			  System.out.println("dir created");
		  }	  
		  
	  }
	  private void initDriver(String key) {
		  String webdriver=GlobleData.props.getProperty("webdriver");
		  String webdriver_path=GlobleData.props.getProperty("webdriver_path");
	      String properties=System.getProperty(webdriver); 
	      System.out.println(key);
		  if(properties==null|| !properties.equals(webdriver_path)) {
		    System.setProperty(webdriver,webdriver_path);
		  }
		  System.out.println(key);
	      DesiredCapabilities capabilities = DesiredCapabilities.chrome();  
          capabilities.setCapability("marionette",true);
		  ChormeDriver= new ChromeDriver(capabilities);  
		 
	  }
	  
	  private void initDBConnection() {
		  try 
		  {
    		  String jdbc_driver=props.getProperty("jdbc_class");
    		  String jdbc_url=props.getProperty("jdbc_url");  
    		  Class.forName(jdbc_driver);
		      DBcon = DriverManager.getConnection(jdbc_url);
			  if (DBcon != null){
			    System.out.println("Connected");
			  }
		  } 
    	 catch (ClassNotFoundException e) {
			e.printStackTrace();
		  } 
    	 catch (SQLException e) {
			e.printStackTrace();
		  }
	  }
	  public static void takeSnapShot(String fileName) throws Exception{
	        TakesScreenshot scrShot =((TakesScreenshot)ChormeDriver);
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(ScreenShotDir+"//"+fileName+".png");
	        FileUtils.copyFile(SrcFile, DestFile);

	    }

}
