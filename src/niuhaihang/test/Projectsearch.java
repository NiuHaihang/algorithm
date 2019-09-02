package niuhaihang.test;

public class Projectsearch {
	public static String sql;
	public static String cid;	//客户编码,customercode
	public static String cname;//客户名称,customer name
	public static String pname;//项目名称,project name
	public static String status;//级别
	
	public String fellowid;
	
	public void projectsearch(String cid1,String cname1,String pname1,String status1)
	{
		cid=cid1;
		cname=cname1;
		pname=pname1;
		status=status1;
	}
	
	public static String gensql()
	{
		sql="";
		if(pname!=null&&pname!="")
			sql+=" and pname like '%"+pname+"%'";
		if(cname!=null&&cname!="")
			sql+=" and cname like '%"+cname+"%'";
		if(cid!=null&&cid!="")
			sql+=" and customercode like '%"+cid+"%'";
		if(status!=null&&status!="")
			sql+=" and projects.status = "+status;
		System.out.println("HHHH");
		return sql;

	}
	public static void main(String args[]) {
		System.out.println(gensql());
	}
}
