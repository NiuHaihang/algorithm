package niuhaihang.test;

import java.util.concurrent.*;
import java.lang.Runtime.*;
import java.io.*;

public class ExecuteTest {
	public static void main(String[] args) {
		final String dir = "C:\\";
		new Thread() {
			public void run() {
				Runtime rt = Runtime.getRuntime();
				Process p= null;
				try {
					p=rt.exec("KnowledgeCollect.exe"+" "+dir);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				final InputStream is1 = p.getInputStream();   
				//获取进程的错误流  
				final InputStream is2 = p.getErrorStream();  
				
				//启动两个线程，一个线程负责读标准输出流，另一个负责读标准错误流  
				new Thread() {  
					public void run() {  
						BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));  
						try {  
							String line1 = null;  
							while ((line1 = br1.readLine()) != null) {  
							if (line1 != null){}  
							}  
						} catch (IOException e) {  
							e.printStackTrace();  
						}  
						finally{  
							try {  
								is1.close();  
							} catch (IOException e) {  
								e.printStackTrace();  
							}  
						}  
					}  
				}.start();  
	                           
				new Thread() {   
					public void  run() {   
						BufferedReader br2 = new  BufferedReader(new  InputStreamReader(is2));   
						try {   
							String line2 = null ;   
							while ((line2 = br2.readLine()) !=  null ) {   
								if (line2 != null){}  
							}   
						} catch (IOException e) {   
							e.printStackTrace();  
						}   
						finally{  
							try {  
								is2.close();  
							} catch (IOException e) {  
								e.printStackTrace();  
							}  
						}  
					}   
				}.start();
				
				try {
					p.waitFor();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				p.destroy();
			}
			
			
		}.start();
		
		
	}
}
