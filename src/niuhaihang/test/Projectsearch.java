package niuhaihang.test;

public class Projectsearch {
	public static String sql;
	public static String cid;	//�ͻ�����,customercode
	public static String cname;//�ͻ�����,customer name
	public static String pname;//��Ŀ����,project name
	public static String status;//����
	
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
