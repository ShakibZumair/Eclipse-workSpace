package com.java.collection.lamda;

//class MyRunnable implements Runnable{
//
//	@Override
//	public void run() {
//		try{
//			for (int i=0 ;i<=10 ;i++) {
//				System.out.println(i);
//				Thread.sleep(1000);
//			}
//		}catch(Exception e) {
//			
//		}
//		
//	}
//	
//	
//
//	
//}
public class ThreadLamda {
	
		   public static void main(String[] args) {
		    new Thread(()->{
		        try {
		            for(int i=0;i<=10;i++) {
		                System.out.print(i);
		                Thread.sleep(1000);
		                System.out.println();
		            }
		                
		        }catch(Exception ex) {}
		    }).start();
		    
		    new Thread(()->{
		        try {
		            String s="vchsAFHSVCAHdBCVSAHSDVbjcsbaKJsa";
		            for(int i=0;i<=10;i++) {
		                System.out.print(s.charAt(i));
		                Thread.sleep(1000);
		                System.out.println();
		            }
		                
		        }catch(Exception ex) {}
		    }).start();
		}
		
}
