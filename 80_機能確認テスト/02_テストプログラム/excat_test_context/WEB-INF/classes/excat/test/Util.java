package excat.test;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

//import ptn.composite.inf.PtnFile;

public class Util {
	//excat install home
	//private static String excat_home = "C:\\wzhou_app\\excat\\";
	
	//excat test home
	//private static String excat_test_context = "C:\\wzhou_app\\apache-tomcat-5.5.17\\webapps\\excat_test_context\\";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//for debug
		command("11-1");
	}

	public static void command(String caseNo) {
		
		String excat_home = System.getProperty("excat.home");
		String excat_test_context = System.getProperty("excat.test.context");

		System.out.println("EXCAT_HOME=====" + excat_home);
		System.out.println("EXCAT_TEST_CONTEXT=====" + excat_test_context);

		String entryName = excat_test_context + File.separator + "testcase" + File.separator + caseNo 
							+ File.separator + "DumpStack.config";
		
		if(entryName != null) {
			File dir = new File(entryName);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
		    try {
		    	String subcmd = "copy " + entryName + " " + excat_home + File.separator + "DumpStack";
		    	
		    	String osName = System.getProperty("os.name" );
		    	System.out.println("os is ==" + osName);
		    	
	            String[] cmd = new String[3];

	            if( osName.equals( "Windows 95" ) ) {
	                cmd[0] = "command.com" ;
	                cmd[1] = "/C" ;
	                cmd[2] = subcmd;
	            	System.out.println("Execing " + cmd[0] + " " + cmd[1] + " " + cmd[2]);
	            }
	            else if(osName.indexOf("Windows") != -1) {
	            	cmd[0] = "cmd.exe" ;
	                cmd[1] = "/C" ;
	                cmd[2] = subcmd;
	            	System.out.println("Execing " + cmd[0] + " " + cmd[1] + " " + cmd[2]);
	            }
	            else { //linux
	            	cmd = new String[4];
	            	subcmd = excat_home + File.separator + "DumpStack";
	            	cmd[0] = "cp";
	            	cmd[1] = "-f";
	            	cmd[2] = entryName;
	            	cmd[3] = subcmd;
	            	
	            	System.out.println("Execing " + cmd[0] + " " + cmd[1] + " " + cmd[2] + " " + cmd[3]);
	            }
	            
	            Runtime rt = Runtime.getRuntime();
	            Process proc = rt.exec(cmd);
	            	                                    
	            // any error???
	            int exitVal = proc.waitFor();
	            System.out.println("ExitValue: " + exitVal);  
		        
		      } catch (Exception e) {
		        e.printStackTrace();
		      }

		}
	}
	
	
}
