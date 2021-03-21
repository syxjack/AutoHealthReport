package jkrb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class jkrb {
	
	public static void main(String []args) throws ParseException{
//		for(int i=0; i<=4000; i++)
//		{
			//String num = "1017"+String.format("%04d", i);
		 	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		    String start="2021-03-21";
		    String end="2099-12-31";
		    Calendar st=Calendar.getInstance();
		    Calendar ed=Calendar.getInstance();
		    st.setTime(sdf.parse(start));
		    ed.setTime(sdf.parse(end));
		    while(!st.after(ed)){

		     st.add(Calendar.DAY_OF_YEAR,1);
			Map<String, Object> ret = new LinkedHashMap<String, Object>();
			Map<String, Object> finalret = new LinkedHashMap<String, Object>();
			//Map<String, Object> secondret = new LinkedHashMap<String, Object>();
			ret.put("ryid", "124486");
			ret.put("xm", "苏宇星");
			ret.put("xh", "Y55200084");
			ret.put("xydm", "10010900");
			ret.put("xy", "专业学位教育中心");
			ret.put("bj", "2020级MPAcc全日制2班");
			ret.put("xb", "男");
			ret.put("lxdh", "13951086891");
			ret.put("rysf", "研究生");
			ret.put("xq", "徐汇校区");
			ret.put("ss", "徐汇校区-学生23舍-907");
			ret.put("mph", "907");
			ret.put("sfzh", "320102199711211212");
			ret.put("jtzz", "南京市");
			ret.put("jjlxr", "冯进");
			ret.put("jjlxrdh", "13951086891");
			ret.put("fdygh", "L0355");
			ret.put("fdy", "徐洁芸");
			ret.put("swjkzk","健康");
			ret.put("twsfzc", "是");
			ret.put("swdqtw", "");
			ret.put("swbz", "");
			ret.put("jkmsflm", "是");
			ret.put("sfycxxwc", "否");
			ret.put("tUustMrybhdgjs","[]");
			//ret.put("xwjkzk","健康");
			//ret.put("xwdqtw", "华理校草JackSu到此一游");
			//ret.put("xwbz", "");
			ret.put("_ext", "{}");
			ret.put("tjsj", sdf.format(st.getTime())+" 14:00");
			ret.put("tjrq", sdf.format(st.getTime()));
			ret.put("zb", "[]");
			ret.put("__type", "sdo:com.sudytech.work.uust.zxxsmryb.zxxsmryb.TUustZxxsmryb");
			finalret.put("entity", ret);
			JSONObject json = JSONObject.fromObject(finalret);
			System.out.println(json.toString());
			String[] cmds={"curl","-i","-k","-H","Content-type: application/json","-XPOST","-d",json.toString(),
					"http://workflow.ecust.edu.cn/default/work/uust/zxxsmryb/com.sudytech.work.uust.zxxsmryb.xxsmryb.saveOrupte.biz.ext","--cookie"
			        ,"JSESSIONID=010567BF14E42DA48DFB09226C7096AE; route=fcf3c992a240b8e4a7338a7706963847; iPlanetDirectoryPro=CF2J3VE46ueAzwZbgijJeN","-e","http://workflow.ecust.edu.cn/default/work/uust/zxxsmryb/mrybtb.jsp"};
				
			System.out.println(execCurl(cmds));
		    }
		//}
	
	}

	public static String execCurl(String[] cmds) {
        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            return builder.toString();
 
        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
        return null;
 
    }
}
