package org.easypr.img;

public class Constants {
	
	
		public static final int[] whiteRGB = new int[]{255,255,255,255,255,255};
	
		public static final int[] yellowRGB = new int[]{255,255,255,255,255,255};
		
		
		//公共的参数，目前已通过的图片：
		//2：京HH8489	通过
		//3：京FS0196	通过
		//6：京QM01G6	通过
		//7：冀GX3499	通过一半
		//1：京QM01G6	不通过，因为车身其他地方有蓝条
		public static final String src_path = "C:/Users/yr/Documents/GitHub/plateRecognition/test4/3.jpg";
		
		public static final int plate_width_divisor = 10;
		public static final int plate_height_divisor = 50;
		public static final int[] blueRGB = new int[]{0,35,15,120,60,240};
		public static final int x1_offset = -0;
		public static final int x2_offset = -0;
		public static final int y1_offset = -5;
		public static final int y2_offset = -5;
		
	
		//京QM01G6	通过
		/*public static final String src_path = "C:/Users/yr/Documents/GitHub/plateRecognition/test4/1.jpg";
	    public static final int plate_width_divisor = 10;
		public static final int plate_height_divisor = 30;
		public static final int[] blueRGB = new int[]{0,35,15,35,60,130};
		public static final int x1_offset = -20;
		public static final int x2_offset = -10;
		public static final int y1_offset = 0;
		public static final int y2_offset = -20;*/
		
		
		//（黄色车牌）京AA8322
	/*	
	 	public static final String src_path = "C:/Users/yr/Documents/GitHub/plateRecognition/test4/1.jpg";
	 	public static final int plate_width_divisor = 10;
		public static final int plate_height_divisor = 50;
		public static final int[] blueRGB = new int[]{200,255,140,220,0,50};
		public static final int x1_offset = -0;
		public static final int x2_offset = -0;
		public static final int y1_offset = -15;
		public static final int y2_offset = -15;*/

}
